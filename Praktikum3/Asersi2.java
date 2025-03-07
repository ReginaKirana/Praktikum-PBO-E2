/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 06 Maret 2025
 */

// ========== KODE AWAL ==========
// class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari>0):"Jari jari lingkaran tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    } 
}

// ========== Pertanyaan ========== //
/* Secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan pada lembar laporan praktikum!
 * Jawab: Secara konsep asersi dalam program Asersi2.java kurang tepat.
 * Karena kegunaan asersi (assert) bukan untuk validasi input, 
 * melainkan digunakan untuk mendeteksi bug dalam kode selama pengembangan.
 * 
 * Selain itu, asersi bisa dinonaktifkan saat program dijalankan tanpa opsi -ea. 
 * Sehingga jika pengguna memasukkan nilai yang salah, program tetap bisa berjalan tanpa validasi.
 * 
 * Validasi input dapat dilakukan dengan exception handling 
 * `IllegalArgumentException`, yang akan memeriksa nilai jariJari dan 
 * memberikan pesan error jika nilainya tidak valid.
 */

/* Kode perbaikan Asersi2 ada di file terpisah yaitu: Asersi2Revisi.java */