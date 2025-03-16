/* Nama File    : Persegi.java
 * Deskripsi    : Subclass BangunDatar untuk merepresentasikan Persegi
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 13 Maret 2025
 */

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    // Override
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // Override (gak bisa, karna static)
    // @Override
    // public static void printCounterBangunDatar(){
    // }
}