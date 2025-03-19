/* Nama File    : MLatihan.java  
 * Deskripsi    : Program untuk menampilkan informasi Pegawai di universitas, 
 *                mencakup dosen tetap, dosen tamu, dan tenaga kependidikan (tendik)
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 * Tanggal      : 13 Maret 2025  
 */ 

package Latihan;
import java.time.LocalDate;

public class mLatihan {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-               TENAGA KERJA UNIVERSITAS CELESTIA                  -");
        System.out.println("--------------------------------------------------------------------\n");

        // =====  Dosen Tetap  =====
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-                         DATA DOSEN TETAP                         -");
        System.out.println("--------------------------------------------------------------------");
        // Membuat objek DosenTetap
        // Dosen Tetap 1
        DosenTetap dosenTetap1 = new DosenTetap(
                "199012312018042001", // NIP
                "Jonathan Alexander, Ph.D.", // Nama
                LocalDate.of(2000, 4, 23), // Tanggal Lahir
                LocalDate.of(2016, 8, 12), // TMT (Tanggal Mulai Tugas)
                15000000, // Gaji Pokok
                "Fakultas Hukum", // Fakultas
                "0031909002" // NIDN
        );
        // Dosen Tetap 2
        DosenTetap dosenTetap2 = new DosenTetap(
                "198507152015032001", // NIP
                "Dr. Michael Adrian, M.Sc.", // Nama
                LocalDate.of(1985, 7, 15), // Tanggal Lahir
                LocalDate.of(2015, 3, 20), // TMT (Tanggal Mulai Tugas)
                18000000, // Gaji Pokok
                "Fakultas Teknik", // Fakultas
                "0023456789" // NIDN
        );
        // Menampilkan informasi dosen tetap
        dosenTetap1.printInfo();
        dosenTetap2.printInfo();
        System.out.println();

        // =====  Dosen Tamu  =====
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-                         DATA DOSEN TAMU                          -");
        System.out.println("--------------------------------------------------------------------");
        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu(
            "200012252024071002", // NIP
            "Anne Hemsworth, B.Cs.", // Nama
            LocalDate.of(1982, 4, 10), // Tanggal Lahir
            LocalDate.of(2019, 8, 1), // TMT
            5000000, // Gaji Pokok
            "Fakultas Sains dan Matematika", // Fakultas
            "0025098021", // NIDK
            LocalDate.of(2027, 6, 30) // Tanggal Berakhir Kontrak
        );
        // Menampilkan informasi dosen tetap
        dosenTamu.printInfo();
        System.out.println();

        // =====  Tenaga Kependidikan (Tendik)  =====
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-                    DATA TENAGA KEPENDIDIKAN                      -");
        System.out.println("--------------------------------------------------------------------");
        // Membuat objek Tenaga Kependidikan (Tendik)
        Tendik tendik = new Tendik(
            "199002252020121002", // NIP
            "Emily Blunt, M.T.", // Nama
            LocalDate.of(1990, 2, 25), // Tanggal Lahir
            LocalDate.of(2015, 9, 15), // TMT
            4200000, // Gaji Pokok
            "Kemahasiswaan" // Bidang
        );
        // Menampilkan informasi tenaga kependidikan (tendik)
        tendik.printInfo();
        System.out.println();
    
    }
}