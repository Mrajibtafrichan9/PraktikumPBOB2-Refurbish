/*  Nama Program : Dosen2.java
    Deskripsi : Berisi atribut dan metode dalam class Dosen2
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Sabtu, 14 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;

public class Dosen2 extends Pegawai {
    /***************Atribut***************/

    String Fakultas;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class Dosen2 tanpa parameter
    Dosen2(){
        super();
        this.Fakultas = "-";
    }

    // Merancang sebuah class Dosen2 dengan menambah parameter dari class Pegawai
    Dosen2(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, String Jabatan, String Fakultas, double GajiPokok){
        super(NIP, Nama, TanggalLahir, TerhitungMulai, Jabatan, GajiPokok);
        this.Fakultas = Fakultas;
    }

    /* Selektor */
    // Mengembalikan nilai Fakultas
    String getFakultas(){
        return Fakultas;
    }

    /* Mutator */
    // Mengatur nilai Fakultas
    void setFakultas(String fak){
        Fakultas = fak;
    }

    // Mencetak class Dosen2
}
