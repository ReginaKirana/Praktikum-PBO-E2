/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 06 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}