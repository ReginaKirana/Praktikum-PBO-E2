/*  Nama File    : Kucing.java 
 *  Deskripsi    : Kelas representasi Kucing sebagai subclass Anabul
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */  

package Tugas_3_6;
public class Kucing extends Anabul {
    // Konstruktor  
    public Kucing(String nama){
        super(nama);
    }

    // Override method Gerak untuk menyesuaikan gerakan kucing
    @Override
    public void Gerak(){
        System.out.println(Nama + " melata");
    }

    // Override method Bersuara untuk menyesuaikan suara kucing
    @Override
    public void Bersuara(){
        System.out.println(Nama + " bersuara meong");
    }
}