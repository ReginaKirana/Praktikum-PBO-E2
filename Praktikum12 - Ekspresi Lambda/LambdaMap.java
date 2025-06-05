/* File      : LambdaMap.java
 * Deskripsi : Menampilkan key & value dari map menggunakan lambda
 * Pembuat   : Regina Sasikirana Farikh (24060123140155)
 * Tanggal   : 5 Juni 2025
 */

// HashMap adalah implementasi dari antarmuka Map yang menyimpan pasangan key-value.
import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat sebuah Map untuk menyimpan NIM dan Nama Mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Menambahkan data ke dalam Map
        mahasiswaMap.put("24060123140155", "Regina Sasikirana Farikh");
        mahasiswaMap.put("24060123120021", "Park Wonbin");
        mahasiswaMap.put("24060123130125", "Shin Junghwan");
        mahasiswaMap.put("24060123140173", "Park Jungwoon");

        // Mencetak judul untuk output
        System.out.println("----- Data Mahasiswa -----");

        // ForEach dengan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}