/* Nama File   : DiskonLambda.java
 * Deskripsi   : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 * Pembuat     : Regina Sasikirana Farikh (24060123140155)
 * Tanggal     : 5 Juni 2025
 */

// Interface  IDiskon untuk menghitung nilai diskon (double)
interface IDiskon {
    public double hitungDiskon(int harga);
}

// Deklarasi kelas utama DiskonLambda
public class DiskonLambda {
    public static void main(String[] args) {
        // --- Implementasi tanpa lambda (kelas anonim) ---
        // Membuat objek IDiskon bernama 'diskonMerdeka' menggunakan kelas anonim.
        IDiskon diskonMerdeka = new IDiskon() {
            // Implementasi metode hitungDiskon, menghitung diskon 30% dari harga.
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // --- Implementasi dengan lambda (single expression) ---
        // Membuat objek IDiskon bernama 'diskonLebaran' menggunakan ekspresi lambda.
        // Body method hanya satu baris, tanda kurung kurawal ({}) bisa dihilangkan dan nilai return secara implisit dikembalikan.
        // Lambda ini menghitung diskon 40% dari harga
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // --- Implementasi dengan lambda (blok statement) ---
        // Membuat objek IDiskon bernama 'diskonBiasa' menggunakan ekspresi lambda
        // Digunakan ketika logika lebih dari satu baris atau memerlukan statement eksplisit 'return'.
        // Lambda ini menghitung diskon 10% dari harga.
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // --- Menampilkan hasil perhitungan diskon ---
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}