/* Nama File    : Dosen.java  
 * Deskripsi    : Kelas Dosen sebagai turunan dari Pegawai  
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : 13 Maret 2025  
*/  

package Latihan;
import java.time.LocalDate;

class Dosen extends Pegawai {
    // ===================== ATRIBUT =====================
    protected String fakultas;
    
    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter (default)
    public Dosen(){
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // ===================== GETTER & SETTER =====================
    // Getter untuk fakultas
    public String getFakultas() {
        return fakultas;
    }

    // Setter untuk fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // ===================== METHOD =====================
    // Menampilkan informasi dosen (ditambah fakultas)
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas      : " + fakultas);
    }
}