package Tugas_3_4;
/*  Nama File    : PersegiPanjang.java
 *  Deskripsi    : Kelas untuk Persegi Panjang sebagai subclass dari Bangun Datar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */

 public class PersegiPanjang extends BangunDatar {
    // Atribut
    private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung keliling persegi panjang
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk menghitug luas persegi panjang
    public double hitungLuas(){
        return panjang * lebar; 
    }
}