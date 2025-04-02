/* Nama File : Departemen.java
 * Deskripsi : Kelas independen yang merepresentasikan departemen
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

public class Departemen {
    // ===================== ATRIBUT =====================
    private String namaDepartemen;
    private String ketuaDepartemen;
    private  double tarifKebersihan;
    private static int countDept = 0;

    // ===================== KONSTRUKTOR =====================
    // Konstruktor tanpa parameter
    public Departemen(){

    }

    // Konstruktor dengan parameter
    public Departemen(String namaDepartemen, String ketuaDepartemen, double tarifKebersihan){
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifKebersihan = tarifKebersihan;
        countDept++;   
    }

    // ===================== SELEKTOR DAN MUTATOR =====================
    public double getTarifKebersihan(){
        return tarifKebersihan;
    }

    public void settarifKebersihan(double tarifKebersihan){
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getNamaDepartemen(){
        return namaDepartemen;
    }

    public void setNamaDepartemen(String namaDepartemen){
        this.namaDepartemen = namaDepartemen;
    }

    public String getKetuaDepartemen(){
        return ketuaDepartemen;
    }

    public void setKetuaDepartemen(String ketuaDepartemen){
        this.ketuaDepartemen = ketuaDepartemen;
    }

    public static int getCountDept(){
        return countDept;
    }
}