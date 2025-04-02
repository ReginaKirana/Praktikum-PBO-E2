/* Nama File : RuangKelas.java
 * Deskripsi : Berisi atribut dan method dalam class aRuangKelas
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

public class RuangKelas extends Ruang {
    // ===================== ATRIBUT =====================
    private int kursiTersedia;
    private int kursiRusak;
    private static final double TARIF_KEBERSIHAN = 7000;

    // ===================== KONSTRUKTOR =====================
    // Konstruktor Tanpa Parameter
    public RuangKelas(){

    }

    // Konstruktor dengan Parameter
    public RuangKelas(String kodeRuang, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak){
        super(kodeRuang, panjang, lebar, tinggi, kapasitas);
        this.kursiTersedia = kursiTersedia;
        this.kursiRusak = kursiRusak;
    }

    // ===================== SELEKTOR & MUTATOR =====================
    public int getKursiTersedia(){
        return kursiTersedia;
    }

    public void setKursiTersedia(int kursiTersedia){
        this.kursiTersedia = kursiTersedia;
    }

    public int getKursiRusak(){
        return kursiRusak;
    }

    public void setKursiRusak(int kursiRusak){
        this.kursiRusak = kursiRusak;
    }

    // ===================== METHOD =====================
    // Method hitung biaya kebersihan (implementasi method abstract)
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * TARIF_KEBERSIHAN;
    }

    // Method override cetakInfo Ruang Kelas
    @Override
    public void cetakInfo() {
        System.out.println("---------------------------------------------------");
        super.cetakInfo();
        System.out.println("Kursi Tersedia      : " + kursiTersedia);
        System.out.println("Kursi Rusak         : " + kursiRusak);
        System.out.println("Biaya Kebersihan    : " + formatRupiah(hitungBiayaKebersihan()));
        System.out.println("---------------------------------------------------");
    }
    
}