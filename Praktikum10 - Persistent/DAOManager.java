/*  Nama File    : DAOManager.java
 *  Deskripsi    : Pengelola DAO dalam program
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 15 Mei 2025  
*/  

public class DAOManager {
    // ==== Atribut ====
    private PersonDAO personDAO;

    // ==== Method ====
    // Method untuk menetapkan (set) objek PersonDAO
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    // Method untuk mengambil (get) objek PersonDAO
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}