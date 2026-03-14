/*  Nama Program : Pegawai.java
    Deskripsi : Berisi atribut dan metode dalam class Pegawai
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Sabtu, 14 Maret 2026 
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    /***************Atribut***************/
    
    String NIP;
    String Nama;
    LocalDate TanggalLahir;
    LocalDate TerhitungMulai;
    int GajiPokok;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class Pegawai tanpa parameter
    Pegawai(){
        this.NIP = "*****";
        this.Nama = "AAAAAA";
        this.TanggalLahir = LocalDate.now();
        this.TerhitungMulai = LocalDate.of(2015,01,01);
        this.GajiPokok = 0;
    }

    // Merancang sebuah class Pegawai dengan parameter terlampir
    Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TerhitungMulai, int GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TerhitungMulai = TerhitungMulai;
        this.GajiPokok = GajiPokok;
    }

    /* Selektor */
    // Mengembalikan nilai NIP
    String getNIP(){
        return NIP;
    }

    // Mengembalikan nilai Nama
    String getNama(){
        return Nama;
    }

    // Mengembalikan nilai TanggalLahir
    LocalDate getTanggalLahir(){
        return TanggalLahir;
    }

    // Mengembalikan nilai TerhitungMulai
    LocalDate getTerhitungMulai(){
        return TerhitungMulai;
    }

    // Mengembalikan nilai GajiPokok
    int getGajiPokok(){
        return GajiPokok;
    }

    // Mengubah format tanggal menjadi DD-MMMM-YYYY
    DateTimeFormatter DMY(){
        return DMY = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    }

    // Mengembalikan Terhitung Mulai dengan format DD-MMMM-YYYY
    String TMTDMY(){
        return TMTDMY = TerhitungMulai.format(DMY);
    }

    // Mengembalikan Tanggal Lahir dengan format DD-MMM-YYYY
    String TLDMY(){
        return TLDMY = TanggalLahir.format(DMY);
    }

    /* Mutator */
    // Mengatur nilai NIP
    void setNIP(String NIPegawai){
        NIP = NIPegawai;
    }

    // Mengatur nilai Nama
    void setNama(String Nama1){
        Nama = Nama1;
    }

    // Mengatur nilai TanggalLahir
    void setTanggalLahir(LocalDate TL){
        TanggalLahir = TL;
    }

    // Mengatur nilai TerhitungMulai
    void setTerhitungMulai(LocalDate TMT){
        TerhitungMulai = TMT;
    }

    // Mengatur nilai GajiPokok
    void setGajiPokok(int Gaji){
        GajiPokok = Gaji;
    }

    // Mencetak 
}
