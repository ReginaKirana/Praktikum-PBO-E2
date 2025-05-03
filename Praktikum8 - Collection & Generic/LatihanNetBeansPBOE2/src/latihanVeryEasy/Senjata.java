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
 *  Deskripsi    : Kelas untuk senjata
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */

public class Senjata {
    // Atribut
    private String bunyi;
    private int peluru;
    
    // Konstruktor untuk menginisialisasi bunyi senjata
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }
    
    // Getter untuk mendapatkan bunyi
    public String getBunyi() {
        return bunyi;
    }
    
    // Getter untuk mendapatkan jumlah peluru
    public int getPeluru() {
        return peluru;
    }
    
    // Setter untuk mengubah bunyi
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    // Setter untuk mengatur jumlah peluru
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    // Method untuk menembakkan senjata
    public void menembak() {
        // Jika masih ada peluru, keluarkan bunyi dan kurangi 1 peluru
        if (this.getPeluru() > 0) {
            System.out.println(this.getBunyi());
            this.setPeluru(this.getPeluru() - 1);
            System.out.println("Sisa peluru: " + this.getPeluru());
        }
        else{
            // Jika peluru habis, tampilkan pesan
            System.out.println("Peluru Habis");
        }
    }
}
   