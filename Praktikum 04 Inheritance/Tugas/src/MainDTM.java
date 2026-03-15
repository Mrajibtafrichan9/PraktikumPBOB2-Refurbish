/*  Nama Program : MainDTM.java
    Deskripsi :  menggunakan class DosenTamu untuk membuat objek DosenTamu dan memanggil method yang telah dibuat dalam class DosenTamu
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Minggu, 15 Maret 2026 
*/

import java.time.LocalDate;

public class MainDTM {
    public static void main(String[] args){
        DosenTamu DT1 = new DosenTamu();
        DT1.printInfo();

        System.out.println("\n");
        
        DosenTamu DT2 = new DosenTamu();
        DT2.setNIDK("123456");
        DT2.setNIP("9545647548");
        DT2.setNama("Andi");
        DT2.setTanggalLahir(LocalDate.parse("1980-05-20"));
        DT2.setTerhitungMulai(LocalDate.parse("2015-01-01"));
        DT2.setFakultas("Teknik");
        DT2.setGajiPokok(5000000);
        DT2.setMasaKontrak(24);
        DT2.printInfo();
    }
}
