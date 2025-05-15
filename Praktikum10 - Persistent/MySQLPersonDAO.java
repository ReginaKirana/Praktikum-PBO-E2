/* Nama File    : MySQLPersonDAO.java
 *  Deskripsi    : Implementasi PersonDAO untuk MySQL
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 15 Mei 2025  
*/  

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    // Implementasi method untuk menyimpan objek Person ke database MySQL
    public void savePerson(Person person) throws Exception{
        // Mengambil nama dari objek person
        String name = person.getName();
        
        // Memuat driver JDBC untuk MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Membuat koneksi ke database
        // (ubah URL, username, dan password sesuai konfigurasi lokal)
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/pbo", "root", "Sungchan8@1"
            );

        // Menyusun query SQL untuk memasukkan data ke tabel person
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);  // Menampilkan query ke konsol (opsional, untuk debugging)

        // Membuat statement dan menjalankan query
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Menutup koneksi setelah query dijalankan
        con.close();
    }
}