/*  Nama File    : PNS.java  
 *  Deskripsi    : Subclass dari Manusia yang merepresentasikan Pegawai Negeri Sipil (PNS)  
 *                 dengan atribut tambahan NIP serta perhitungan masa kerja dan pajak
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */

package Latihan;
import java.time.Period;
import java.util.Locale;
import java.text.NumberFormat;
import java.time.LocalDate;

// ==== Subclass PNS yang mengimplementasikan interface Pajak ====
public class PNS extends Manusia implements Pajak{
    // ==== Atribut ====
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 5; // sesuai digit 14 NIM

    // ==== Konstruktor ====
    // Konstruktor dengan parameter untuk inisialisasi atribut
    public PNS (String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor default
    public PNS(){
        super();
        counterPNS++;
    }

    // ==== Selektor & Mutator ====
    // Mengembalikan jumlah objek PNS yang telah dibuat
    public static int getCounterPNS(){
        return counterPNS;
    }

    // Mengembalikan NIP PNS
    public String getNip(){
        return nip;
    }

    // Mengatur nilai NIP
    public void setNip(String nip){
        this.nip = nip;
    }

    // ==== Method ====
    // Menghitung masa kerja berdasarkan selisih tahun antara tanggal mulai kerja dan hari ini
    @Override
    public int hitungMasaKerja(){
        Period periode = Period.between(tgl_mulai_kerja, LocalDate.now());
        return periode.getYears() + A; // Menambahkan konstanta A sesuai rumus
    }

    // Menghitung pajak PNS berdasarkan 10% dari pendapatan
    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
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

    // Menampilkan informasi lengkap tentang PNS
    @Override
    public void cetakInfo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("NIP                 : " + nip);
        System.out.println("Tanggal Mulai Kerja : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + formatRupiah(pendapatan));
        System.out.println("----------------------------------------------------");
    }
}