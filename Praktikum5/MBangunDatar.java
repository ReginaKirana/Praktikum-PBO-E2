/*  Nama File    : MBangunDatar.java  
 *  Deskripsi    : Program utama untuk menguji kelas BangunDatar, Persegi, dan Lingkaran,  
 *                 serta fitur zoom dari interface IResize
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */  

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10.0, "Biru", "Putih");
        Persegi P2 = new Persegi(5.0, "Ungu", "Merah");
        BangunDatar L1 = new Lingkaran(7.0, "Hijau", "Kuning");
        Lingkaran L2 = new Lingkaran(14.0, "Coklat", "Hitam");

        // Menampilkan informasi objek Persegi
        System.out.println("Informasi Persegi P1:");
        P1.printInfo();
        System.out.println();
        System.out.println("Informasi Persegi P2:");
        P2.printInfo();
        System.out.println();

        // Menampilkan informasi objek Lingkaran
        System.out.println("Informasi Lingkaran L1:");
        L1.printInfo();
        System.out.println();
        System.out.println("Informasi Lingkaran L2:");
        L2.printInfo();
        System.out.println();

        // Membandingkan objek BangunDatar
        System.out.println("Luas Persegi P1 = Luas Lingkaran L1? " + P1.isEqualLuas(L1));
        System.out.println("Keliling Persegi P1 = Keliling Lingkaran L1? " + P1.isEqualKeliling(L1));

        // Menampilkan informasi sebelum di-zoom
        System.out.println("=== Sebelum Zoom ===");
        System.out.println("Sisi persegi P2: " + P2.getSisi());
        System.out.println("Jari lingkaran L2: " + L2.getJari());
        System.out.println();

        // Menggunakan method dari IResize
        P2.zoomIn();
        L2.zoomOut();

        System.out.println("=== Setelah Zoom ===");
        System.out.println("Sisi persegi P2: " + P2.getSisi());
        System.out.println("Jari lingkaran L2: " + L2.getJari());
        System.out.println();

        // Menggunakan zoom dengan persen tertentu
        P2.zoom(50); // Memperbesar ukuran persegi menjadi 50% dari ukuran aslinya
        L2.zoom(200); // Memperbesar ukuran lingkaran menjadi 200% dari ukuran aslinya

        System.out.println("=== Setelah Zoom ===");
        System.out.println("Sisi persegi P2: " + P2.getSisi());
        System.out.println("Jari Lingkaran L2: " + L2.getJari());
        
    }    
}
