/*  Nama Program : Dosen2.java
    Deskripsi : Berisi atribut dan metode dalam class Dosen2
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Sabtu, 14 Maret 2026 
*/

public class Dosen2 extends Pegawai {
    /***************Atribut***************/

    String Fakultas;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class Dosen2 dengan menambah parameter dari class Pegawai
    Dosen2(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, String Fakultas, int GajiPokok){
        super(NIP, Nama, TanggalLahir, TerhitungMulai, GajiPokok);
        this.Fakultas = Fakultas;
    }
}
