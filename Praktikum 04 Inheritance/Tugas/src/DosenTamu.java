/*  Nama Program : DosenTetap.java
    Deskripsi : Berisi atribut dan metode dalam class DosenTetap
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Sabtu, 14 Maret 2026 
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen2 {
    /***************Atribut***************/

    String NIDK;
    int MasaKontrak;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class DosenTamu tanpa parameter
    DosenTamu(){
        super();
        this.NIDK = "-";
        this.MasaKontrak = 0;
    }
    // Merancang sebuah class DosenTamu dengan menambah parameter dari class Dosen2
    DosenTamu(String NIDK, String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, String Jabatan, String Fakultas, int GajiPokok, int MasaKontrak){
        super(NIP, Nama, TanggalLahir, TerhitungMulai, "Dosen Tamu", Fakultas, GajiPokok);
        this.NIDK = NIDK;
        this.MasaKontrak = MasaKontrak;
    }

    /* Selektor */
    // Mengembalikan nilai NIDN
    String getNIDK(){
        return NIDK;
    }

    // Mengembalikan nilai Masa kontrak
    int getMasaKontrak(){
        return MasaKontrak;
    }

    // Mengembalikan nilai total tunjangan
    int getTunjangan(){
        return 25 / 1000 * getGajiPokok();
    }

    /* Mutator */
    // Mengatur nilai NIDN
    void setNIDK(String NIDKon){
        NIDK = NIDKon;
    }

    // Mengatur nilai Masa Kontrak
    void setMasaKontrak(int Bulan){
        MasaKontrak = Bulan;
    }

    // Mencetak class Dosen Tetap
    void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDK : " + getNIDK());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT : " + TMTDMY());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Fakultas = " + getFakultas());
        System.out.println("Masa Kontrak : " + MasaKontrak / 2 + " Tahun " + MasaKontrak % 2 + " Bulan");
    //    System.out.println("Tanggal Pensiun : " + getPensiun());
        System.out.println("Tunjangan =  2,5% x " + getGajiPokok() + " = " + getTunjangan());
    }
}
