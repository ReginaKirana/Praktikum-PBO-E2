/*  Nama File    : Kucing.java 
 *  Deskripsi    : Kelas representasi Kucing sebagai subclass Anabul
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */  

package Tugas_Anabul;
public class Kucing extends Anabul {
    // Konstruktor
    public Kucing(String Nama) {
        super(Nama);
    }

    // Override method Gerak untuk menyesuaikan gerakan kucing
    @Override
    public void Gerak() {
        System.out.println(Nama + " berjalan dengan melata");
    }

    // Override method Bersuara untuk menyesuaikan suara kucing
    @Override
    public void Bersuara() {
        System.out.println(Nama + " berbunyi: meong");
    }

    // Override method getJenis untuk mengetahui jenis spesifik Datum (jika Datum berupa anabul)
    @Override
    public String getJenis() {
        return "Kucing";
    }

}