/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KontrolSenjata;

/**
 *
 * @author Regina
 */

/*  Nama File    : TestSenjata.java
 *  Deskripsi    : Main class untuk menguji kelas Senjata dan KontrolSenjata
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */

public class TestSenjata {
    public static void main(String[] args) {
        // Membuat objek Senjata dengan bunyi tembakan yang berbeda
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
         // Membuat objek KontrolSenjata untuk mengontrol masing-masing senjata
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);
        
        // Menguji tembak AK47 sebanyak 2 kali tanpa mengisi peluru sebelumnya
        kontrolAK47.menembak(2);
        // Mengisi peluru pada AK47 sebanyak 3 peluru
        kontrolAK47.isiPeluru(3);
        // Menguji tembak AK47 sebanyak 5 kali setelah diisi peluru
        kontrolAK47.menembak(5);

        System.out.println("==============================");
        // Menguji tembak AK47 sebanyak 1 kali setelah tembakan sebelumnya
        kontrolAK47.menembak(1);
        // Mengisi peluru pada AK47 sebanyak 5 peluru
        kontrolAK47.isiPeluru(5);
        // Menguji tembak AK47 sebanyak 2 kali setelah mengisi peluru
        kontrolAK47.menembak(2);
        }
}