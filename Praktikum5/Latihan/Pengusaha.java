/*  Nama File    : Pengusaha.java  
 *  Deskripsi    : Subclass dari Manusia yang merepresentasikan Pengusaha  
 *                 dengan atribut tambahan NPWP serta perhitungan masa kerja dan pajak.  
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */

package Latihan;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

// ==== Subclass Pengusaha yang mengimplementasikan interface Pajak ====
public class Pengusaha extends Manusia implements Pajak {
    // ==== Atribut ====
    private String npwp;
    private static int counterPengusaha = 0;
    private final int B = 5;

    // ==== Konstruktor ====
    // Konstruktor dengan parameter untuk inisialisasi atribut
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Konstruktor default
    public Pengusaha(){
        super();
        counterPengusaha++;
    }

    // ==== Selektor & Mutator ====
   // Mengembalikan nilai NPWP Pengusaha
    public String getNpwp(){
        return npwp;
    }

    // Mengatur nilai NPWP Pengusaha
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    // Mengembalikan jumlah objek Pengusaha yang telah dibuat
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // ==== Method ====
    // Menghitung masa kerja berdasarkan selisih tahun antara tanggal mulai kerja dan hari ini
    // Rumus = (now - tgl_mulai_kerja) + B
    @Override 
    public int hitungMasaKerja(){
        // rumus: (now - tgl_mulai_kerja) + B
        Period periode = Period.between(tgl_mulai_kerja, LocalDate.now());
        return periode.getYears() + B;
    }

    // Menghitung pajak pengusaha (15% dari pendapatan)
    @Override
    public double hitungPajak(){
        // 15% * pendapatan
        return 0.15 * pendapatan;
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

    // Menampilkan informasi lengkap tentang Pengusaha
    @Override
    public void cetakInfo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("NPWP                : " + npwp); // Terdapat NPWP
        System.out.println("Tanggal Mulai Kerja : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + formatRupiah(pendapatan));
        System.out.println("----------------------------------------------------");
    }
}