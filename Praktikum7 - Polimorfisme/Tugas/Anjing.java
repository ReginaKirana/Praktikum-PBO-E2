/*  Nama File    : Anjing.java 
 *  Deskripsi    : Kelas representasi Anjing sebagai subclass Anabul
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Tugas;
public class Anjing extends Anabul{ 
    // Konstruktor  
    public Anjing(String nama){
       super(nama);
    }

    // Override method Gerak untuk menyesuaikan gerakan anjing
    @Override
    public void Gerak(){
        System.out.println(Nama + " melata");
    }

    // Override method Bersuara untuk menyesuaikan suara anjing
    @Override
    public void Bersuara(){
        System.out.println(Nama + " bersuara: guk-guk");
    }
}