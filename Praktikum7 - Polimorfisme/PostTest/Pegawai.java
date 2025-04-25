/*  Nama File    : Pegawai.java 
 *  Deskripsi    : Kelas representasi Pegawai sebagai superclass
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package PostTest;
public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    // METHOD
    // Setter
    public void setNama(String name){
        this.nama = name;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}