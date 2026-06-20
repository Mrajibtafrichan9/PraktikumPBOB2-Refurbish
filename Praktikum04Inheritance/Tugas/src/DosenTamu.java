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
    DosenTamu(String NIDK, String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, String Jabatan, String Fakultas, double GajiPokok, int MasaKontrak){
        super(NIP, Nama, TanggalLahir, TerhitungMulai, Jabatan, Fakultas, GajiPokok);
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
    double getTunjangan(){
        return 0.025 * getGajiPokok();
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

    // Mencetak class Dosen Tamu
    void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("NIDK : " + getNIDK());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + TLDMY());
        System.out.println("TMT : " + TMTDMY());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kontrak : " + MasaKontrak / 2 + " Tahun " + MasaKontrak % 2 + " Bulan");
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan :  2,5% x " + getGajiPokok() + " = " + getTunjangan());
    }
}
