/*  Nama File    : SerializePerson.java
 *  Deskripsi    : Program untuk serialize objek Person
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 15 Mei 2025  
*/  

package Serialize;
import java.io.*;

// Kelas Person yang mengimplementasikan Serializable agar bisa disimpan ke file
class Person implements Serializable {
    // ==== Atribut ====
    private String name;

    // ==== Konstruktor ====
    public Person(String n) {
        name = n;
    }

    // Method untuk mengambil nama
    public String getName() {
        return name;
    }
}

// Class SerializePerson
// Kelas utama untuk melakukan proses serialisasi
public class SerializePerson {
    public static void main(String[] args) {
        // Membuat objek Person dengan nama "Panji"
        Person person = new Person("Panji");

        try {
            // Membuka stream ke file "person.ser" untuk menulis objek
            FileOutputStream f = new FileOutputStream("person.ser");

             // Membungkus file stream dengan ObjectOutputStream untuk menulis objek
            ObjectOutputStream s = new ObjectOutputStream(f);

            // Menulis objek person ke dalam file
            s.writeObject(person);
            
            // Memberi tahu bahwa proses serialisasi selesai
            System.out.println("selesai menulis objek person");

            // Menutup stream
            s.close();
        } catch (IOException e) {
            // Menangani jika terjadi error saat serialisasi
            e.printStackTrace();
        }
    }
}