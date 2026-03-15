/*  Nama Program : Tendik.java
    Deskripsi : Berisi atribut dan metode dalam class Tendik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Sabtu, 14 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {
    /***************Atribut***************/

    String Fakultas;
    int BUP = 55;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class Tendik tanpa parameter
    Tendik(){
        super();
        this.Bidang = "-";
    }

    // Merancang sebuah class Tendik dengan menambah parameter dari class Pegawai
    Tendik(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, String Bidang, int GajiPokok){
        super(NIP, Nama, TanggalLahir, TerhitungMulai, GajiPokok);
        this.Bidang = Bidang;
    }

    /* Selektor */
    // Mengembalikan nilai Fakultas
    String getBidang(){
        return Bidang;
    }

    // Mengembalikan nilai total tunjangan
    int getTunjangan(){
        return 1 / 100 * getMKTahun() * getGajiPokok();
    }

    // Mengembalikan tanggal pensiun
    String getPensiun(){
        LocalDate Pensiun = getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
        DateTimeFormatter DMY3 = DateTimeFormatter.ofPattern("dd MMMM yyyy", new locale("id", "ID"));
        return Pensiun.format(DMY3);
    }


    /* Mutator */
    // Mengatur nilai Bidang
    void setBidang(String bid){
        Bidang = bid;
    }

    // Mencetak class Tendik
    void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDN : " + getNIDN());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.printLn("TMT : " + TMTDMY());
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang = " + getBidang());
        System.out.println("Masa Kerja : " + getMKTahun() + " Tahun " + getMKBulan() + " Bulan");
        System.out.println("Tanggal Pensiun : " + getPensiun());
        System.out.println("Tunjangan =  2% x " + getMKTahun() + " x " + getGajiPokok() + " = " + getTunjangan());
    }
}
