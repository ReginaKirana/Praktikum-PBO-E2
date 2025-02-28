/* Nama File    : MMahasiswa.java
 * Deskripsi    : Berisi Implementasi Relasi antara Mahasiswa dengan Dosen, Kendaraan, dan Mata Kuliah
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 27 Februari 2025
 */

package Relasi;
public class MMahasiswa {
     public static void main(String[] args) {
         /************* Data Mata Kuliah *************/
         MataKuliah PBO = new MataKuliah("12PBO", "Pemrograman Berorientasi Objek", 3);
         MataKuliah MBD = new MataKuliah("13MBD", "Manajemen Basis Data", 3);
         MataKuliah KWU = new MataKuliah("14KWU", "Kewirausahaan", 2);
         MataKuliah SD = new MataKuliah("15SD", "Struktur Data", 4);
 
         /************* Data Dosen *************/
         Dosen D1 = new Dosen("123", "Andi", "Matematika");
         Dosen D2 = new Dosen("456", "Brian", "Metode Numerik");
 
         /************* Data Kendaraan *************/
         Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
         Kendaraan K2 = new Kendaraan("H555AB", "Mobil");
 
         /************* Mahasiswa 1 *************/
         Mahasiswa M1 = new Mahasiswa("234", "Rahmat Riansyah", "Informatika");
         M1.setDosenWali(D1);
         M1.setKendaraan(K1);
         M1.addMatkul(MBD);
         M1.addMatkul(SD);
         M1.addMatkul(KWU);
         // Menampilkan data Mahasiswa 1
         System.out.println("---------------------");
         System.out.println("-    Mahasiswa 1    -");
         System.out.println("---------------------");
         M1.printDetailMhs();
         System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
         System.out.println("Total SKS yang diambil = " + M1.getJumlahSKS());
         System.out.println("Total Mata Kuliah yang diambil: " + M1.getJumlahMatkul());
 
         /************* Mahasiswa 2 *************/
         Mahasiswa M2 = new Mahasiswa("678", "Dima Susanti", "Informatika");
         M2.setDosenWali(D2);
         M2.setKendaraan(K2);
         M2.addMatkul(SD);
         M2.addMatkul(KWU);
         M2.addMatkul(MBD);
         M2.addMatkul(PBO);
         // Menampilkan Data mahasiswa 2
         System.out.println("---------------------");
         System.out.println("-    Mahasiswa 2    -");
         System.out.println("---------------------");
         M2.printDetailMhs();
         System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatkul());
         System.out.println("Total SKS yang diambil = " + M2.getJumlahSKS());
         System.out.println("Total Mata Kuliah yang diambil: " + M2.getJumlahMatkul());
 
     } 
 }
 