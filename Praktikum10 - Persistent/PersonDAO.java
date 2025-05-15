 /* Nama File    : PersonDao.java
 *  Deskripsi    : Interface untuk person access object
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 15 Mei 2025  
 */  

public interface PersonDAO {
    // Method untuk menyimpan objek Person ke dalam database
    public void savePerson(Person P) throws Exception;
}