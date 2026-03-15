/*  Nama Program : DosenTetap.java
    Deskripsi : Berisi atribut dan metode dalam class DosenTetap
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Sabtu, 14 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen2 {
    /***************Atribut***************/

    String NIDN;
    int BUP = 65;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class DosenTetap tanpa parameter
    DosenTetap(){
        super();
        this.NIDN = "-";
    }
    // Merancang sebuah class Dosen2 dengan menambah parameter dari class Pegawai
    DosenTetap(String NIDN, String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, String Jabatan, String Fakultas, int GajiPokok){
        super(NIP, Nama, TanggalLahir, TerhitungMulai, "Dosen Tetap", Fakultas, GajiPokok);
        this.NIDN = NIDN;
    }

    /* Selektor */
    // Mengembalikan nilai NIDN
    String getNIDN(){
        return NIDN;
    }

    // Mengembalikan nilai total tunjangan
    int getTunjangan(){
        int Tunjangan = 2 / 100 * getMKTahun() * getGajiPokok();
        return Tunjangan;
    }

    // Mengembalikan tanggal pensiun
    String getPensiun(){
        LocalDate Pensiun = getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
        DateTimeFormatter DMY3 = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        return Pensiun.format(DMY3);
    }

    /* Mutator */
    // Mengatur nilai NIDN
    void setNIDN(String NIDNas){
        NIDN = NIDNas;
    }
    

    // Mencetak class Dosen Tetap
    void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDN : " + getNIDN());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT : " + TMTDMY());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Fakultas = " + getFakultas());
        System.out.println("Masa Kerja : " + getMKTahun() + " Tahun " + getMKBulan() + " Bulan");
        System.out.println("Tanggal Pensiun : " + getPensiun());
        System.out.println("Tunjangan =  2% x " + getMKTahun() + " x " + getGajiPokok() + " = " + getTunjangan());
    }
}
