/*  Nama File    : MainAnabul.java 
 *  Deskripsi    : Kelas main untuk demo Anabul, Kucing, Anjing, Burung (tanpa generik)
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */  

package Tugas_Anabul;
import java.util.ArrayList;
public class MainAnabul {
    public static void main(String[] args) {
        // Membuat objek Kucing, Anjing, dan Burung yang bertipe Anabul
        Anabul hewan1 = new Kucing("Milo");
        Anabul hewan2 = new Anjing("Rocky");
        Anabul hewan3 = new Burung("Luna");

        // Menambahkan objek-objek hewan ke dalam ArrayList
        ArrayList<Anabul> animal = new ArrayList<>();
        animal.add(hewan1);
        animal.add(hewan2);
        animal.add(hewan3);

        // Mensimulasikan bunyi dan gerakan setiap hewan
        System.out.println("-------------------------");
        System.out.println("SIMULASI HEWAN PELIHARAAN");
        System.out.println("-------------------------");

        System.out.println("===== KUCING =====");
        System.out.println("Nama Kucing: " + hewan1.toString());
        hewan1.Gerak();
        hewan1.Bersuara();
        
        System.out.println("\n===== ANJING =====");
        System.out.println("Nama Anjing: " + hewan2.toString());
        hewan2.Gerak();
        hewan2.Bersuara();
        
        System.out.println("\n===== BURUNG =====");
        System.out.println("Nama Burung: " + hewan3.toString());
        hewan3.Gerak();
        hewan3.Bersuara();
    }
}