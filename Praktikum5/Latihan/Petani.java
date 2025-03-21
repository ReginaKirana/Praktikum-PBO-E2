/*  Nama File    : Petani.java  
 *  Deskripsi    : Subclass dari Manusia yang merepresentasikan Petani  
 *                 dengan atribut tambahan asal kota serta perhitungan masa kerja dan pajak.  
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */

package Latihan;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

// ==== Subclass Petani yang mengimplementasikan interface Pajak ====
public class Petani extends Manusia implements Pajak {
    // ==== Atribut ====
    private String asal_kota;
    private static int counterPetani = 0;
    private final int C = 1;

    // ==== Konstruktor ====
    // Konstruktor dengan parameter untuk inisialisasi atribut
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    
    // Konstruktor default
    public Petani(){
        super();
        counterPetani++;
    }

    // ==== Selektor & Mutator ====
    // Mengembalikan jumlah objek Petani yang telah dibuat
    public static int getCounterPetani(){
        return counterPetani;
    }

    // Mengembalikan kota asal petani
    public String getAsalKota(){
        return asal_kota;
    }

    // Mengatur nilai kota asal petani
    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    // ==== Method ====
    // Menghitung masa kerja berdasarkan selisih tahun antara tanggal mulai kerja dan hari ini
    @Override
    public int hitungMasaKerja(){
        // Rumus = (now - tgl_mulai_kerja) + C
        Period periode = Period.between(tgl_mulai_kerja, LocalDate.now());
        return periode.getYears() + C;
    }

    // Menghitung pajak petani (pajak petani = 0)
    @Override
    public double hitungPajak(){
        return 0;
    }

    // Mengubah format nominal pendapatan ke dalam bentuk mata uang Rupiah
    public static String formatRupiah(double pendapatan) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatter.format(pendapatan).replace("Rp", "Rp ");
    }

    // Mengubah format tanggal ke dalam format "dd-MM-yyyy"
    public String formatTanggal(LocalDate tanggal) {
        return tanggal.format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    // Menampilkan informasi lengkap tentang Petani
    @Override
    public void cetakInfo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("Asal Kota           : " + asal_kota); // Terdapat asal kota
        System.out.println("Tanggal Mulai Kerja : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + formatRupiah(pendapatan));
        System.out.println("----------------------------------------------------");
    }
}
