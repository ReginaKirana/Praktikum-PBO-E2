package Tugas_3_4;

/*  Nama File    : Persegi.java
 *  Deskripsi    : Kelas untuk Persegi sebagai subclass dari Bangun Datar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */

 public class Persegi extends BangunDatar {
    // Atribut
    private double sisi;

    // Konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung keliling persegi
    public double hitungKeliling() {
        return 4 * sisi;
    }

    // Method untuk menghitug luas persegi
    public double hitungLuas(){
        return sisi * sisi; 
    }
}