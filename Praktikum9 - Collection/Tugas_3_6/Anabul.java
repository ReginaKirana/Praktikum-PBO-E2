/*  Nama File    : Anabul.java 
 *  Deskripsi    : Kelas representasi Anabul sebagai superclass
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */  

package Tugas_3_6;
public class Anabul {
    // Atribut
    protected String Nama;

    // Konstruktor
    public Anabul(String nama){
        this.Nama = nama;
    }

    public String getNama(){
        return Nama;
    }

    // Method yang akan di-override oleh kelas anak
    // Method untuk menampilkan gerakan dasar hewan
    public void Gerak(){
        System.out.println(Nama + " bergerak");
    }

    // Method untuk menampilkan suara dasar hewan
    public void Bersuara(){
        System.out.println(Nama + " bersuara");
    }
}