/*  Nama File    : MainDao.java
 *  Deskripsi    : Main program untuk akses DAO
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 15 Mei 2025  
*/  

public class MainDAO {
    public static void main(String[] args) {
        // Membuat objek Person baru dengan nama "Indra"
        Person person = new Person("Indra");
        
        // Membuat instance DAOManager
        DAOManager m = new DAOManager();

        // Menetapkan implementasi PersonDAO ke MySQLPersonDAO
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            // Menyimpan objek Person ke database melalui DAO
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            // Menangani jika terjadi error selama penyimpanan data
            e.printStackTrace();
        }
    }
}