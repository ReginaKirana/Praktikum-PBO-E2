/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */

package Relasi;

public class Dosen {
    /************* ATRIBUT *************/
    private String nip;
    private String nama;
    private String prodi;

    /************* METHOD *************/
    // Konstruktor untuk membuat objek Dosen (tanpa parameter)
    public Dosen(){
    
    }

    // Konstruktor untuk membuat objek Dosen (dengan parameter)
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //  Getter untuk mendapatkan NIP dosen
    public String getNip(){
        return this.nip;
    }

    // Getter untuk mendapatkan nama dosen
    public String getNama(){
        return this.nama;
    }

    // Getter untuk mendapatkan program studi yang diampu dosen
    public String getProdi(){
        return this.prodi;
    }

    // Setter untuk mengatur NIP dosen
    public void setNip(String Nip){
        this.nip = Nip;
    }

    // Setter untuk mengatur nama dosen
    public void setNama(String Name){
        this.nama = Name;
    }

    // Setter untuk mengatur program studi yang diampu dosen
    public void setProdi(String prod){
        this.prodi = prod;
    }
}