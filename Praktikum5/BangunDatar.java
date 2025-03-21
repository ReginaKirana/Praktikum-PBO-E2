/*  Nama File    : BangunDatar.java  
 *  Deskripsi    : Kelas abstrak sebagai dasar untuk berbagai bangun datar,  
 *                 dengan atribut umum serta metode abstrak untuk perhitungan luas dan keliling
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */  

public abstract class BangunDatar {
    // ==== Atribut ====
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar;

    // ==== Konstruktor ====
    // Konstruktor default (tanpa parameter)
    protected BangunDatar(){
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    protected BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // ==== Metode Abstrak ====
    // Metode abstrak untuk menghitung luas (harus diimplementasikan oleh subclass)
    public abstract double getLuas();
    // Metode abstrak untuk menghitung keliling (harus diimplementasikan oleh subclass)
    public abstract double getKeliling();

    // ==== Selektor & Mutator ====
    // Getter untuk jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Setter untuk jumlah sisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // Getter untuk warna
    public String getWarna(){
        return warna;
    }

    // Setter untuk warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    // Getter untuk border
    public String getBorder(){
        return border;
    }

    // Setter untuk border
    public void setBorder(String border){
        this.border = border;
    }

    // ==== Method ====
    // Mencetak informasi umum mengenai bangun datar
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
    
    // Mencetak jumlah objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }

    // Fungsi untuk membandingkan luas objek bangun datar sama atau tidak
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    // Fungsi untuk membandingkan keliling objek bangun datar sama atau tidak
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}