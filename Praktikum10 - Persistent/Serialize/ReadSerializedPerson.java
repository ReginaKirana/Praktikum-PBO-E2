package Serialize;
/*  Nama File    : ReadSerializedPerson.java
 *  Deskripsi    : Program untuk membaca (deserialize) objek Person dari file
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 15 Mei 2025  
*/  

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        try {
            // Membuka file input stream dari file yang berisi objek yang telah diserialisasi
            FileInputStream f = new FileInputStream("person.ser");

            // Membungkusnya dengan ObjectInputStream untuk membaca objek
            ObjectInputStream s = new ObjectInputStream(f);

            // Membaca objek dari file dan melakukan casting ke tipe Person
            person = (Person) s.readObject();

            // Menutup stream
            s.close();

            // Menampilkan data dari objek yang berhasil dideserialisasi
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            // Menangani berbagai jenis exception: IOException, ClassNotFoundException, dll
            ioe.printStackTrace();
        }
    }
}