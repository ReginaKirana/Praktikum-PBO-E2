package Tugas_3_4;
/*  Nama File    : Lingkaran.java
 *  Deskripsi    : Kelas untuk Lingkaran sebagai subclass dari Bangun Datar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */

 public class Lingkaran extends BangunDatar {
    // Atribut
    private double jejari;

    // Konstruktor
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    // Method untuk menghitung keliling Lingkaran
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }

    // Method untuk menghitung luas Lingkaran
    public double hitungLuas(){
        return 3.14 * jejari * jejari; 
    }
}