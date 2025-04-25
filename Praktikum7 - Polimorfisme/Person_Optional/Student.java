/*  Nama File    : Student.java 
 *  Deskripsi    : Kelas representasi Student
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Person_Optional;
public class Student extends Person{
    // Konstruktor
    public Student(String name){
        super (name);
    }

    // Override metode isAsleep untuk menyesuaikan waktu tidur student
    // Student tidur jika jam lebih dari 2 dan kurang dari 8
    @Override
    public boolean isAsleep(int hr){
        return hr > 2 && hr < 8;
    }
}