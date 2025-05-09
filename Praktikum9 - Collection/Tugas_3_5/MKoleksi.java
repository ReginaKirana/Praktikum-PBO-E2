package Tugas_3_5;
/*  Nama File    : MKoleksi.java
 *  Deskripsi    : Kelas main untuk menguji kelas generic Koleksi dengan tipe data Character
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */
public class MKoleksi {
    public static void main(String[] args) {
        // Membuat objek Koleksi dengan tipe data Character
        Koleksi<Character> koleksiKarakter = new Koleksi<>();
        
        // Menambahkan karakter A sampai J ke dalam koleksi
        for (char c = 'A'; c<= 'J'; c++){
            koleksiKarakter.add(c);
        }

        // Menampilkan semua elemen dalam koleksi
        System.out.println("----- KOLEKSI KARAKTER ----");
        System.out.println("Koleksi Karakter");
        koleksiKarakter.showAll();
        
        // Mendapatkan dan menampilkan jumlah elemen
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        System.out.println();

        System.out.println("----- CEK ISI ----");
        // Mengakses elemen pada indeks tertentu
        System.out.println("Elemen pada indeks 2: " + koleksiKarakter.getIsi(2));
        System.out.println();

        // Mengubah nilai elemen pada indeks tertentu
        System.out.println("----- UBAH ELEMEN KOLEKSI INDEKS 1 ----");
        koleksiKarakter.setIsi(1, 'X');
        System.out.println("Isi koleksi setelah perubahan:");
        koleksiKarakter.showAll();
        System.out.println();

        // Menghapus elemen pada indeks tertentu
        System.out.println("----- DELETE ----");
        Character hapus = koleksiKarakter.delete();
        System.out.println("Koleksi Karakter setelah dilakukan delete:");
        koleksiKarakter.showAll();
        System.out.println("Elemen yang terhapus : " + hapus);
        
        // Menampilkan jumlah elemen setelah penghapusan
        System.out.println("Elemen koleksi saat ini: " + koleksiKarakter.getSize());
        System.out.println();
    }
}