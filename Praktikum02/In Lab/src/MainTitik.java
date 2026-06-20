/*  Nama Program : MainTitik.java
    Deskripsi :  menggunakan class Titik untuk membuat objek Titik dan memanggil method yang telah dibuat dalam class Titik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Kamis, 19 Februari 2026 
*/

public class MainTitik{
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(5);
        T1.PrintTitik();
        T1.Geser(3,5);
        T1.PrintTitik();
    }
}