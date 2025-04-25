/*  Nama File    : TestPolimorfisme.java 
 *  Deskripsi    : Kelas main untuk demo Pegawai, Manager, Programmer
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package PostTest;
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        Programmer pegawai4 = new Programmer("Rahmat");
        Programmer pegawai5 = new Programmer("Zikry");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps){
            emp.tampilData();
        }

    }    
}

/* Jelaskan manfaat polimorfisme pada kasus ini?
 * Jawab: Polimorfisme memungkinkan program untuk menangani objek dari berbagai kelas yang berbeda 
 * dengan cara yang seragam. 
 * 
 * Pada contoh ini, meskipun variabel bertipe Pegawai, objek yang sebenarnya 
 * dapat berupa Manajer atau Programmer. 
 * Dengan polimorfisme, kita bisa menyimpan objek-objek tersebut dalam satu koleksi (ArrayList) 
 * bertipe Pegawai dan memanggil metode tampilData() yang telah di-override di setiap kelas turunan,
 * tanpa perlu khawatir dengan jenis objek yang berbeda. 
 * 
 * Ini memudahkan pemeliharaan dan pengembangan kode karena kita hanya bekerja dengan 
 * tipe referensi yang umum (superclass), tapi tetap mendapatkan perilaku yang spesifik 
 * sesuai dengan tipe objek aslinya (subclass).
 */

 
/* Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! 
 * Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
 * Jawab: Jika kita tidak menggunakan polimorfisme, kita harus membuat 
 * tipe yang berbeda untuk setiap pegawai (Manajer, Programmer, dll). 
 * Misalnya, tanpa polimorfisme, kita harus mendeklarasikan dua ArrayList berbeda, 
 * satu untuk Manajer dan satu untuk Programmer. 
 *  
 * Jika tanpa polimorfisme, kita tidak dapat menambahkan pegawai4 dan pegawai5 ke dalam 
 * array `emps` yang bertipe `ArrayList<Pegawai>`, karena pegawai4 dan pegawai5 
 * adalah objek bertipe `Programmer`. 
 * Tanpa polimorfisme, tipe objek yang berbeda tidak bisa disatukan dalam koleksi bertipe sama, 
 * hal ini akan menyebabkan error karena tipe data yang tidak cocok.
 * Oleh karena itu, dengan menggunakan polimorfisme, kita dapat menyatukan 
 * objek dengan tipe yang berbeda dalam satu koleksi, seperti yang dilakukan dalam kode ini.
 */