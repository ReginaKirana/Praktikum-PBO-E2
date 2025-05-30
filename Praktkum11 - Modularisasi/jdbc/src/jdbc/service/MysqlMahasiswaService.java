/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Nama File    : MysqlMahasiswaService.java
 * Deskripsi    : Kelas service untuk mengelola operasi database (CRUD)
 *                pada tabel mahasiswa menggunakan MySQL
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : Kamis, 22 Mei 2025  
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
    // Objek koneksi ke database
    Connection koneksi = null;
    
    // Konstrukto: membuat koneksi ke database saat objek diinisialisasi
    public MysqlMahasiswaService() {
        koneksi = getConnection();
    }

    // Membuat objek Mahasiswa kosong
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    // Menambahkan data mahasiswa ke dalam database
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
    
    // Memperbarui data mahasiswa berdasarkan id
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
    
    // Menghapus data mahasiswa berdasarkan id
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
    
    // Mengambil data mahasiswa berdasarkan id
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
    
    // Mengambil semua data mahasiswa dalam bentuk list
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
    
    // Mereset auto increment id pada tabel mahasiswa
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
    
    // Menutup koneksi ke database
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

}