/*  Nama File    : Lingkaran.java  
 *  Deskripsi    : Subclass BangunDatar untuk merepresentasikan lingkaran.  
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 13 Maret 2025  
 */  

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter/2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    // Override
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + jari);
    }
}