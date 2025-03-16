/*  Nama File    : MBangunDatar.java  
 *  Deskripsi    : Kelas utama untuk menjalankan program dan menampilkan informasi bangun datar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 13 Maret 2025  
 */  

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat Object BangunDatar
        System.out.println("--------------------------");
        System.out.println("-    Info BangunDatar    -");
        System.out.println("--------------------------");
        BangunDatar bd = new BangunDatar();
        bd.setJmlSisi(3);
        bd.setWarna("Merah");
        bd.setBorder("Hitam");
        bd.printInfo();

        // Membuat objek Persegi
        
        System.out.println("--------------------");
        System.out.println("-   Info Persegi   -");
        System.out.println("--------------------");
        Persegi p = new Persegi(5, "Hijau", "Kuning");
        System.out.println("Jumlah Sisi Persegi: " + p.getJmlSisi());
        System.out.println("Warna Persegi: " + p.getWarna());
        System.out.println("Border Persegi: " + p.getBorder());
        System.out.println("Ukuran sisi Persegi: " + p.getSisi());

        System.out.println("--------------------------------");
        System.out.println("-   Info Persegi (printinfo)   -");
        System.out.println("--------------------------------");
        p.printInfo();

        // Membuat Objek Lingkaran + Penerapan Super
        System.out.println("----------------------");
        System.out.println("-   Info Lingkaran   -");
        System.out.println("----------------------");
        Lingkaran L = new Lingkaran(14, "Pink", "Biru");
        L.printInfo();
        System.out.println("Ukuran Jari-Jari Lingkaran: " + L.getJari());
    }    
}
