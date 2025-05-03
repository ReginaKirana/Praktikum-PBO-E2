// Nama File    : ContohMetodeGenerik.java 
// Deskripsi    : Contoh penggunaan metode generik dengan batasan tipe (bounded type)
//                yang hanya menerima objek turunan dari kelas Anabul
// Pembuat      : Regina Sasikirana Farikh (24060123140155)  
// Tanggal      : Kamis, 1 Mei 2025  

package Tugas_Anabul;
public class ContohMetodeGenerik {
    // ===============================================================
    // <T extends Anabul> artinya T harus merupakan turunan dari Anabul
    // Ini menjamin bahwa objek memiliki metode gerak() dan bersuara()
    // ===============================================================

    // Metode generik untuk menampilkan nama Anabul
    public static <T extends Anabul> void tampilkanNama(Datum<T> datum) {
        System.out.println("Nama hewan: " + datum.getIsi());
    }

     // Metode generik untuk menyuruh hewan melakukan aksi khusus
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        datum.getIsi().Gerak();
        datum.getIsi().Bersuara();
    }
}