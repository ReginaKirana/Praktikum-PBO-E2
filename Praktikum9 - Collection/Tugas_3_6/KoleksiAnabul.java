package Tugas_3_6;
/*  Nama File    : KoleksiAnabul.java 
 *  Deskripsi    : Kelas generic untuk menyimpan dan mengelola koleksi objek Anabul
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */  

import java.util.ArrayList;

public class KoleksiAnabul <T extends Anabul>{
    private int nbelm; // Menyimpan jumlah elemen saat ini
    private ArrayList<T> wadah; // Wadah utama untuk menyimpan elemen generic

    // Konstruktor inisialisasi wadah dan jumlah elemen
    public KoleksiAnabul(){
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

    // Method
    // Method untuk mengambil isi pada indeks tertentu
    public T getIsi(int index){
        if (index >= 0 && index < nbelm){
            return wadah.get(index);
        }
        return null; // jika indeks tidak valid
    }

    // Method untuk menyetel elemen pada indeks tertentu
    public void setIsi (int index, T e){
        if (index >= 0 && index < nbelm){
            wadah.set(index, e);
        }
    }

    // Getter jumlah elemen
    public int getSize(){
        return this.nbelm;
    }

    // Setter jumlah elemen
    public void setSize(int x){
        this.nbelm = x;
    }

    // Menambahkan elemen baru ke dalam koleksi
    public void add(T e){
        wadah.add(e);
        nbelm++;
    }

    // Menghapus elemen terakhir dari koleksi dan mengembalikannya
    public T delete(){
        if (nbelm > 0){
            T e = wadah.remove(nbelm - 1);
            nbelm--;
            return e;
        }
        return null;
    }

    // Menampilkan semua elemen dalam koleksi
    public void showAll(){
        for (int i = 0; i < nbelm; i++){
            T anabul = wadah.get(i);
            System.out.println("Anabul ke-" + (i + 1) + " : " + anabul.getClass().getSimpleName());
            System.out.println("Nama        : " + anabul.getNama());
            System.out.print("Bersuara    : ");
            anabul.Bersuara();
            System.out.print("Gerakan     : ");
            anabul.Gerak();
            System.out.println("---------------------------------------");
        }
    }
}