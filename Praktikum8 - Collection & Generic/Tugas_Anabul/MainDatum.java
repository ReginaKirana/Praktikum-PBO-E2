/*  Nama File    : MainDatum.java 
 *  Deskripsi    : Kelas main untuk demo Datum
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */  
package Tugas_Anabul;
public class MainDatum {
    public static void main(String[] args) {
        // Membuat objek dari setiap jenis anabul
        Kucing kucing = new Kucing("Milo");
        Anjing anjing = new Anjing("Rocky");
        Burung burung = new Burung("Luna");
        
        // Membuat objek Datum untuk setiap jenis anabul
        Datum<Kucing> datumKucing = new Datum<>(kucing);
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        Datum<Burung> datumBurung = new Datum<>(burung);
        
        // Menampilkan informasi untuk setiap datum
        System.out.println("------------------------------------");
        System.out.println("------ INFORMASI DATUM KUCING ------");
        System.out.println("------------------------------------");
        datumKucing.printInfo();
        
        System.out.println("------------------------------------");
        System.out.println("------ INFORMASI DATUM ANJING ------");
        System.out.println("------------------------------------");
        datumAnjing.printInfo();
        
        System.out.println("------------------------------------");
        System.out.println("------ INFORMASI DATUM BURUNG ------");
        System.out.println("------------------------------------");
        datumBurung.printInfo();
        
        // Contoh penggunaan Datum dengan tipe data lain
        Datum<String> datumString = new Datum<>("Ini adalah string");
        System.out.println("------------------------------------");
        System.out.println("------ INFORMASI DATUM STRING ------");
        System.out.println("------------------------------------");
        datumString.printInfo();
        
        Datum<Integer> datumInteger = new Datum<>(42);
        System.out.println("------------------------------------");
        System.out.println("------ INFORMASI DATUM INTEGER -----");
        System.out.println("------------------------------------");
        datumInteger.printInfo();
    }
}