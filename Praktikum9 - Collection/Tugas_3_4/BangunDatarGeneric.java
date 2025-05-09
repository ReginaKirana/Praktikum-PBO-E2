package Tugas_3_4;
/*  Nama File    : BangunDatarGeneric.java
 *  Deskripsi    : Kelas konstruksi generic untuk BangunDatar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    // Tipe generic T dibatasi hanya untuk turunan/anak kelas dari BangunDatar
    private T bangunDatar;

    // Method untuk menyimpan objek bangun datar ke dalam properti bangunDatar
    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    // Method untuk mengembalikan objek bangun datar
    public T get() {
        return bangunDatar;
    }

    // Method untuk memanggil metode hitungKeliling dari objek bangun datar
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    // Methond untuk memanggil metode hitungLuas dari objek bangun datar
    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}