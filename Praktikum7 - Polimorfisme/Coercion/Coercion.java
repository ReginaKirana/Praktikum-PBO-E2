/*  Nama File    : Coercion.java 
 *  Deskripsi    : Contoh polimorfisme coercion
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Coercion;
public class Coercion{
    public static void main(String[] args) {
        // Program nomor 1 [char to int (implicit coercion)]
        int output1 = 'a';
        System.out.println(output1);
        /* Output: 97 (BERHASIL)
         * PENJELASAN : 'a' adalah char, tipe char dikonversi secara implisit (coercion) ke int 
         * karena char memiliki representasi numerik (ASCII). 'a' punya nilai ASCII = 97, maka output = 97 
         */

        // Program nomor 2 [double to int]
        // double x = 15.5;
        // int output2 = x; 
        // System.out.println(output2);
        /* Output (compile): Error: incompatible types: possible lossy conversion from double to int
         * PENJELASAN : Dalam Java, double tidak bisa dikonversi ke int secara otomatis 
         * karena potensi kehilangan data desimal. Sehingga, harus menggunakan explicit casting, 
         * misalnya: int output = (int) x 
         */

        // Program nomor 3 [int to double (implicit coercion)]
        int y = 25;
        double output3 = y;
        System.out.println(output3);
        /* Output: 25.0 (BERHASIL)
         * PENJELASAN: Konversi dari int ke double merupakan widening conversion, 
         * sehingga bisa dilakukan secara otomatis tanpa perlu casting eksplisit. 
         * Nilai output menjadi 25.0
         */

        // Program nomor 4. int to char (explicit casting)] 
        int z = 78;
        char output4 = (char) z;
        System.out.println(output4);
        /* Output: N (BERHASIL)
         * PENJELASAN: Konversi dari int ke char dilakukan dengan explicit casting, 
         * karena perubahan tipe data dari angka ke karakter memerlukan konversi yang jelas.
         * Nilai 78 dalam ASCII merepresentasikan karakter 'N', sehingga outputnya adalah N
         */

        // Program nomor 5 [char to double (via coercion through int)]
        char a = 'a';
        double output5 = a;
        System.out.println(output5);
        /* Output: 97.0 (BERHASIL)
         * PENJELASAN : Konversi dari char ke double
         * dilakukan melalui coerce ke integer, lalu dari integer dilakukan coerce ke double.
         * Sehingga ini merupakan implisit coercion berantai.'a' → 97 → 97.0 
         * 97 didapat dari kode ASCII karakter 'a'
         */
    }
}

/* ======= KESIMPULAN POLIMORFISME COERCION ======= */
/* Polimorfisme coercion adalah bentuk polimorfisme di mana satu tipe data dikonversi menjadi 
 * tipe data lain agar kompatibel dalam suatu konteks pemrosesan.
 * Dalam Java, coercion dapat terjadi secara implisit (otomatis) seperti dari char ke int,
 * int ke double, atau melalui explicit casting jika konversi berisiko kehilangan data,
 * seperti dari double ke int atau int ke char. 
 * Coercion memungkinkan fleksibilitas dalam penanganan berbagai tipe data 
 * tanpa harus menulis metode yang berbeda untuk setiap tipe.
*/