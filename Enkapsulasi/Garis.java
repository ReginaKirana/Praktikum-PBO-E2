/* Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dalam class Garis dengan Enkapsulasi
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */

public class Garis {
    /************* ATRIBUT *************/
    private Titik awal;
    private Titik akhir;
    private static int counterGaris =0 ;

    /************* METHOD *************/
    // Konstruktor untuk membuat Garis (tanpa parameter)
    public Garis (){
        awal = new Titik(0,0) ;
        akhir = new Titik(1,1);
        counterGaris++;
    }

    // Konstruktor untuk membuat Garis (dengan parameter)
    public Garis (Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // Selektor Getter
    public Titik getAwal(){
        return awal;
    }

    public Titik getAkhir(){
        return akhir;
    }

    // Selektor Setter
    public void setAwal(Titik awal){
        this.awal = awal;
    } 

    public void setAkhir(Titik akhir){
        this.akhir = akhir;
    }
    
    // Selektor getCounterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    // Menghitung panjang sebuah garis
    public double getPanjang(){
        return Math.sqrt(Math.pow(akhir.getAbsis() - awal.getAbsis(), 2) + Math.pow(akhir.getOrdinat() - awal.getOrdinat(), 2));
    }

    // Mendapatkan gradien garis
    public double getGradien(){
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis()-awal.getAbsis());
    }

    // Mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah(){
        return new Titik((awal.getAbsis()+akhir.getAbsis())/2, (awal.getOrdinat()+akhir.getOrdinat())/2);
    }

    // isSejajar
    public boolean isSejajar(Garis g){
        return this.getGradien() == g.getGradien();
    }

    // isTegakLurus
    public boolean isTegakLurus(Garis g){
        return this.getGradien() * g.getGradien() == -1;
    }

    // Menampilkan ke layar titik awal dan titik akhir garis
    public void printGaris(){
        System.out.println("Titik awal: (" + awal.getAbsis() + ", " + awal.getOrdinat()+")");
        System.out.println("Titik akhir: (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }

    // Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c
    public String getPersamaanGaris(){
        double m = getGradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}