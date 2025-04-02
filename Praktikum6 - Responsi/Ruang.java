/* Nama File : Ruang.java
 * Deskripsi : Berisi atribut dan method dalam class abstract Ruang
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public abstract class Ruang{
    // ===================== ATRIBUT =====================
    protected String kodeRuang;
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected int kapasitas;
    private static int counterRuang = 0;
    

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter
    public Ruang(){
    
    }

    // Konstruktor dengan parameter
    public Ruang(String kodeRuang, double panjang, double lebar, double tinggi, int kapasitas){
        this.kodeRuang = kodeRuang;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
        counterRuang++;
    }

    // ===================== SELEKTOR DAN MUTATOR =====================
    public String getKodeRuang(){
        return kodeRuang;
    }

    public void setKodeRuang(String kodeRuang){
        this.kodeRuang = kodeRuang;
    }

    public double getPanjang(){
        return panjang;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public static int getCounterRuang(){
        return counterRuang;
    }

    // ===================== ATRIBUT =====================
    // Method untuk mendapatkan biaya kebersihan dalam format Rupiah
    public String formatRupiah(double nilai) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(nilai);
    }

    // Method untuk menghitung luas 
    public double hitungLuas(){
        return panjang * lebar;
    }

    // Method untuk menghitung biaya kebersihan
    public abstract double hitungBiayaKebersihan();

    // Method untuk cetakInfo
    public void cetakInfo() {
        System.out.println("Kode Ruang          : " + kodeRuang);
        System.out.println("Luas                : " + hitungLuas() + " m\u00B2");
        System.out.println("Kapasitas           : " + kapasitas);
    }
}