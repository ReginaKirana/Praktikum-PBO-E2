/*  Nama File    : Burung.java 
 *  Deskripsi    : Kelas representasi Burung sebagai subclass Anabul
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */ 

package Tugas_Anabul;
public class Burung extends Anabul {
    // Konstruktor
    public Burung(String nama) {
        super(nama);
    }

    // Override method Gerak untuk menyesuaikan gerakan burung
    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan terbang");
    }

    // Override method Bersuara untuk menyesuaikan suara burung
    @Override
    public void Bersuara() {
        System.out.println(Nama + " berbunyi: cuit");
    }

    // Override method getJenis untuk mengetahui jenis spesifik Datum (jika Datum berupa anabul)
    @Override
    public String getJenis() {
        return "Burung";
    }
}