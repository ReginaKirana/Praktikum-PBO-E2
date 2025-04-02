/* Nama File : Laboratorium.java
 * Deskripsi : Kelas turunan dari Ruang yang merepresentasikan laboratorium
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

public class Laboratorium extends Ruang {
    // ===================== ATRIBUT =====================
    protected String namaLab;
    protected double hargaSewa;
    protected static final double TARIF_KEBERSIHAN = 7000;

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter
    public Laboratorium(){

    }
    
    // Konstruktor dengan parameter
    public Laboratorium(String kodeRuang, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa){
        super(kodeRuang, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }

    // ===================== SELEKTOR DAN MUTATOR =====================
    public String getNamaLab(){
        return namaLab;
    }

    public void setNamaLab(String namaLab){
        this.namaLab = namaLab;
    }

    public double getHargaSewa(){
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa){
        this.hargaSewa = hargaSewa;
    }

    // ===================== METHOD =====================
    // Method untuk menghitung biaya kebersihan pada Laboratorium (implementasi method abstract)
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * TARIF_KEBERSIHAN;
    }

    // Method untuk cetakInfo untuk Laboratorium
    @Override
    public void cetakInfo() {
        System.out.println("---------------------------------------------------");
        System.out.println("Nama Laboratorium   : " + namaLab);
        super.cetakInfo();
        System.out.println("Harga Sewa          : " + hargaSewa);
        System.out.println("Biaya Kebersihan    : " + formatRupiah(hitungBiayaKebersihan()));
    }
}