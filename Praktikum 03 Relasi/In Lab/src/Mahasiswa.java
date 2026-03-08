/*  Nama Program : Mahasiswa.java
    Deskripsi : Berisi atribut dan metode dalam class Mahasiswa
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Minggu, 8 Maret 2026 
*/

public class Mahasiswa {

    /***************Atribut***************/
    String NamaMhs;
    Kendaraan Kendaraan;

    /***************Metode***************/
    /* Konstruktor */
    // Merancang sebuah class MataKuliah dengan parameter NamaMhs, noPlat dan Jenis
    public Mahasiswa(String NamaMhs, String noPlat, String Jenis){
        this.NamaMhs = NamaMhs;
        this.Kendaraan = new Kendaraan(noPlat, Jenis);
    }

    public void printMhs(){
        System.out.println("Nama mahasiswa : " + NamaMhs);
        Kendaraan.printKendaraan();
    }
}
