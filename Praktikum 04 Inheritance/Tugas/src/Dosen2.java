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
    Dosen2(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, String Fakultas, int GajiPokok){
        super(NIP, Nama, TanggalLahir, TerhitungMulai, GajiPokok);
        this.Fakultas = Fakultas;
    }

    /* Selektor */
    // Mengembalikan nilai Fakultas
    String getFakultas(){
        return Fakultas;
    }

    // Mengembalikan nilai masa kerja
    Period getMasaKerja(){
        return MasaKerja = Period.between(TerhitungMulai, LocalDate.now() );
    }

    // Mengembalikan nilai masa kerja dalam tahun
    Period getMKTahun(){
        return MasaKerja.getYear();
    }

    // Mengembalikan nilai masa kerja dalam bulan
    Period getMKBulan(){
        return MasaKerja.getMonth();
    }

    /* Mutator */
    // Mengatur nilai Fakultas
    void getFakultas(String fak){
        Fakultas = fak;
    }

    // Mencetak class Dosen2
}
