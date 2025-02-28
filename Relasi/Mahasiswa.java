/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */

package Relasi;
import java.util.ArrayList;

public class Mahasiswa {
    /************* ATRIBUT *************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    /************* METHOD *************/
    // Konstruktor untuk membuat objek Mahasiswa (tanpa parameter)
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    // Konstruktor untuk membuat objek Mahasiswa (dengan parameter)
    public Mahasiswa (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    //  Getter untuk mendapatkan NIM mahasiswa
    public String getNim(){
        return this.nim;
    }

    //  Getter untuk mendapatkan nama mahasiswa
    public String getNama(){
        return this.nama;
    }

    //  Getter untuk mendapatkan program studi mahasiswa
    public String getProdi(){
        return this.prodi;
    }

    //  Getter untuk mendapatkan nama dosen wali mahasiswa
    public Dosen getDosenWali(){
        return this.dosenwali;
    }

    //  Getter untuk mendapatkan informasi kendaraan mahasiswa
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    // Setter untuk mengatur NIM mahasiswa
    public void setNim(String NIM){
        this.nim = NIM;
    }

    // Setter untuk mengatur nama mahasiswa
    public void setNama(String Nama){
        this.nama = Nama;
    }

    // Setter untuk mengatur program studi mahasiswa
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // Setter untuk mengatur dosen wali mahasiswa
    public void setDosenWali(Dosen dosenwali){
        this.dosenwali = dosenwali;
    }

    // Setter untuk mengatur kendaraan mahasiswa
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Prosedur untuk menambahkan mata kuliah mahasiswa ke dalam daftar jika belum mencapai batas maksimal (50)
    public void addMatkul(MataKuliah matakuliah){
        if (this.listMatKul.size() < 50){
            this.listMatKul.add(matakuliah);
        } else {
            System.out.println("List Mata Kuliah Sudah Penuh");
        }
    }

    // Fungsi untuk menghitung total SKS yang diambil mahasiswa
    public int getJumlahSKS(){
        int jumlah = 0 ;
        for(MataKuliah matkul : this.listMatKul){
            jumlah += matkul.getSKS();
        }
        return jumlah;
    }

    // Fungsi untuk mengetahui jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return this.listMatKul.size();
    }

    // Prosedur untuk mnampilkan informasi dasar mahasiswa
    public void printMhs(){
        System.out.println("NIM \t\t:" + nim);
        System.out.println("Nama \t\t:" + nama);
        System.out.println("Prodi \t\t:" + prodi);
    }

    // Prosedur untuk menampilkan informasi lengkap mahasiswa
    public void printDetailMhs(){
        printMhs();
        System.out.println("Daftar Mata Kuliah");
        int i;
        for (i = 0 ; i < listMatKul.size() ; i++){
            System.out.println((i+1) + "." + listMatKul.get(i).getNamaMK());
        }
        System.out.println("Dosen Wali\t:" + dosenwali.getNama());
        System.out.println("Kendaraan\t:" + kendaraan.getJenis());
    }
}