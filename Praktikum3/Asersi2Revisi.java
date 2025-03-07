/* Nama File    : Asersi2Revisi.java
 * Deskripsi    : Revisi program Asersi2 menggunakan exception handling
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 06 Maret 2025
 */

// ========== KODE PERBAIKAN ==========
// class Lingkaran2
class Lingkaran2Revisi {
    private double jariJari2;
    
    public Lingkaran2Revisi(double jariJari2) {
        // Validasi input menggunakan exception handling
        if (jariJari2 <= 0) {
            throw new IllegalArgumentException("Jari-jari lingkaran harus lebih dari nol!");
        }
        this.jariJari2 = jariJari2;
    }
    
    public double hitungKeliling2() {
        return 2 * Math.PI * jariJari2;
    }
}

// class Asersi2 (Versi Revisi)
public class Asersi2Revisi {
    public static void main(String[] args) {
        double jariJari2 = 0;
        try {
            Lingkaran2Revisi l = new Lingkaran2Revisi(jariJari2);
            double kelilingLingkaran2 = l.hitungKeliling2();
            System.out.println("Keliling lingkaran = " + kelilingLingkaran2);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}