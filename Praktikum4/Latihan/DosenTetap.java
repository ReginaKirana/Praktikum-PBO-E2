/*  Nama File    : DosenTetap.java  
 *  Deskripsi    : Kelas DosenTetap yang merupakan turunan dari kelas Dosen
 *                 memiliki atribut NIDN dan BUP
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 13 Maret 2025  
 */  

package Latihan;
import java.time.LocalDate;

class DosenTetap extends Dosen {
    // ===================== ATRIBUT =====================
    private String nidn;
    private static final int BupAge = 65; // Batas Usia Pensiun (BUP) Dosen Tetap

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter (default)
    public DosenTetap(){
    }

    // Konstruktor dengan parameter
    public DosenTetap(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // ===================== GETTER & SETTER =====================
    // Getter untuk NIDN
    public String getNidn() {
        return nidn;
    }

    // Setter untuk NIDN
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    // ===================== METHOD =====================
    // Method untuk menghitung Batas Usia Pensiun (BUP)
    private LocalDate hitungBUP() {
        // BUP dihitung dari tanggal lahir + 65 tahun, kemudian disesuaikan ke tanggal 1 bulan berikutnya
        return tglLahir.plusYears(BupAge).plusMonths(1).withDayOfMonth(1);
    }
    
    // Method untuk menghitung tunjangan berdasarkan masa kerja
    // Tunjangan dihitung sebagai 2% dari gaji pokok per tahun masa kerja
    @Override
    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.02 * masaKerja * gajiPokok;
    }

    // Metode untuk menampilkan informasi lengkap tentang Dosen Tetap
    // Override printInfo agar menampilkan data spesifik DosenTetap
    @Override
    public void printInfo() {
        System.out.println("NIP                : " + nip);
        System.out.println("NIDN               : " + nidn);
        System.out.println("Nama               : " + nama);
        System.out.println("Tanggal Lahir      : " + formatDate(tglLahir));
        System.out.println("TMT                : " + formatDate(tmt));
        System.out.println("Jabatan            : Dosen Tetap");
        System.out.println("Fakultas           : " + fakultas); 
        System.out.println("Masa Kerja         : " + formatWorkTime(hitungMasaKerja()));    
        System.out.println("BUP                : " + formatDate(hitungBUP()));
        System.out.println("Gaji Pokok         : " + formatGaji(gajiPokok));    
        
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan          : 2% x " + hitungMasaKerja().getYears() + " x Rp " + 
            String.format(formatGaji(gajiPokok) + " = Rp " + String.format(formatGaji(tunjangan))));
        System.out.println("--------------------------------------------------------------------");
    }
}