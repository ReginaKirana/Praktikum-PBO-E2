/* Nama File    : ContohMetodeGenerik.java 
 * Deskripsi    : Contoh penggunaan metode generik dengan batasan tipe (bounded type)
 *                yang hanya menerima objek turunan dari kelas Anabul
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : Kamis, 1 Mei 2025 
*/ 

package Tugas_Anabul;
public class ContohMetodeGenerik {
    // ===============================================================
    // <T extends Anabul> artinya T harus merupakan turunan dari Anabul
    // Ini menjamin bahwa objek memiliki metode gerak() dan bersuara()
    // ===============================================================
    // Metode generik untuk menampilkan nama Anabul
    public static <T> void tampilkanNama(Datum<T> datum) {
        System.out.println("Nama Datum: " + datum.getIsi());
    }

    // Metode generik untuk menampilkan informasi dari objek Datum
    public <T> void printInfo(Datum<T> datum) {
        System.out.println("Menampilkan informasi Datum:");
        datum.printInfo();
    }
        
    // Metode generik untuk membuat dan mengembalikan objek Datum baru
    public <T> Datum<T> makeDatum(T isi) {
        return new Datum<>(isi);
    }
        

    // Metode generik untuk memproses Anabul dalam Datum
    public <T extends Anabul> void prosesAnabul(Datum<T> datum) {
        T anabul = datum.getIsi();
        System.out.println("Memproses Anabul: " + anabul.toString());
        anabul.Gerak();
        anabul.Bersuara();
        System.out.println("---------------------------");
    }
        
    // Metode untuk membandingkan dua objek Datum
    public <T, U> void bandingkanDatum(Datum<T> datum1, Datum<U> datum2) {
        System.out.println("Membandingkan dua objek Datum:");
        System.out.println("Datum 1:");
        datum1.printInfo();
        System.out.println("Datum 2:");
        datum2.printInfo();
    }
}