 /* Nama File    : Person.java
 *  Deskripsi    : Person database model
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 15 Mei 2025  
 */  

public class Person {
    // ==== Atribut ====
    private int id;
    private String name;

    // ==== Konstruktor ====
    // Konstruktor untuk membuat objek Person dengan nama saja
    public Person(String n){
        name = n;
    }
    // Konstruktor untuk membuat objek Person dengan id dan nama
    public Person(int i, String n){
        id = i;
        name = n;
    }

    // ==== Method ====
    // Method untuk mendapatkan nilai id
    public int getId(){
        return id;
    }

    // Method untuk mendapatkan nilai name (nama)
    public String getName(){
        return name;
    }
}
