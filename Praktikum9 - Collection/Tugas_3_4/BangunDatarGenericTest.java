package Tugas_3_4;
/*  Nama File    : BangunDatarGenericTest.java
 *  Deskripsi    : Kelas main generic untuk BangunDatar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Buat objek Lingkaran dan uji dengan generic
        System.out.println("----- LINGKARAN -----");
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<Lingkaran>();
        bdgLingkaran.set(l);
        System.out.println("Keliling: " + bdgLingkaran.hitungKeliling());
        System.out.println("Luas: " + bdgLingkaran.hitungLuas());
        System.out.println("Tipe generic: " + bdgLingkaran.get().getClass().getSimpleName());
        System.out.println();

        // Buat objek Persegi dan uji dengan generic
        System.out.println("----- PERSEGI -----");
        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<Persegi>();
        bdgPersegi.set(p);
        System.out.println("Keliling: " + bdgPersegi.hitungKeliling());
        System.out.println("Luas: " + bdgPersegi.hitungLuas());
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getSimpleName());
        System.out.println();

         // Buat objek Persegipanjang dan uji dengan generic
        System.out.println("----- PERSEGI PANJANG -----");
        PersegiPanjang pp = new PersegiPanjang(5, 7);
        BangunDatarGeneric<PersegiPanjang> bdgPersegipanjang = new BangunDatarGeneric<PersegiPanjang>();
        bdgPersegipanjang.set(pp);
        System.out.println("Keliling: " + bdgPersegipanjang.hitungKeliling());
        System.out.println("Luas: " + bdgPersegipanjang.hitungLuas());
        System.out.println("Tipe generic: " + bdgPersegipanjang.get().getClass().getSimpleName());
        System.out.println();
        
        // Buat objek Segitiga dan uji dengan generic
        System.out.println("----- SEGITIGA -----");
        Segitiga s = new Segitiga(6, 4, 5, 7);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(s);
        System.out.println("Keliling: " + bdgSegitiga.hitungKeliling());
        System.out.println("Luas: " + bdgSegitiga.hitungLuas());
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getSimpleName());
    }        
}

// Note
/* new BangunDatarGeneric<Segitiga>() hanya membuat wadah kosong.
 * set(s) dibutuhkan untuk mengisi wadah itu dengan objek Segitiga, 
 * agar metode seperti hitungKeliling() tahu objek mana yang harus diproses.
 */