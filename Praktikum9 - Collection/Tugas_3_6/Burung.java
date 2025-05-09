/*  Nama File    : Burung.java 
 *  Deskripsi    : Kelas representasi Burung sebagai subclass Anabul
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */ 

package Tugas_3_6;
public class Burung extends Anabul {
    // Konstruktor  
    public Burung(String nama){
        super(nama);
    }

    // Override method Gerak untuk menyesuaikan gerakan burung
    @Override
    public void Gerak(){
        System.out.println(Nama + " terbang");
    }

    // Override method Bersuara untuk menyesuaikan suara burung
    @Override
    public void Bersuara(){
        System.out.println(Nama + " bersuara cuit");
    }
}