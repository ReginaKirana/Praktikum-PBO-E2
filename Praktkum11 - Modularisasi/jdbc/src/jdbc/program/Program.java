/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Nama File    : Program.java
 * Deskripsi    : Program utama untuk menguji operasi CRUD (Create, Read, Update, Delete) 
 *                pada data mahasiswa menggunakan service JDBC
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : Kamis, 22 Mei 2025  
 */

package jdbc.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author LENOVO
 */
public class Program {
    // Inisialisasi service untuk operasi database
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) throws SQLException {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println();

        // insert
        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa(4, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("===update===");
        Mahasiswa mhsUpdate = service.getById(4);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete===");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(4);
        displayAll();
    }
    
    // Menampilkan seluruh data Mahasiswa dari database
    public static void displayAll() throws SQLException {
        System.out.println("===DisplayAll===");
        List<Mahasiswa> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("Tabel kosong");
        } else {
            for (Mahasiswa m : list) {
                System.out.println(m.toString());
            }
        }
    }
}