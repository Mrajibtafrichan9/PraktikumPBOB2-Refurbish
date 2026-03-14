/*  Nama Program : MainDTTP.java
    Deskripsi :  menggunakan class DosenTetap untuk membuat objek DosenTetap dan memanggil method yang telah dibuat dalam class DosenTetap
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 11 Maret 2026 
*/

public class MainDTTP {
    public static void main(String[] args){
        DosenTetap DT1 = new DosenTetap();
        DT1.printInfo();
        
        DosenTetap DT2 = new DosenTetap();
        DT2.setNIP("9545647548");
        DT2.setNIDN("78647324");
        DT2.setNama("Andi");
        DT2.setTanggalLahir("1990-05-05");
        DT2.setTerhitungMulai("2015-01-01");
        DT2.setJabatan("Dosen Tetap");
        DT2.setFakultas("Teknik");
        DT2.setGajiPokok(5000000);
        DT2.printInfo();

    }
}
