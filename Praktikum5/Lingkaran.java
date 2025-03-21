/*  Nama File    : Lingkaran.java  
 *  Deskripsi    : Subclass BangunDatar untuk merepresentasikan lingkaran.  
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */  

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
    }

    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getDiameter(){
        return jari * 2;
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
        System.out.println("Luas: " + getLuas());
    }
    
    // Prosedur implementasi IResize
    // Menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    // Mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}