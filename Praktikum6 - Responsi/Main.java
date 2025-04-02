/* Nama File : Main.java
 * Deskripsi : Program utama untuk mendemonstrasikan penggunaan kelas Ruang, RuangDepartemen,
 *             RuangDosen, RuangKelas, Departemen, Laboratorium, LabKomputer, LabNonKomputer
 * Pembuat   : Regina Sasikirana Farikh
 * Tanggal   : 27 Maret 2025
 */

 public class Main {
    public static void main(String[] args) {
        // Membuat objek Ruang Kelas
        Ruang K1 = new RuangKelas("E201", 10, 8, 5, 40, 35, 5);
        Ruang K2 = new RuangKelas("F302", 12, 9, 5, 50, 45, 5);
        Ruang K3 = new RuangKelas("B105", 15, 12, 5, 60, 57, 3);

        // Membuat departemen
        Departemen deptIF = new Departemen("Informatika", "Dr. Budi Setiawan", 6000);
        Departemen deptBiologi = new Departemen("Biologi", "Dr. Cahya Wirawan", 5500);
        Departemen deptFisika = new Departemen("Fisika", "Dr. Budi Santoso", 6000);

        // Membuat laboratorium komputer
        LabKomputer labKomp1 = new LabKomputer("E301", 10, 8, 3, 30, "Laboratorium Komputer A", 50000, 25);
        LabKomputer labKomp2 = new LabKomputer("E302", 9, 7, 3, 25, "Laboratorium Komputer B", 55000, 30);

        // Membuat laboratorium non-komputer
        String[] matKulBiologi = {"Mikrobiologi", "Genetika"}; // Mata Kuliah untuk laboratorium Biologi
        Laboratorium labBiologi = new LabNonKomputer("L301", 12, 9, 3, 25, "Laboratorium Biologi A", 75000, matKulBiologi);

        String[] matKulFisika = {"Mekanika", "Termodinamika"}; // Mata Kuliah untuk laboratorium Fisika
        LabNonKomputer labFisika = new LabNonKomputer("L302", 11, 8, 3, 20, "Laboratorium Fisika B", 70000, matKulFisika);
        
        // Membuat ruang departemen
        RuangDepartemen ruangInformatika = new RuangDepartemen("E101", 15, 10, 3, 40, 20, 42, 5, deptIF);
        RuangDepartemen ruangFisika = new RuangDepartemen("F102", 14, 9, 3, 35, 18, 37, 4, deptFisika);
        RuangDepartemen ruangBiologi = new RuangDepartemen("B201", 16, 10, 4, 30, 5, 33, 3, deptBiologi);


        // Membuat ruang dosen
        RuangDosen RDosenBudi = new RuangDosen("E201", 6, 4, 3, 2, "Dr. Budi Setiawan", 1, 1, deptIF);
        RuangDosen RDosenAni = new RuangDosen("F103", 5, 4, 3, 2, "Dr. Ani Purwati", 1, 1, deptFisika);
        RuangDosen RDosenCahya = new RuangDosen("B203", 6, 5, 3, 2, "Dr. Cahya Wirawan", 1, 1, deptBiologi);

        // SISTEM MANAJEMEN RUANGAN FSM
        System.out.println("---------------------------------------------------");
        System.out.println("-          SISTEM MANAJEMEN RUANGAN FSM           -");
        System.out.println("---------------------------------------------------");

        // Informasi Ruang Kelas
        System.out.println("---------------------------------------------------");
        System.out.println("-                   RUANG KELAS                   -");
        K1.cetakInfo();
        K2.cetakInfo();
        K3.cetakInfo();

        // Informasi Laboratorium Komputer
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("-             LABORATORIUM - KOMPUTER             -");
        labKomp1.cetakInfo();
        labKomp2.cetakInfo();

        // Informasi Laboratorium Non-Komputer
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("-           LABORATORIUM - NON KOMPUTER           -");
        labBiologi.cetakInfo();
        labFisika.cetakInfo();

        // Informasi Ruangan Departemen
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("-                RUANG DEPARTEMEN                 -");
        ruangInformatika.cetakInfo();
        ruangFisika.cetakInfo();
        ruangBiologi.cetakInfo();

        // Informasi Ruang Dosen
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("-                  RUANG DOSEN                    -");
        RDosenBudi.cetakInfo();
        RDosenAni.cetakInfo();
        RDosenCahya.cetakInfo();


    }
}
