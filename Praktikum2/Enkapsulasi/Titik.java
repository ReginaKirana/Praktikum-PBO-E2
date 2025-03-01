/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik dengan Enkapsulasi
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */

public class Titik {
    /************* ATRIBUT *************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /************* METHOD *************/
    // Konstruktor untuk membuat titik (0,0)
    public Titik(double x,  double y){
        this.absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Titik tanpa overload (dengan inputan)
    public Titik (){
        this(0,0);
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // Getter untuk Absis dan Ordinat
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    // Setter untuk absis dan ordinat
    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    // Geser
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Kuadran Titik
    public int getKuadran(){
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0; 
    }

    // Menghitung Titik ke Jarak Pusat
    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Menghitung Jarak antara 2 Titik
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(T.absis - this.absis,2) + Math.pow(T.ordinat - this.ordinat, 2));
    }

    // RefleksiX
    public void refleksiX(){
        ordinat = ordinat * (-1);
    }

    // RefleksiY
    public void refleksiY(){
        absis = absis * (-1);
    }

    // getRefleksiX()
    public Titik getRefleksiX(){
        Titik T1;
        T1 = new Titik();
        T1.ordinat = ordinat * (-1);
        T1.absis = absis;
        return T1;
    }

    // getRefleksiY()
    public Titik getRefleksiY(){
        Titik TA;
        TA = new Titik();
        TA.absis = absis * (-1);
        TA.ordinat = ordinat;
        return TA;
    }
} // End class Titik