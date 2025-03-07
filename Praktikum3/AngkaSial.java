/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
 *                Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 06 Maret 2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase){
            // method getMessage() telah ada pada kelas 'AngkaSialException"
            System.out.println(ase.getMessage());
            System.out.println("Hati - hati memasukkan angka!!!");
        }
    }
}

// ========== Pertanyaan 1 ========== //
/* Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
 * Jawab: Ketika eksepsi terjadi, baris 12 Tidak Dieksekusi.  
 * 
 * Penjelasan: Saat `as.cobaAngka(13)` dipanggil, kondisi `if(angka == 13)` bernilai True,  
 * sehingga `throw new AngkaSialException();` langsung dijalankan.  
 * Akibatnya, eksepsi dilempar dan alur program berpindah ke blok `catch`,  
 * sehingga baris 12 (System.out.println(angka + " bukan angka sial") tidak dieksekusi.  
 *  
 * Baris 12 hanya akan dieksekusi jika tidak terjadi eksepsi, misalnya pada cobaAngka(10).  
 * Namun, karena eksepsi terjadi pada `cobaAngka(13)`, semua kode setelahnya dalam blok `try`,  
 * termasuk `as.cobaAngka(12)`, juga tidak dijalankan.  
 *  
 * Begitu eksepsi muncul, eksekusi dalam blok `try` langsung berhenti dan beralih ke `catch`.  
 */


// ========== Pertanyaan 2 ========== //
/* Apakah baris 21 pada AngkaSial.java di atas dieksekusi?  
 * Jawab: Ya, baris 21 dieksekusi.  
 *  
 * Penjelasan: Baris 21 merupakan bagian dari `catch(AngkaSialException ase)`.  
 * Ketika `as.cobaAngka(13)` melempar eksepsi, eksekusi dalam blok `try` langsung dihentikan,  
 * dan program berpindah ke blok `catch`.  
 * Karena baris 21 adalah blok `catch`, maka baris ini dieksekusi untuk menangani eksepsi yang terjadi.  
 */