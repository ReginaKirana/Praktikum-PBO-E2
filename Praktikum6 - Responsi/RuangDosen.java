/* Nama File : RuangDosen.java
 * Deskripsi : Kelas turunan dari Ruang yang merepresentasikan ruang kerja dosen
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

public class RuangDosen extends Ruang {
    // ===================== ATRIBUT =====================
    private String namaDosen;
    private int jmlMeja;
    private int jmlKursi;
    private Departemen departemen;

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter
    public RuangDosen(){

    }
    
    // Konstruktor dengan parameter
    public RuangDosen(String kodeRuang, double panjang, double lebar, double tinggi, int kapasitas, String namaDosesn, int jmlMeja, int jmlKursi, Departemen departement){
        super(kodeRuang, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosesn;
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
        this.departemen = departement;
    }

    // ===================== SELEKTOR DAN MUTATOR =====================
    public String getNamaDosen(){
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen){
        this.namaDosen = namaDosen;
    }

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

    // ===================== METHOD =====================
    // Method untuk menghitung biaya kebersihan pada Ruang Dosen (implementasi method abstract)
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * departemen.getTarifKebersihan();
    }

    // Method untuk cetakInfo untuk Ruang Dosen
    @Override
    public void cetakInfo() {
        System.out.println("---------------------------------------------------");
        System.out.println("Nama Dosen          : " + namaDosen);    
        System.out.println("Departemen          : " + departemen.getNamaDepartemen());
        super.cetakInfo();
        System.out.println("Jumlah Meja         : " + jmlMeja);
        System.out.println("Jumlah Kursi        : " + jmlKursi);
        System.out.println("Biaya Kebersihan    : " + formatRupiah(hitungBiayaKebersihan()));
        System.out.println("---------------------------------------------------");
    }
    
}
