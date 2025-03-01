/* Nama File    : MTitik.java
 * Deskripsi    : Berisi implementasi atribut dan method dalam class Titik dengan Enkapsulasi
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        /**** Membuat Titik T1 ****/ 
        System.out.println("---------------------------------");
        System.out.println("-    setAbsis Dan setOrdinat    -");
        System.out.println("---------------------------------");
        System.out.println("== Titik T1 ==");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();

        /**** Membuat Titik T1 ****/ 
        System.out.println("------------------------");
        System.out.println("-    akses variabel    -");
        System.out.println("------------------------");
        System.out.println("== Titik T1 ==");
        System.out.println("Absis T1 = " + T1.getAbsis());
        System.out.println("Ordinat T1 = " + T1.getOrdinat());
        
        /* Akibat Enkapsulasi:
           T1.ordinat(); tidak bisa akses karena sudah di-private, harus pakai selektor getter */

        /**** getCounterTitik ****/
        System.out.println("---------------------------------");
        System.out.println("-    Menghitung Jumlah Titik    -");
        System.out.println("---------------------------------");
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        
        /**** Membuat Titik Dengan Inputan x Dan y ****/
        System.out.println("--------------------------------------");
        System.out.println("-    Titik Dengan Inputan x Dan y    -");
        System.out.println("--------------------------------------");
        System.out.println("== Titik TS ==");
        Titik TS = new Titik(9,7);
        TS.printTitik();

        /**** Menggeser Titik T1 ****/
        System.out.println("-------------------------------------");
        System.out.println("-    Geser Titik T1 sejauh (4,5)    -");
        System.out.println("-------------------------------------");
        System.out.println("=== Titik T1 awal ===");
        T1.printTitik();
        T1.geser(4, 5);
        System.out.println("=== Titik T1 akhir ===");
        T1.printTitik();

        /**** Titik T2 dan Mengganti Titik T1 ****/
        System.out.println("-------------------------------");
        System.out.println("-    Membuat Titik T2 = T1    -");
        System.out.println("-------------------------------");
        System.out.println("== Titik T1 ==");
        T1.printTitik();
        Titik T2 = T1;
        System.out.println("== Titik T2 ==");
        T2.printTitik();

        System.out.println("-----------------------------------");
        System.out.println("- Mengganti Absis Dan Ordinat T1  -");
        System.out.println("-----------------------------------");
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.println("== Titik T1 ==");
        System.out.println("Absis T1 = " + T1.getAbsis());
        System.out.println("Ordinat T1 = " + T1.getOrdinat());
        System.out.println("--- T2 Setelah T1 Diganti ---");
        System.out.println("== Titik T2 ==");
        T2.printTitik();

        /**** Membuat Titik T3 Tanpa Inputan x Dan y) ****/
        System.out.println("------------------------------------------");
        System.out.println("-    Membuat Titik T3 (0,0) {default}    -");
        System.out.println("------------------------------------------");
        System.out.println("== Titik T3 ==");
        Titik T3 = new Titik();
        T3.printTitik();

        /**** getKuadran ****/
        System.out.println("---------------------");
        System.out.println("-    Cek Kuadran    -");
        System.out.println("---------------------");
        // Kuadran 1
        Titik TC = new Titik(5,2);
        System.out.println("Kuadran Titik (5,2): " + TC.getKuadran());
        // Kuadran 2
        Titik TD = new Titik(-3, 4);
        System.out.println("Kuadran Titik (-3,4): " + TD.getKuadran());
        // Kuadran 3
        Titik TE = new Titik(-3, -4);
        System.out.println("Kuadran Titik (-3,-4): " + TE.getKuadran());
        // Kuadran 4
        Titik TF = new Titik(5, -2);
        System.out.println("Kuadran Titik (5,-2): " + TF.getKuadran());

        /**** getJarakPusat ****/
        System.out.println("------------------------");
        System.out.println("-    Jarak Ke Pusat    -");
        System.out.println("------------------------");
        System.out.println("== Titik T4 ==");
        Titik T4 = new Titik(5,7);
        T4.printTitik();
        System.out.println("Jarak T4 ke Pusat = " + T4.getJarakPusat());

        /**** getJarak (Jarak 2 Titik) ****/
        System.out.println("------------------------------");
        System.out.println("-    Jarak Antara 2 Titik    -");
        System.out.println("------------------------------");
        System.out.println("== Titik T1 ==");
        T1.printTitik();
        System.out.println("== Titik T4 ==");
        T4.printTitik();
        System.out.println("== Jarak ==");
        System.out.println("Jarak Antara T1 dan T4 = " + T1.getJarak(T4));

        /**** RefleksiX ****/
        System.out.println("-------------------");
        System.out.println("-    RefleksiX    -");
        System.out.println("-------------------");
        System.out.println("== Titik T1 ==");
        T1.printTitik();
        T1.refleksiX();
        System.out.println("T1 setelah RefleksiX:");
        T1.printTitik();

        /**** RefleksiY ****/
        System.out.println("-------------------");
        System.out.println("-    RefleksiY    -");
        System.out.println("-------------------");
        System.out.println("== Titik T1 ==");
        T1.printTitik();
        T1.refleksiY();;
        System.out.println("T1 setelah RefleksiY:");
        T1.printTitik();

        /**** getRefleksiX ****/
        System.out.println("----------------------");
        System.out.println("-    getRefleksiX    -");
        System.out.println("----------------------");
        System.out.println("== Titik TQ ==");
        Titik TQ = new Titik (-4,-5);
        TQ.printTitik();
        Titik TQRef = TQ.getRefleksiX();
        System.out.println("== TQ setelah Refleksi X ==");
        TQRef.printTitik();

        /**** getRefleksiY ****/
        System.out.println("----------------------");
        System.out.println("-    getRefleksiY    -");
        System.out.println("----------------------");
        System.out.println("== Titik TP ==");
        Titik TP = new Titik (-3, -7);
        TP.printTitik();
        Titik TPRef = TP.getRefleksiY();
        System.out.println("== TP setelah getRefleksiY ==");
        TPRef.printTitik();

        System.out.println("------------------------");
        System.out.println("-     Terima Kasih     -");
        System.out.println("------------------------");
    }
}