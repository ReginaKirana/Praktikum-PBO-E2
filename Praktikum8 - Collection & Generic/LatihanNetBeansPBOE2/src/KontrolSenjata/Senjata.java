/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KontrolSenjata;

/**
 *
 * @author Regina
 */

/*  Nama File    : Senjata.java
 *  Deskripsi    : Kelas untuk senjata
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */
public class Senjata {
    // Atribut untuk menyimpan bunyi, status menusuk, dan jumlah peluru
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false; // Bayonet belum terpasang secara default
        this.peluru = 0; // Peluru awalnya 0
    }
    
    // Getter untuk mendapatkan bunyi senjata
    public String getBunyi() {
        return bunyi;
    }
    
    // Getter untuk memeriksa apakah bayonet sudah terpasang
    public boolean isMenusuk() {
        return menusuk;
    }
    
    // Getter untuk mendapatkan jumlah peluru
    public int getPeluru() {
        return peluru;
    }
    
    // Setter untuk mengubah bunyi senjata
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
     // Setter untuk mengubah status bayonet (menusuk)
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    // Setter untuk mengatur jumlah peluru senjata
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}