/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanTutorial;
/**
 *
 * @author Regina
 * 
 */

/*  Nama File    : TestSenjata.java
 *  Deskripsi    : Main class untuk senjata
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */

public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat dua objek Senjata dengan bunyi yang berbeda
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        // Menembakkan AK47 sebanyak 3 kali
        System.out.print("AK47 Menembak 3x: ");
        ak47.menembak(3);
        
        // Menembakkan M16 sebanyak 1 kali
        System.out.print("M16 Menembak 1x: ");
        m16.menembak(1);
        
        // Mencoba menusuk dengan AK47 sebelum memasang bayonet
        System.out.println("AK47 menusuk: " + ak47.menusuk());
        
        // Memasang bayonet pada AK47
        ak47.pasangBayonet();
        
        // Mencoba menusuk lagi setelah bayonet dipasang
        System.out.println("AK47 menusuk: " + ak47.menusuk());
    }
}
