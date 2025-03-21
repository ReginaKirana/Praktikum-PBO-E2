/*  Nama File    : BangunDatar.java  
 *  Deskripsi    : Superclass (Parent) untuk merepresentasikan bangun datar
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */  

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar;

    protected BangunDatar(){
        counterBangunDatar++;
    }

    protected BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Method abstract
    public abstract double getLuas();
    public abstract double getKeliling();

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    // Mathod abs

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

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