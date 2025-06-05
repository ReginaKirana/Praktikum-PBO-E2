/* Nama File   : LambdaList.java
 * Deskripsi   : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat     : Regina Sasikirana Farikh (24060123140155)
 * Tanggal     : 5 Juni 2025
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        // Membuat objek ArrayList baru yang akan menyimpan elemen bertipe String
        ArrayList<String> mahasiswaList = new ArrayList<>();
        
        // Menambahkan elemen (nama mahasiswa) ke dalam ArrayList.
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama)-> System.out.println(nama));
    }
}
