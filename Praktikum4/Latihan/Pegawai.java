/* Nama File    : Pegawai.java  
 * Deskripsi    : Superclass Pegawai mendefinisikan atribut dan method untuk pegawai
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : 13 Maret 2025  
 */ 

package Latihan;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Pegawai {
     // ===================== ATRIBUT =====================
    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter (default)
    public Pegawai(){
    }

     // Konstruktor dengan parameter
    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // ===================== GETTER & SETTER =====================
    // Getter untuk Nip
    public String getNip(){
        return nip;
    }

    // Setter untuk Nip
    public void setNip(String nip){
        this.nip = nip;
    }

    // Getter untuk Nama
    public String getNama(){
        return nama;
    }

    // Setter untuk Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Getter untuk tanggal lahir
    public LocalDate getTglLahir(){
        return tglLahir;
    }

    // Setter untuk tanggal lahir
    public void setTglLahir(LocalDate tglLahir){
        this.tglLahir = tglLahir;
    }

    // Getter untuk TMT
    public LocalDate getTmt(){
        return tmt;
    }

    // Setter untuk TMT
    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    // Getter untuk gaji pokok
    public double getGajiPokok(){
        return gajiPokok;
    }

    // Setter untuk gaji pokok
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // ===================== METHOD =====================
    // Method untuk menghitung masa kerja pegawai berdasarkan TMT
    public Period hitungMasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    // Method untuk menghitung tunjangan pegawai (akan di override di subclass)
    public double hitungTunjangan() {
        return 0; // Akan di override di masing masing subclass
    }

    // Method memformat tanggal dalam format Indonesia (contoh: 13 Maret 2025)
    protected String formatDate(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
    }

    // Method untuk memformat masa kerja dalam bentuk "X tahun X bulan"
    protected String formatWorkTime(Period period){
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    // Method untuk memformat angka menjadi format mata uang Indonesia (contoh: Rp 10.000,00)
    public String formatGaji(double amount) {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        return formatter.format(amount);
    }

    // Method untuk menampilkan informasi pegawai
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatDate(tglLahir));
        System.out.println("TMT           : " + formatDate(tmt));
        System.out.println("Masa Kerja    : " + formatWorkTime(hitungMasaKerja()));
        System.out.println("Gaji Pokok    : Rp " + formatGaji(gajiPokok));
        System.out.println("Tunjangan     : Rp " + formatGaji(hitungTunjangan()));
    }
}