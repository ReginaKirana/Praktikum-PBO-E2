/*  Nama File    : Person.java 
 *  Deskripsi    : Kelas representasi Person (superclass)
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Person_Optional;
public class Person {
    // Atribut
    private String name;

    // Konstruktor
    public Person(String name) {this.name = name;}

    // Metode untuk mengecek apakah orang tersebut sedang tidur berdasarkan jam (hr)
    // Tidur jika jam lebih dari 22 atau kurang dari 7
    public boolean isAsleep(int hr) {return hr > 22 || hr < 7;}
    
    // Override metode toString untuk menampilkan nama orang
    public String toString() {return name;}

    // Metode untuk menampilkan status online atau offline berdasarkan jam
    public void  status(int hr){
        if (this.isAsleep(hr))
            System.out.print("Now offline: " + this);
        else
            System.out.println("Now online: " + this);    
    }
}