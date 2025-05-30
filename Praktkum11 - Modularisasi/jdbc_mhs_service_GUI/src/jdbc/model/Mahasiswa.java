/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/* 
 * Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas model untuk entitas Mahasiswa, menyimpan data id dan nama.
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : Kamis, 22 Mei 2025
 */

package jdbc.model;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    // Atribut
    private int id;
    private String nama;
    
    // Konstruktor tanpa parameter
    public Mahasiswa(){
        
    }
    
    // Konstruktor dengan parameter
    public Mahasiswa (int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    // Getter dan Setter
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    // Method untuk mnampilkan representasi string dari objek Mahasiswa
    @Override
    public String toString(){
        return "Mahasiswa{ " + "id=" + id + ", nama=" + nama + " }";
    }
}