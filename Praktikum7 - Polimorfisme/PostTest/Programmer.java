/*  Nama File    : Programmer.java 
 *  Deskripsi    : Kelas representasi Programmer sebagai subclass Pegawai
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package PostTest;
public class Programmer extends Pegawai{
    private int bonus = 450000;

    // METHOD
    // Konstruktor
    public Programmer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}