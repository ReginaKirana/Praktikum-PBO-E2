/*  Nama File    : MainAnabul.java 
 *  Deskripsi    : Kelas main untuk demo Anabul, Kucing, Anjing, Burung
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */  

package Tugas_3_6;
import java.util.ArrayList;
public class MainAnabul {
    public static void main(String[] args) {
        // Membuat objek Kucing, Anjing, dan Burung yang bertipe Anabul
        Anabul hewan1 = new Kucing("Milo");
        Anabul hewan2 = new Anjing("Rocky");
        Anabul hewan3 = new Burung("Luna");

        // Menambahkan objek-objek hewan ke dalam ArrayList
        ArrayList<Anabul> animal = new ArrayList<>();
        animal.add(hewan1);
        animal.add(hewan2);
        animal.add(hewan3);

        // Mensimulasikan bunyi dan gerakan setiap hewan
        System.out.println("SIMULASI HEWAN PELIHARAAN");
        System.out.println("=========================");

        // Menggunakan loop untuk memanggil metode Bersuara dan Gerak pada setiap objek hewan
        for (Anabul hewan : animal){
            System.out.println("\nNama: " + hewan.Nama);
            hewan.Bersuara();
            hewan.Gerak();
        }
    }
}

/* Kesimpulan:
 * Dalam kasus ini, polimorfisme binding terjadi pada saat runtime (dynamic method dispatch).
 * Metode `Gerak()` dan `Bersuara()` yang dipanggil pada objek `Anabul`
 * akan menyesuaikan dengan implementasi yang ada pada kelas turunan (Kucing, Anjing, Burung).
 * Hal ini menunjukkan bagaimana Java memilih metode yang tepat berdasarkan objek yang ada
 * pada saat eksekusi program, meskipun tipe referensinya adalah kelas induk (Anabul).
 * Dengan polimorfisme ini, kita dapat memanfaatkan pewarisan untuk mengelompokkan berbagai 
 * jenis hewan dalam satu tipe referensi, dan program tetap berfungsi dengan benar sesuai dengan 
 * spesifikasi tiap jenis hewan yang diwakili.
 */