/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
 * Pembuat      : Regina Sasikirana Farikh (24060123140155)
 * Tanggal      : 06 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instalasi object array integer
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}


// Note: Exception disusun dari khusus ke umum