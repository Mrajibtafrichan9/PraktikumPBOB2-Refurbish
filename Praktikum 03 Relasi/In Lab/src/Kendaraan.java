/*  Nama Program : Kendaraan.java
    Deskripsi : Berisi atribut dan metode dalam class Kendaraan
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Minggu, 8 Maret 2026 
*/

public class Kendaraan {
    
    /***************Atribut***************/
    String noPlat;
    String Jenis;

    /***************Metode***************/
    /* Konstruktor */ 
    // Merancang sebuah class Kendaraan tanpa parameter
    Kendaraan(){
        this.noPlat = "XX0000XX";
        this.Jenis = "-";
    }

    // Merancang sebuah class Kendaraan dengan parameter noPlat dan Jenis
    Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    /* Selektor */ 
    // Mengembalikan nilai dari noPlat Kendaraan
    String getnoPlat(){
        return noPlat;
    }

    // Mengembalikan nilai dari Jenis Kendaraan
    String getJenis(){
        return Jenis;
    }

    /* Mutator */ 
    // Mengatur nilai dari noPlat Kendaraan
    void setnoPlat(String NoPlat1){
        noPlat = NoPlat1;
    }

    // Mengatur nilai dari Jenis Kendaraan
    void setJenis(String Jenis1){
        Jenis = Jenis1;
    }
}
