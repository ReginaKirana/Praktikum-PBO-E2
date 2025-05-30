/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Nama File    : MysqlUtility.java
 * Deskripsi    : Kelas utilitas untuk membuat dan mengelola koneksi ke database MySQL
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : Kamis, 22 Mei 2025  
 */

package jdbc.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class MysqlUtility {
    // Objek koneksi bersifat static agar hanya satu instance yang digunakan
    private static Connection koneksi;

    // Method untuk mendapatkan koneksi ke database
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Memuat driver JDBC MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3307/jdbc_mhs";
                // sesuaikan username dan password
                String user = "root";
                String password = "Sungchan8@1";

                // Membuat koneksi ke database
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}