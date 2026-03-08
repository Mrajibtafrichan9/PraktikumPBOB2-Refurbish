/*  Nama Program : MainTitik.java
    Deskripsi :  menggunakan class Titik untuk membuat objek Titik dan memanggil method yang telah dibuat dalam class Titik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Kamis, 19 Februari 2026 
*/

public class MainTitik2{
    public static void main(String[] args){
        Titik2 T1 = new Titik2();
        //Titik2 T2 = new Titik2(11,27);

        T1.setAbsis(3);
        T1.setOrdinat(5);
        T1.PrintTitik();
        T1.geser(3,5);
        T1.PrintTitik();
        T1.refleksiX();
        T1.PrintTitik();
        //Titik2.Printcounter()
    }
}