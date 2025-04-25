/*  Nama File    : Overloading.java 
 *  Deskripsi    : Contoh polimorfisme overloading
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Overloading;
public class Overloading {
    // Metode tambah dengan 2 parameter int
    int tambah(int x, int y){
        return x + y;
    }

    // Metode tambah dengan 3 parameter int
    int tambah(int x, int y, int z){
        return x + y + z;
    }

    // Metode tambah dengan 1 parameter int (menggandakan nilai)
    int tambah (int x){
        return x + x;
    }

    // Metode tambah dengan 2 parameter double
    double tambah(double x, double y){
        return x + y;
    }

    // Metode tambah dengan parameter int dan double
    double tambah (int y, double x){
        return y + x;
    }

    public static void main(String[] args) {
        Overloading O = new Overloading();
        // Memanggil berbagai versi metode tambah sesuai parameter yang diberikan
        System.out.println(O.tambah(1));
        System.out.println(O.tambah(1,2));
        System.out.println(O.tambah(1,2,3));
        System.out.println(O.tambah(1, 2));
        System.out.println(O.tambah(2, 1.0));
        
    }
}

/* ======= KESIMPULAN POLIMORFISME OVERLOADING ======= */
/* Polimorfisme overloading merupakan bentuk polimorfisme statis (compile-time polymorphism)
 * di mana beberapa metode memiliki nama yang sama tetapi berbeda dalam jumlah, tipe,
 * atau urutan parameter. 
 * Compiler akan memilih metode yang sesuai berdasarkan argumen yang diberikan saat pemanggilan. 
 * Overloading meningkatkan keterbacaan kode karena memungkinkan satu nama metode 
 * digunakan untuk berbagai variasi operasi, tergantung kebutuhan data yang digunakan.
 */