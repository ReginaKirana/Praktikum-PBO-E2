/*  Nama File    : Vechile.java 
 *  Deskripsi    : Kelas representasi Vechile (superclass)
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Vechile_Inclusion;
public class Vehicle {
    // Metode untuk menghitung biaya sewa berdasarkan jarak dan harga per km
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }

    // Metode statis untuk memanggil calRent pada objek Vehicle dengan nilai tetap
    public static void hitungSewa(Vehicle v){
        v.calRent(100, 8000);
    }
}