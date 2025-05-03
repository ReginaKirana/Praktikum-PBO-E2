/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KontrolSenjata;

/**
 *
 * @author Regina
 */

/*  Nama File    : KontrolSenjata.java
 *  Deskripsi    : Kelas untuk kontrol senjata
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */


public class KontrolSenjata {
    // Atribut untuk menyimpan objek Senjata yang akan dikontrol
    Senjata senjata;
    
     // Konstruktor
    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
    // Method untuk memeriksa apakah masih ada peluru dalam senjata
    public boolean isAdaPeluru() {
        if (senjata.getPeluru() > 0) {
            return true; // Jika ada peluru, return true
        } else {
            return false; // Jika peluru habis, return false
        }
    }
    
    // Method untuk mengisi peluru pada senjata
    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru); // Menambahkan jumlah peluru
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }
    
    // Method untuk menembak senjata sejumlah 'jumlah' kali
    public void menembak(int jumlah) {
        System.out.println("Siap menembak " + jumlah + " kali");
        // Mengecek apakah senjata memiliki peluru
        if (isAdaPeluru()) {
            for (int i = jumlah; i > 0; i--) {
                // Jika masih ada peluru, lakukan tembakan
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi()); // Tampilkan bunyi tembakan
                    senjata.setPeluru(senjata.getPeluru() - 1); // Kurangi jumlah peluru
                } else {
                    System.out.println("Gagal tembak, Peluru Habis"); // Jika peluru habis, tampilkan pesan
                }
            }
            System.out.println("Peluru sisa : " + senjata.getPeluru()); // Tampilkan sisa peluru
        } else {
            System.out.println("Peluru Habis"); // Jika tidak ada peluru, tampilkan pesan
        }
    }
    
     // Method untuk menusuk dengan bayonet, jika bayonet terpasang
    public String menusuk() {
    if (senjata.isMenusuk()) {
        return "Jleb!"; // Jika bayonet terpasang, lakukan menusuk
    } else {
        return "Gagal, belum pasang bayonet";} // Jika bayonet belum terpasang, gagal menusuk
    }
    
    // Method untuk memasang bayonet pada senjata
    public void pasangBayonet() {
        senjata.setMenusuk(true); // Pasang bayonet
        System.out.println("Bayonet Terpasang");
    }
}