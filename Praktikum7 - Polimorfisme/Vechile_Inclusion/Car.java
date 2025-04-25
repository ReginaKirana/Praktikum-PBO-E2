/*  Nama File    : Car.java 
 *  Deskripsi    : Kelas representasi Car
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : Kamis, 24 April 2025  
 */  

package Vechile_Inclusion;
public class Car extends Vehicle {
     // Override metode calRent untuk menghitung sewa mobil dengan potongan Rp100
    @Override
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.0f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}