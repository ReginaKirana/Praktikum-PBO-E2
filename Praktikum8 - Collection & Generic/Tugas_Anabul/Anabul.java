/*  Nama File    : Anabul.java 
 *  Deskripsi    : Kelas abstract representasi Anabul sebagai superclass
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */  

package Tugas_Anabul;
public abstract class Anabul {
    // Atribut
    protected String Nama;
 
    // Konstruktor
    public Anabul(String nama){
        this.Nama = nama;
    }

    public String toString() {
        return this.Nama;  // nama hewan
    }
    
    // Method yang akan di-override oleh kelas anak
    // Method absract untuk menampilkan gerakan dasar hewan
    public abstract void Gerak();
    // Method abstract untuk menampilkan suara dasar hewan
    public abstract void Bersuara();
}
