/* Nama File    : Datum.java 
 * Deskripsi    : Kelas generic yang dapat menyimpan data bertipe fleksibel
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : Kamis, 1 Mei 2025  
*/

package Tugas_Anabul;
// ===============================================
// Kelas Datum<T> merupakan kelas GENERIC
// - T adalah parameter tipe (bisa diganti dengan tipe apapun saat digunakan)
// - Dengan generic, kita bisa membuat kelas yang fleksibel dan type-safe
// ===============================================
public class Datum<T> {
    // Variabel isi akan menyimpan data dari tipe T (generik)
    private T isi;

    // Konstruktor untuk menginisialisasi isi
    public Datum(T isi) {
        this.isi = isi;
    }

    // Method untuk mengambil nilai isi
    public T getIsi() {
        return isi;
    }

    // Method untuk mengubah nilai isi
    public void setIsi(T isi) {
        this.isi = isi;
    }

    // Method untuk menampilkan informasi Datum
    public void printInfo() {
        if (isi instanceof Anabul) {
            Anabul anabul = (Anabul) isi;
            System.out.println("Nama Datum: " + anabul.toString());
            System.out.println("Jenis Datum: " + anabul.getJenis());
            anabul.Gerak();
            anabul.Bersuara();
            System.out.println("------------------------------------");
        } else {
            System.out.println("Isi: " + isi);
            System.out.println("------------------------------------");
        }
    }
}
