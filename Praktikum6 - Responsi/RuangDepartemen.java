/* Nama File : RuangDepartemen.java
 * Deskripsi : Kelas turunan dari Ruang yang merepresentasikan ruang dalam departemen
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

public class RuangDepartemen extends Ruang {
    // ===================== ATRIBUT =====================
    private int jmlMeja;
    private int jmlKursi;
    private int jmlLemari;
    private Departemen departemen;

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter 
    public RuangDepartemen(){
    
    }
    
    // Konstruktor dengan Parameter
    public RuangDepartemen(String kodeRuang, double panjang, double lebar, double tinggi, int kapasitas, int jmlMeja, int jmlKursi, int jmlLemari, Departemen departement){
        super(kodeRuang, panjang, lebar, tinggi, kapasitas);
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
        this.jmlLemari = jmlLemari;
        this.departemen = departement;
    }

   // ===================== SELEKTOR DAN MUTATOR =====================
    public int getJmlMeja(){
        return jmlMeja;
    }

    public void setJmlMeja(int jmlMeja){
        this.jmlMeja = jmlMeja;
    }

    public int getJmlKursi(){
        return jmlKursi;
    }

    public void setJmlKursi(int jmlKursi){
        this.jmlKursi = jmlMeja;
    }

    public int getJmlLemari(){
        return jmlLemari;
    }

    public void setJmlLemari(int jmlLemari){
        this.jmlLemari = jmlLemari;
    }

    // ===================== METHOD =====================
    // Method untuk menghitung biaya kebersihan pada Ruang Departemen (implementasi method abstract)
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * departemen.getTarifKebersihan();
    }

    // Method untuk cetakInfo() pada Ruang Departemen
    @Override
    public void cetakInfo() {
        System.out.println("---------------------------------------------------");
        System.out.println("Departemen          : " + departemen.getNamaDepartemen());
        super.cetakInfo();
        System.out.println("Jumlah Meja         : " + jmlMeja);
        System.out.println("Jumlah Kursi        : " + jmlKursi);
        System.out.println("Jumlah Lemari       : " + jmlLemari);
        System.out.println("Biaya Kebersihan    : " + formatRupiah(hitungBiayaKebersihan()));
        System.out.println("---------------------------------------------------");
    }
}