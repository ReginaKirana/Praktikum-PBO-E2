/*  Nama File    : Manusia.java  
 *  Deskripsi    : Superclass abstrak yang merepresentasikan manusia dengan atribut dasar  
 *                 seperti nama, tanggal mulai kerja, alamat, dan pendapatan.  
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */

package Latihan;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// ==== Superclass Abstrak Manusia ====
public abstract class Manusia {
    // ==== Atribut ====
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // ==== Konstruktor ====
    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tglmulaikerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tglmulaikerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Konstruktor default
    public Manusia(){
        counterMns++;
    }

    // ==== Selektor & Mutator ====
    // Mengembalikan jumlah objek Manusia yang telah dibuat
    public static int getCounterMns(){
        return counterMns;
    }

    // Getter dan setter untuk nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    // Getter dan setter untuk tanggal mulai kerja
    public LocalDate getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }
    public void setTglMulaiKerja(LocalDate tglmulaikerja){
        this.tgl_mulai_kerja = tglmulaikerja;
    }

    // Getter dan setter untuk pendapatan
    public double getPendapatan(){
        return pendapatan;
    }
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // Getter dan setter untuk alamat
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    // ==== Metode Abstrak ====
    // Menghitung masa kerja (akan diimplementasikan oleh subclass)
    public abstract int hitungMasaKerja();

    // ==== Metode ====
    // Mengubah format nominal pendapatan ke dalam bentuk mata uang Rupiah
    public static String formatRupiah(double pendapatan) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatter.format(pendapatan).replace("Rp", "Rp ");
    }

    // Mengubah format tanggal ke dalam format "dd-MM-yyyy"
    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return tanggal.format(formatter);
    }

    // Menampilkan informasi lengkap tentang manusia
    public void cetakInfo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + formatRupiah(pendapatan));
        System.out.println("----------------------------------------------------");
    }

}
