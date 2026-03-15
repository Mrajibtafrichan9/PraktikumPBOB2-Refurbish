/*  Nama Program : MainTendik.java
    Deskripsi :  menggunakan class Tendik untuk membuat objek Tendik dan memanggil method yang telah dibuat dalam class Tendik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Minggu, 15 Maret 2026 
*/

import java.time.LocalDate;

public class MainTendik {
    public static void main(String[] args){
        Tendik T1 = new Tendik();
        T1.printInfo();

        System.out.println("\n");
        
        Tendik T2 = new Tendik();
        T2.setNIP("9545647548");
        T2.setNama("Andi");
        T2.setTanggalLahir(LocalDate.parse("1980-05-20"));
        T2.setTerhitungMulai(LocalDate.parse("2015-01-01"));
        T2.setBidang("Teknik");
        T2.setGajiPokok(5000000);
        T2.printInfo();
    }
}
