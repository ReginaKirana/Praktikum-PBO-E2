/*  Nama File    : Manager.java 
 *  Deskripsi    : Kelas representasi Manager sebagai subclass Pegawai
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package PostTest;
public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    // METHOD
    // Konstruktor
    public Manajer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
