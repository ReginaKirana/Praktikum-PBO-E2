/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class Mata Kuliah
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */

package Relasi;
/************* ATRIBUT *************/
public class MataKuliah {
    private String IDMatKul;
    private String nama;
    private int SKS;
 
    /************* METHOD *************/
    // Konstruktor untuk membuat objek Mata Kuliah (tanpa parameter)
    public MataKuliah(){
 
    }
 
    // Konstruktor untuk membuat objek Dosen (dengan parameter)
    public MataKuliah(String IDMatKul, String nama, int SKS){
        this.IDMatKul = IDMatKul;
        this.nama = nama;
        this.SKS = SKS;
    }
 
    //  Getter untuk mendapatkan ID Mata Kuliah
    public String getIDMatKul(){
        return this.IDMatKul;
    }
 
    //  Getter untuk mendapatkan nama mata kuliah
    public String getNamaMK(){
        return this.nama;
    }
 
    //  Getter untuk mendapatkan sks mata kuliah
    public int getSKS(){
        return this.SKS;
    }
 
    // Setter untuk mengatur ID Mata Kuliah
    public void setIDMatKul(String idMatkul){
        this.IDMatKul = idMatkul;
    }
 
    // Setter untuk mengatur nama mata kuliah
    public void setNamaMK(String namaMK){
        this.nama = namaMK;
    }
 
    // Setter untuk mengatur sks mata kuliah
    public void setSKS(int sks){
        this.SKS = sks;
    }
} 