package Tugas_3_6;
/*  Nama File    : MainKoleksiAnabul.java 
 *  Deskripsi    : Kelas main untuk demo Koleksi Anabul, Kucing, Anjing, Burung
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 8 Mei 2025  
 */  

public class MainKoleksiAnabul <T extends Anabul>{
    public static void main(String[] args) {
        // Membuat objek KoleksiAnabul
        KoleksiAnabul<Anabul> koleksi_anabul = new KoleksiAnabul<>();

        // Array nama - nama jenis Anabul
        String[] nama_kucing = {"Rio", "Zerra", "Mochizuki", "Milo"};
        String[] nama_anjing = {"Sniffer", "Max", "Rocky", "Charlie"};
        String[] nama_burung = {"Vireo", "Loona", "Kiko", "Pipit"};
        
        // Meingisi koleksi dengan 10 elemen acak
        for (int i = 0; i < 10; i++){
            // Generate angka acak antara 0-2 untuk menentukan jenis anabul
            int typeAnabul = (int)(Math.random()*3);
            // Menambahkan anabul sesuai jenis yang ditentukan (acak)
            switch (typeAnabul) {
                case 0: // Kucing
                    String namaK = nama_kucing[(int)(Math.random() * nama_kucing.length)];
                    koleksi_anabul.add(new Kucing(namaK));
                    break;
                case 1: // Anjing
                    String namaA = nama_anjing[(int)(Math.random() * nama_anjing.length)];
                    koleksi_anabul.add(new Anjing(namaA));
                    break;
                case 2: // Burung
                    String namaB = nama_burung[(int)(Math.random() * nama_burung.length)];
                    koleksi_anabul.add(new Burung(namaB));
                    break;  
            }
        }
        // Menampilkan semua anabul dalam koleksi
        System.out.println("------------ DAFTAR ANABUL ------------");
        koleksi_anabul.showAll();
        System.out.println();

        // Menghapus elemen terakhir dan menampilkan informasinya
        System.out.println("--------------- DELETE ----------------");
        Anabul dihapus = koleksi_anabul.delete();
        if (dihapus != null) {
            System.out.print("Anabul yang dihapus: ");
            System.out.println(dihapus.getClass().getSimpleName());
            System.out.println("Nama anabul: " + dihapus.getNama());
            System.out.println("Jumlah anabul sekarang: " + koleksi_anabul.getSize());
        }
        System.out.println("---------------------------------------");
        System.out.println();

        // Menampilkan semua anabul dalam koleksi setelah dilakukan delete
        System.out.println("----- DAFTAR ANABUL SETELAH DELETE ----");
        koleksi_anabul.showAll();
    }
}