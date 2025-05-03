/* Nama File    : MainCMG.java
 * Deskripsi    : Program utama demo Contoh Metode Generik 
 *                untuk mensimulasikan perilaku berbagai jenis hewan peliharaan 
 *                menggunakan metode generik.
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : Kamis, 1 Mei 2025
*/

package Tugas_Anabul;
public class MainCMG {
    public static void main(String[] args) {
        // Membuat objek ContohMetodeGenerik
        ContohMetodeGenerik cmg = new ContohMetodeGenerik();
        
        // Membuat objek dari setiap jenis anabul
        Kucing kucing = new Kucing("Milo");
        Anjing anjing = new Anjing("Rocky");
        Burung burung = new Burung("Luna");
        
        // Menggunakan metode generik untuk membuat objek Datum
        Datum<Kucing> datumKucing = cmg.makeDatum(kucing);
        Datum<Anjing> datumAnjing = cmg.makeDatum(anjing);
        Datum<Burung> datumBurung = cmg.makeDatum(burung);
        Datum<String> datumString = cmg.makeDatum("This is a string");

        System.out.println("------------------------------------");
        System.out.println("-----        NAMA DATUM        -----");
        System.out.println("------------------------------------");
        ContohMetodeGenerik.tampilkanNama(datumKucing);
        ContohMetodeGenerik.tampilkanNama(datumAnjing);
        ContohMetodeGenerik.tampilkanNama(datumBurung);
        System.out.println("--------------------------");
        System.out.println();
        // ContohMetodeGenerik.tampilkanNama(datumString); // Error: String bukan turunan dari Anabul

        // Menggunakan metode generik dengan batasan tipe
        System.out.println("------------------------------------");
        System.out.println("-----      PROSES ANABUL       -----");
        System.out.println("------------------------------------");
        cmg.prosesAnabul(datumKucing);
        cmg.prosesAnabul(datumAnjing);
        cmg.prosesAnabul(datumBurung);
        System.out.println();
        // cmg.prosesAnabul(datumString); // Error: String bukan turunan dari Anabul
        
        // Menggunakan metode generik untuk menampilkan informasi
        System.out.println("------------------------------------");
        System.out.println("-----     INFORMASI DATUM      -----");
        System.out.println("------------------------------------");
        cmg.printInfo(datumKucing);
        cmg.printInfo(datumAnjing);
        cmg.printInfo(datumBurung);
        cmg.printInfo(datumString);
        System.out.println();
        
        // Menggunakan metode generik dengan multiple tipe parameter
        System.out.println("------------------------------------");
        System.out.println("----      BANDINGKAN DATUM       ---");
        System.out.println("------------------------------------");
        cmg.bandingkanDatum(datumKucing, datumAnjing);
        System.out.println("------------------------------------");
        cmg.bandingkanDatum(datumBurung, datumString);
        System.out.println();
        
        // Contoh variasi lainnya
        System.out.println("------------------------------------");
        System.out.println("------       DATUM LAIN        -----");
        System.out.println("------------------------------------");
        Datum<Integer> datumInteger = cmg.makeDatum(99);
        cmg.bandingkanDatum(datumString, datumInteger);
    }
}