/* Nama File : LabNonKomputer.java
 * Deskripsi : Kelas turunan dari Laboratorium yang merepresentasikan laboratorium non-komputer
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

public class LabNonKomputer extends Laboratorium{
    // ===================== ATRIBUT =====================
    private String[] mataKuliah;

    // ===================== KONSTRUKTOR =====================
    // Konstrukor tanpa Parameter
    public LabNonKomputer(){
    }

    // Konstruktor dengan Parameter
    public LabNonKomputer(String kodeRuang, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, String[] mataKuliah){
        super(kodeRuang, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
    }

    // ===================== SELEKTOR DAN MUTATOR =====================
    public String[] getMataKuliah(){
        return mataKuliah;
    }

    public void setMataKuliah(String[] mataKuliah){
        this.mataKuliah = mataKuliah;
    }

    // ===================== METHOD =====================
    // Method untuk cetakInfo pada Laboratorium Non Komputer
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Mata Kuliah         : " + String.join(", ", mataKuliah));
        System.out.println("---------------------------------------------------");
    }
}