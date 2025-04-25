/*  Nama File    : MPerson.java 
 *  Deskripsi    : Kelas main untuk demo kelas Person dan Student
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Person_Optional;
public class MPerson {
    public static void main(String[] args) {
        // Membuat objek Student dengan nama "Sally"
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}


/* Penjelasan Polimorfisme Inclusion: 
 * Pada kode di atas, polimorfisme inclusion terlihat pada penggunaan referensi Person p 
 * yang merujuk ke objek bertipe Student. Meskipun variabel p bertipe Person, 
 * saat program dijalankan, objek yang sebenarnya adalah Student, 
 * dan metode status() akan memanggil metode isAsleep() yang sudah di-override di kelas Student, 
 * bukan di kelas Person.
 */