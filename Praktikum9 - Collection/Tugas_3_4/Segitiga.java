package Tugas_3_4;
/*  Nama File    : Segitiga.java
 *  Deskripsi    : Kelas untuk Segitiga sebagai subclass dari Bangun Datar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */

 public class Segitiga extends BangunDatar {
    // Atribut
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;

    // Konstruktor
    public Segitiga(double alas, double tinggi, double sisi2, double sisi3) {
        this.alas = alas; // alas segtiga
        this.tinggi = tinggi; // tinggi segitiga
        this.sisi1 = alas; // sisi pertama (disamakan dengan alas)
        this.sisi2 = sisi2; // sisi kedua
        this.sisi3 = sisi3; // sisi ketiga
    }

    // Method untuk menghitung keliling persegi panjang
    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    // Method untuk menghitug luas persegi panjang
    public double hitungLuas(){
        return 0.5 * alas * tinggi; 
    }
}