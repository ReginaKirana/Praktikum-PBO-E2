/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */
 
package Relasi;
public class Kendaraan {
    /************* ATRIBUT *************/
    private String noPlat;
    private String Jenis; 

    /************* METHOD *************/
    // Konstruktor untuk membuat objek Kendaraan (tanpa parameter)
    public Kendaraan(){

    }

    // Konstruktor untuk membuat objek Kendaraan (dengan parameter)
    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    //  Getter untuk mendapatkan plat nomor kendaraan
    public String getNoPlat(){
        return this.noPlat;
    }

    //  Getter untuk mendapatkan jenis kendaraan
    public String getJenis(){
        return this.Jenis;
    }

    // Setter untuk mengatur plat nomor kendaraan
    public void setNoPlat(String noplat){
        this.noPlat = noplat;
    }

    // Setter untuk mengatur jenis kendaraan motor atau mobil
    public void setJenis(String jenis){
        if(jenis.equalsIgnoreCase("Motor") || jenis.equalsIgnoreCase("Mobil")){
            this.Jenis = jenis;
        } else {
            System.out.println("Jenis Kendaraan harus Motor atau Mobil");
        }
    }
}