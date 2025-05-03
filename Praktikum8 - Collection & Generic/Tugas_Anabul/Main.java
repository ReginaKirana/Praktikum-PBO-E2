// Nama File    : Main.java
// Deskripsi    : Program utama untuk mensimulasikan perilaku berbagai jenis hewan peliharaan 
//                menggunakan metode generik.
// Pembuat      : Regina Sasikirana Farikh (24060123140155)
// Tanggal      : Kamis, 1 Mei 2025

package Tugas_Anabul;
public class Main {
    public static void main(String[] args) {
        // Membuat objek Datum dengan tipe Kucing
        Datum<Kucing> kucing = new Datum<>(new Kucing("Milo"));
        // Membuat objek Datum dengan tipe Anjing
        Datum<Anjing> anjing = new Datum<>(new Anjing("Rocky"));
        // Membuat objek Datum dengan tipe Burung
        Datum<Burung> burung = new Datum<>(new Burung("Luna"));
        
        // Memanggil metode generik dari class UtilityAnabul
         // Memanggil metode generik untuk masing-masing objek
        // Mensimulasikan bunyi dan gerakan setiap hewan
        System.out.println("SIMULASI HEWAN PELIHARAAN");
        System.out.println("=========================");
        System.out.println("         KUCING          ");
        System.out.println("=========================");
        ContohMetodeGenerik.tampilkanNama(kucing);
        ContohMetodeGenerik.tampilkanPerilaku(kucing);
        
        System.out.println("=========================");
        System.out.println("         ANJING          ");
        System.out.println("=========================");
        ContohMetodeGenerik.tampilkanNama(anjing);
        ContohMetodeGenerik.tampilkanPerilaku(anjing);

        System.out.println("=========================");
        System.out.println("         BURUNG          ");
        System.out.println("=========================");
        ContohMetodeGenerik.tampilkanNama(burung);
        ContohMetodeGenerik.tampilkanPerilaku(burung);
    }
}
