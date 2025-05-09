/* Nama File    : MapTest.java 
 * Deskripsi    : Program yang menggunakan Generic
 *                untuk pasangan Kunci-Nilai
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : Kamis, 8 Mei 2025 
*/ 

import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        // Kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        
        // bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci ? tulis pada laporan ada!
        // Petunjuk : gunakan iterasi seperti program ArrayListTest
        // Iterasi untuk mengambil seluruh pasangan kunci-nilai
        // Langkah-langkah:
        // 1. Lakukan perulangan terhadap setiap elemen dalam Set key
        // 2. Gunakan map.get(kunci) untuk mengambil nilai dari setiap kunci
        for (Integer i : key){
            System.out.println(i + " " + map.get(i));
        }
    }
}
