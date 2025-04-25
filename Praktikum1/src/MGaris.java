/* Nama File    : MGaris.java
 * Deskripsi    : Berisi implementasi atribut dan method dalam class Garis
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 21 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        /**** Membuat Garis g1 ****/ 
        System.out.println("--------------------------------");
        System.out.println("-    Garis Fengan Parameter    -");
        System.out.println("--------------------------------");
        System.out.println("== Garis g1 ==");
        Titik t1 = new Titik(-3,1);
        Titik t2 = new Titik(4,2);
        Garis g1 = new Garis(t1, t2);  
        g1.printGaris();

        System.out.println("-------------------------------");
        System.out.println("-    Garis Tanpa Parameter    -");
        System.out.println("-------------------------------");
        System.out.println("== Garis g2 ==");
        Garis g2 = new Garis();
        g2.printGaris();

        /**** Implementasi Selektor Getter ****/ 
        System.out.println("------------------------------");
        System.out.println("-    GetAwal dan GetAkhir    -");
        System.out.println("------------------------------");
        Titik t3 = new Titik (1,2);
        Titik t4 = new Titik (-5,-6);
        Garis g3 = new Garis(t3, t4);
        System.out.println("Titik Awal Garis g3 = (" + g3.getAwal().getAbsis() + 
            ", " + g3.getAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir Garis g3 = (" + g3.getAkhir().getAbsis() + 
            ", " + g3.getAkhir().getOrdinat() + ")");

        /**** Implementasi Selektor Setter ****/ 
        System.out.println("------------------------------");
        System.out.println("-    SetAwal dan SetAkhir    -");
        System.out.println("------------------------------");
        System.out.println("== Garis g1 Sebelum Diubah ==");
        g1.printGaris();
        // Ubah titik awal dan akhir
        g1.setAwal(new Titik(1,2));
        g1.setAkhir(new Titik(3,6));
        System.out.println("== Garis g1 Setelah Diubah ==");
        g1.printGaris();

        /**** Jumlah Garis ****/ 
        System.out.println("-----------------------------");
        System.out.println("-    Hitung Jumlah Garis    -");
        System.out.println("-----------------------------");
        System.out.println("Total garis yang dibuat = " + Garis.getCounterGaris());

        /**** Menghitung Panjang Garis ****/ 
        System.out.println("-----------------------");
        System.out.println("-    Panjang Garis    -");
        System.out.println("-----------------------");
        System.out.println("== Garis g2 ==");
        g2.printGaris();
        System.out.println("Panjang garis g2 = " + g2.getPanjang());

        /**** Mencari Gradien Suatu Garis ****/ 
        System.out.println("-----------------------");
        System.out.println("-    Gradien Garis    -");
        System.out.println("-----------------------");
        System.out.println("== Garis g2 ==");
        g2.printGaris();
        System.out.println("Gradien garis g2 = " + g2.getGradien());

        /**** Mencari Titik Tengah Suatu Garis ****/ 
        System.out.println("----------------------------");
        System.out.println("-    Titik Tengah Garis    -");
        System.out.println("----------------------------");
        System.out.println("== Garis g1 ==");
        g1.printGaris();
        Titik tengahG1 = g1.getTitikTengah();
        System.out.println("Titik tengah g1 = (" + tengahG1.getAbsis() + 
        ", " + tengahG1.getOrdinat() + ")");

        /**** Cek Apakah 2 Garis Sejajar ****/ 
        System.out.println("---------------------");
        System.out.println("-    Cek Sejajar    -");
        System.out.println("---------------------");
        System.out.println("====== Garis g1 ======");
        g1.printGaris();
        System.out.println("====== Garis g2 ======");
        g2.printGaris();
        System.out.println("====== Garis g4 ======");
        Titik t5 = new Titik(1,2);
        Titik t6 = new Titik(3,4);
        Garis g4 = new Garis(t5, t6);  
        g4.printGaris();
        System.out.println("====== Garis g5 ======");
        Titik t7 = new Titik(2,3);
        Titik t8 = new Titik(4,5);
        Garis g5 = new Garis(t7, t8);  
        g5.printGaris();
        System.out.println("=======  Cek Sejajar  =======");
        System.out.println("Garis g4 dan g5 sejajar? = " + g4.isSejajar(g5));
        System.out.println("Garis g1 dan g2 sejajar? = " + g1.isSejajar(g2));

        /**** Cek Apakah 2 Garis Saling Tegak Lurus ****/ 
        System.out.println("-------------------------");
        System.out.println("-    Cek Tegak Lurus    -");
        System.out.println("-------------------------");
        System.out.println("====== Garis g2 ======");
        g2.printGaris();
        System.out.println("====== Garis g3 ======");
        g3.printGaris();
        System.out.println("====== Garis g4 ======");
        g4.printGaris();
        System.out.println("====== Garis g6 ======");
        Titik t9 = new Titik(0,0);
        Titik t10 = new Titik(2,-2);
        Garis g6 = new Garis(t9, t10);  
        g6.printGaris();
        System.out.println("=======  Cek Tegak Lurus  =======");
        System.out.println("Garis g2 dan g6 tegak lurus? = " + g2.isTegakLurus(g6));
        System.out.println("Garis g3 dan g4 tegak lurus? = " + g3.isTegakLurus(g4));

        /**** Print Garis ****/ 
        System.out.println("-------------------------");
        System.out.println("-      Print Garis      -");
        System.out.println("-------------------------");
        System.out.println("== Garis g1 ==");
        g1.printGaris();
        System.out.println("== Garis g2 ==");
        g2.printGaris();
        System.out.println("== Garis g3 ==");
        g3.printGaris();

        /**** Persamaan Garis ****/ 
        System.out.println("-------------------------");
        System.out.println("-    Persamaan Garis    -");
        System.out.println("-------------------------");
        System.out.println("===== Garis g5 =====");
        g5.printGaris();
        System.out.println("Persamaan Garis g5 = " + g5.getPersamaanGaris());
        System.out.println("===== Garis g3 =====");
        g3.printGaris();
        System.out.println("Persamaan Garis g3 = " + g3.getPersamaanGaris());
        
        System.out.println("------------------------");
        System.out.println("-     Terima Kasih     -");
        System.out.println("------------------------");
    }
}