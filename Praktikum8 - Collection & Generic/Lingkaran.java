/*  Nama File    : Lingkaran.java
 *  Deskripsi    : Kelas abstrak untuk bangun datar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */

public class Lingkaran extends BangunDatar {
    // Atribut
    private double jejari;

    // Konstruktor
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    // Method
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}