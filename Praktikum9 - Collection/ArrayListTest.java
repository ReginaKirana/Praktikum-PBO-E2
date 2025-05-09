/* Nama File    : ArrayListTest.java 
 * Deskripsi    : Program penggunaan objek ArrayList sebagai 
 *                Collection Class
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : Kamis, 8 Mei 2025 
*/ 

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // Menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // Menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for (String s : strings){
            System.out.println(s + " ");
        }
    }
}

/* java.util.ArrayList adalah struktur data berbasis array 
 * yang dapat menyimpan objek dalam jumlah fleksibel, 
 * serta menyediakan berbagai metode untuk manipulasi data seperti 
 * menambahkan, menghapus, dan mengakses elemen. */