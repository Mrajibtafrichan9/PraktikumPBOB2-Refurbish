/*  Nama Program : Garis.java
    Deskripsi : Berisi atribut dan metode dalam class garis
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 25 Februari 2026 
*/
public class Garis {
    /******Atribut******/
    Titik2 TAwal;
    Titik2 TAkhir;
    static int counterGaris;

    /*******Konstruktor*********/
    //Membuat sebuah titik dengan TAwal (0,0) dan TAkhir (1,1)//
    Garis(){
        TAwal.absis = 0;
        TAwal.ordinat = 0;
        TAkhir.absis = 1;
        TAkhir.ordinat = 1;
        counterGaris++;
    }

    //Membuat sebuah titik dengan TAwal (x0,y0) dan TAkhir (x1,y1)//
    Garis(Titik2 TAwal, Titik2 TAkhir){
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        counterGaris++;
    }

    /******Selektor*******/
    //Mengembalikan nilai sebuah titik awal//
    Titik2 getTitikAwal(){
        return TAwal;
    }

    //Mengembalikan nilai sebuah titik akhir//
    Titik2 getTitikAkhir(){
        return TAkhir;
    }

    /******Mutator******/
    void setTitikAwal(Titik2 TAwal){
        this.TAwal = TAwal;
    }

    void setTitikAkhir(Titik2 TAkhir){
        this.TAkhir = TAkhir;
    }

    //Menghitung panjang garis//
    double panjangGaris(){
        return Math.sqrt(Math.pow((TAkhir.absis - TAwal.absis),2) + Math.pow((TAkhir.ordinat - TAwal.ordinat),2));
    }

    //Menghitung gradien garis//
    double gradienGaris(){
        return (TAkhir.ordinat - TAwal.ordinat) / (TAkhir.absis - TAwal.absis);
    }

    //Mencari titik tengah garis//
    Titik2 titikTengah(){
        TAwal.absis = TAwal.absis + ((TAkhir.absis - TAwal.absis)/2);
        TAwal.ordinat = TAwal.ordinat + ((TAkhir.ordinat - TAwal.ordinat)/2);
        return TAwal;
    }

    //Apakah tegak lurus//
    boolean IsTegakLurus(Garis G1, Garis G2){
        return G1.gradienGaris() == - G2.gradienGaris();
    }

    //Apakah sejajar//
    boolean IsSejajar(Garis G1, Garis G2){
        return G1.gradienGaris() == G2.gradienGaris();
    }

    void printGaris(){
        System.out.println("titik awal = " + this.getTitikAwal() + ", titik akhir = " + this.getTitikAkhir());
    }
}
