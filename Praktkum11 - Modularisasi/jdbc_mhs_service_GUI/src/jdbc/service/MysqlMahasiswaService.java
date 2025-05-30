/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*  Nama File    : MysqlMahasiswaService.java
 *  Deskripsi    : Kelas service untuk operasi CRUD pada tabel
                   mahasiswa di database MySQL
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 22 Mei 2025  
*/

package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.*;
import jdbc.service.*;
import jdbc.utilities.MysqlUtility;
import static jdbc.utilities.MysqlUtility.getConnection;

/**
 *
 * @author LENOVO
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // Konstruktor untuk membuka koneksi ke database
    public MysqlMahasiswaService() {
        koneksi = getConnection();
    }
    
    // Membuat objek mahasiswa kosong
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    // Menambahkan data mahasiswa (dengan ID dan nama)
    public void add(Mahasiswa mhs) throws SQLException {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES ("+mhs.getId()+", '" + mhs.getNama() + "')";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Menambahkan data mahasiswa berdasarkan ID
    public void update(Mahasiswa mhs) throws SQLException {
        String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }   
    }
    
    // Mengupdate nama mahasiswa berdasarkan ID
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Mengambil data mahasiswa berdasarkan ID
    public Mahasiswa getById(int id) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }
    
    // Mengambil semua data mahasiswa
    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> mhsList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mhsList.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhsList;
    }
    
    // Mereset auto-increment ID di tabel mahasiswa
    public void indexReset() throws SQLException {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil reset indeks");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Mengecek apakah tabel mahasiswa kosong
    public boolean isEmpty() {
        String query = "SELECT COUNT(*) FROM mahasiswa";

        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    // Menutup koneksi database
    public void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi ditutup");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
    // Menambahkan data Mahasiswa (hanya nama, ID auto increment)
    public void add(String nama) {
         String query = "INSERT INTO mahasiswa (nama) VALUES('" + nama + "')";
    try {
        Statement s = koneksi.createStatement();
        s.executeUpdate(query);
        System.out.println("Berhasil insert");
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }
}