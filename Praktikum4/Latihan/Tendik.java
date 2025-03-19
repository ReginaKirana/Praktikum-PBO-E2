/* Nama File    : Tendik.java  
 * Deskripsi    : Kelas Tendik sebagai turunan dari Pegawai  
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : 13 Maret 2025  
 */  

package Latihan;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Tendik extends Pegawai {
    // ===================== ATRIBUT =====================
    private String bidang;
    private static final int BupAge = 55;
    private static final List<String> BIDANG_VALID = Arrays.asList("Akademik", "Kemahasiswaan", "Sumber Daya");
    
    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter (default)
    public Tendik(){
    }

    // Konstruktor dengan parameter
    public Tendik(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        setBidang(bidang);
    }

    // ===================== GETTER & SETTER =====================
    // Getter untuk bidang
    public String getBidang() {
        return bidang;
    }

    // Setter untuk bidang dengan validasi
    public void setBidang(String bidang) {
        if (isValidBidang(bidang)) {
            this.bidang = bidang;
        } else {
            throw new IllegalArgumentException("Bidang tidak valid! Pilih: Akademik, Kemahasiswaan, atau Sumber Daya.");
        }
    }

    // Validasi bidang
    private boolean isValidBidang(String bidang) {
        return BIDANG_VALID.contains(bidang);
    }

   // ===================== METHOD =====================
    // Menghitung Batas Usia Pensiun (BUP)
    private LocalDate hitungBUP(){
        LocalDate tanggalBup = tglLahir.plusYears(BupAge);
        return tanggalBup.plusMonths(1).withDayOfMonth(1);
    }

    // Menghitung tunjangan (1% dari gaji pokok per tahun masa kerja)
    @Override
    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja().getYears() * gajiPokok;
    }

    // Menampilkan informasi lengkap tenaga kependidikan
    @Override
    public void printInfo() {
        System.out.println("NIP                : " + nip);
        System.out.println("Nama               : " + nama);
        System.out.println("Tanggal Lahir      : " + formatDate(tglLahir));
        System.out.println("TMT                : " + formatDate(tmt));
        System.out.println("Jabatan            : Tendik");
        System.out.println("Bidang             : " + bidang);
        System.out.println("Masa Kerja         : " + formatWorkTime(hitungMasaKerja()));
        System.out.println("BUP                : " + formatDate(hitungBUP()));
        System.out.println("Gaji Pokok         : Rp " + formatGaji(gajiPokok));

        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan          : 1% x " + hitungMasaKerja().getYears() + " x Rp " +
            formatGaji(gajiPokok) + " = Rp " + formatGaji(tunjangan));
        System.out.println("--------------------------------------------------------------------");
    }
}