/*  Nama File    : IResize.java  
 *  Deskripsi    : Interface untuk mengubah ukuran objek dengan metode 
 *                 zoom in, zoom out, dan skala sesuai persentase.
 *  Pembuat      : Regina Sasikirana Farikh (24060123140155)  
 *  Tanggal      : 20 Maret 2025  
 */  

public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}