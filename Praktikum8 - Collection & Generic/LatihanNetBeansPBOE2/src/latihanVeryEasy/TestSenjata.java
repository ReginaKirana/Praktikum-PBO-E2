/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author Regina
 */

/*  Nama File    : Senjata.java
 *  Deskripsi    : Main class untuk senjata
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */
public class TestSenjata {
    public static void main(String[] args) {
        // Membuat objek Senjata dengan bunyi "TAR"
        Senjata ak47 = new Senjata("TAR");
        // Membuat objek Senjata dengan bunyi "DOR"
        Senjata m16 = new Senjata("DOR");
        
        // Menampilkan jumlah peluru awal AK47 (default = 0)
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        // Mengisi peluru untuk AK47 sebanyak 5
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        // Menampilkan jumlah peluru setelah diisi
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        // Menembakkan AK47 satu kali
        System.out.println("AK47 menembak");
        // Output: sisa peluru TAR = 4
        ak47.menembak();
    }
}