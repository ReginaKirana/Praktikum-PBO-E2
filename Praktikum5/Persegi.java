/*  Nama File    : Lingkaran.java  
 *  Deskripsi    : Subclass BangunDatar untuk merepresentasikan Persegi
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */  

public class Persegi extends BangunDatar implements IResize {
    // === Atribut ===
    private double sisi;

    // === Konstruktor ===
    // Konstruktor default
    public Persegi(){
        setJmlSisi(4);
    }
    // Konstruktor dengan parameter
    public Persegi (double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Getter untuk sisi
    public double getSisi(){
        return sisi;
    }

    // Setter untuk sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // Menghitung luas
    public double getLuas(){
        return sisi * sisi;
    }

    // Menghitung keliling
    public double getKeliling(){
        return 4 * sisi;
    }

    // Menghitung panjang diagonal
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    // Override printInfo untuk menampilkan informasi lebih lengkap
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
    }

    // === Implementasi IResize ===
    // Menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    // Mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}