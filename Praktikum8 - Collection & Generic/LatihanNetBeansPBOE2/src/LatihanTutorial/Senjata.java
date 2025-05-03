/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanTutorial;

/**
 *
 * @author Regina
 */

/*  Nama File    : Senjata.java
 *  Deskripsi    : Kelas untuk merepresentasikan senjata yang dapat menembak 
 *                 dan memiliki bayonet untuk menusuk
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */

public class Senjata {
    // Atribut 
    private String bunyi;
    private boolean menusuk;
    
    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    // Getter untuk mendapatkan bunyi
    public String getBunyi() {
        return bunyi;
    }
    
    // Setter untuk mengubah bunyi
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    // Method untuk mengecek apakah bayonet terpasang
    public boolean isMenusuk() {
        return menusuk;
    }
    
    // Setter untuk mengatur status bayonet
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    // Method untuk menembak sebanyak 'jumlah' kali
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " "); // Cetak bunyi tembakan
        }
        System.out.println(""); // Pindah baris setelah selesai menembak
    }
    
    // Method untuk memasang bayonet
    public void pasangBayonet() {
        setMenusuk(true); // Ubah status menusuk menjadi true
        System.out.println("Bayonet Terpasang");
    }
    
    // Method untuk melakukan tusukan
    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb!"; // Jika bayonet terpasang, berhasil menusuk
        } else {
            return "Gagal, belum pasang bayonet"; // Jika belum, gagal menusuk
        }
    }
}