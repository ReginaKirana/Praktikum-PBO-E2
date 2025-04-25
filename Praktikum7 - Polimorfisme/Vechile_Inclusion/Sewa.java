/*  Nama File    : Sewa.java 
 *  Deskripsi    : Kelas main untuk sewa kendaraan
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Vechile_Inclusion;
public class Sewa {
    public static void main(String[] args) {
        // Membuat objek dengan tipe Vehicle
        Vehicle kendaraan = new Vehicle();
        // Objek mobil bertipe Vehicle tapi instance dari Car (polimorfisme)
        Vehicle mobil = new Car();
        // Objek bis bertipe Vehicle tapi instance dari Bus (polimorfisme)
        Vehicle bis = new Bus();

        // Pemanggilan metode calRent untuk masing-masing objek
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        // Pemanggilan metode hitungSewa statis yang memanggil calRent(100, 8000)
        System.out.println();
        Vehicle.hitungSewa(kendaraan);
        Vehicle.hitungSewa(mobil);
        Vehicle.hitungSewa(bis);
    }
}

/* ======= KESIMPULAN POLIMORFISME INCLUSION ======= */
/* Polimorfisme inclusion terjadi saat sebuah objek bertipe superclass 
 * dapat merujuk ke objek subclass, dan method yang dipanggil ditentukan saat runtime 
 * berdasarkan objek yang sebenarnya. Hal ini dicapai melalui method overriding. 
 * Inclusion polymorphism memungkinkan fleksibilitas dan ekspansi program,
 * karena method yang sama bisa memiliki perilaku berbeda tergantung objeknya, meskipun menggunakan
 * referensi bertipe sama (superclass).
 */