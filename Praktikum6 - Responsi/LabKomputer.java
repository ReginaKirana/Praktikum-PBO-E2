/* Nama File : LabKomputer.java
 * Deskripsi : Kelas turunan dari Laboratorium yang merepresentasikan laboratorium komputer
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

public class LabKomputer extends Laboratorium {
    // ===================== ATRIBUT =====================
    private int jmlKomputer;

    // ===================== KONSTRUKTOR =====================
    // Konstrukor tanpa Parameter
    public LabKomputer(){
    }

    // Konstruktor dengan Parameter
    public LabKomputer(String kodeRuang, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jmlKomputer){
        super(kodeRuang, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jmlKomputer = jmlKomputer;
    }

    // ===================== SELEKTOR DAN MUTATOR =====================
    public int getJmlKomputer(){
        return jmlKomputer;
    }

    public void setJmlKomputer(int jmlKomputer){
        this.jmlKomputer = jmlKomputer;
    }

    // ===================== METHOD =====================
    // Method untuk cetakInfo pada Laboratorium Komputer
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Komputer     : " + jmlKomputer);
        System.out.println("---------------------------------------------------");
    }
}