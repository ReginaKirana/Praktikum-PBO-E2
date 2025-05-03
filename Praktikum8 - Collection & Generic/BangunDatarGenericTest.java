/*  Nama File    : BangunDatarGenericTest.java
 *  Deskripsi    : Kelas konstruksi generic untuk BangunDatar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 1 Mei 2025  
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = 
            new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " 
            + bdg.hitungKeliling());
        System.out.println("tipe generic : " 
            + bdg.get().getClass().getName());
    }
}


// Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
// dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !
// Jawab:
// Saya mengganti huruf T pada class BangunDatarGeneric menjadi T1, T2, dan T1234. 
// Hasilnya tetap berjalan dengan baik selama nama tersebut konsisten digunakan di seluruh class. 
// Ini membuktikan bahwa nama parameter generic bersifat fleksibel dan hanya simbol penanda, 
// bukan bagian dari sintaks wajib. 
// Namun, penggunaan huruf seperti T adalah konvensi umum agar kode lebih mudah dibaca dan dipahami.