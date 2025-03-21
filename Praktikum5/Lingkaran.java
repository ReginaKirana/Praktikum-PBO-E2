/*  Nama File    : Lingkaran.java  
 *  Deskripsi    : Subclass BangunDatar untuk merepresentasikan lingkaran
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */  

public class Lingkaran extends BangunDatar implements IResize{
    // === Atribut ===
    private double jari;

    // === Konstruktor ===
    // Konstruktor default tanpa parameter
    public Lingkaran(){
    }

    // Konstruktor dengan parameter untuk jari-jari, warna, dan border
    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    // === Getter dan Setter ===
    // Mengembalikan nilai jari-jari lingkaran
    public double getJari(){
        return jari;
    }

    // Mengatur nilai jari-jari lingkaran
    public void setJari(double jari){
        this.jari = jari;
    }

    // Menghitung diameter lingkaran (2 * jari-jari)
    public double getDiameter(){
        return jari * 2;
    }

    // Menghitung luas lingkaran (π * jari-jari^2)
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    // Menghitung keliling lingkaran (2 * π * jari-jari)
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

     // Menampilkan informasi lengkap tentang lingkaran
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + jari);
        System.out.println("Luas: " + getLuas());
    }
    
    // === Implementasi IResize ===
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