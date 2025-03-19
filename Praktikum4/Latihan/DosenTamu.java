/*  Nama File    : DosenTamu.java  
 *  Deskripsi    : Kelas DosenTamu sebagai subclass Dosen
 *                 memiliki atribut NIDK dan akhir kontrak
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 13 Maret 2025  
 */  

package Latihan;
import java.time.LocalDate;
import java.time.Period;

class DosenTamu extends Dosen {
    // ===================== ATRIBUT =====================
    private String nidk;
    private LocalDate akhirKontrak;

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter (default)
    public DosenTamu(){
    }

    // Konstruktor dengan parameter
    public DosenTamu(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak){
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    // ===================== GETTER & SETTER =====================
    // Getter untuk NIDK
    public String getNidk() {
        return nidk;
    }

    // Setter untuk NIDK
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    // Getter untuk Akhir Kontrak
    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    // Setter untuk Akhir Kontrak
    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    // ===================== METHOD =====================
    // Method untuk menghitung sisa kontrak dalam bulan. 
    // Jika kontrak sudah habis, kembalikan Period.ZERO
    private Period hitungSisaKontrak(){
        LocalDate today = LocalDate.now();
        if (today.isAfter(akhirKontrak)) {
            return Period.ZERO;
        }
        return Period.between(today, akhirKontrak);
    }

    // Method untuk enghitung tunjangan berdasarkan sisa kontrak 
    // 2.5% per bulan dari gaji pokok
    @Override
    public double hitungTunjangan() {
        if (hitungSisaKontrak().isZero()) {
            return 0.0;
        }
        return 0.025 * gajiPokok;
    }

    // Menampilkan informasi lengkap dosen tamu
    @Override
    public void printInfo() {
        System.out.println("NIP                : " + nip);
        System.out.println("NIDK               : " + nidk);
        System.out.println("Nama               : " + nama);
        System.out.println("Tanggal Lahir      : " + formatDate(tglLahir));
        System.out.println("TMT                : " + formatDate(tmt));
        System.out.println("Jabatan            : Dosen Tetap");
        System.out.println("Fakultas           : " + fakultas); 
        System.out.println("Masa Kerja         : " + formatWorkTime(hitungMasaKerja()));    

        Period kontrakTersisa = hitungSisaKontrak();
        if (!kontrakTersisa.isZero()) {
            System.out.println("Sisa Kontrak       : " + kontrakTersisa.getYears() + " tahun " + 
                kontrakTersisa.getMonths() + " bulan");
            System.out.println("Akhir Kontrak      : " + formatDate(akhirKontrak));
        } else {
            System.out.println("Masa Kontrak Tersisa : KONTRAK TELAH BERAKHIR");
        }
        
        System.out.println("Gaji Pokok         : Rp " + formatGaji(gajiPokok));

        double tunjangan = hitungTunjangan();
        if (kontrakTersisa.isZero()) {
            System.out.println("Tunjangan        : Rp 0 (Kontrak telah berakhir)");
        } else {
            System.out.println("Tunjangan          : 2.5% x Rp " + formatGaji(gajiPokok) + 
                " = Rp " + formatGaji(tunjangan));
        }
        System.out.println("--------------------------------------------------------------------");
    }
}