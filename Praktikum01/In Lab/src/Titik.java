/*  Nama Program : Titik.java
    Deskripsi : Berisi atribut dan metode dalam class titik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Kamis, 19 Februari 2026 
*/

public class Titik {
    /******Atribut******/
    double absis;
    double ordinat;

    /*******Metode*******/
    //Konstruktor untuk membuat titik (0,0)//
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    //Mengembalikan nilai absis//
    double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat//
    double getOrdinat(){
        return ordinat;
    }

    //Mengatur nilai absis//
    void setAbsis(double x){
        absis = x;
    }

    //Mengatur nilai ordinat//
    void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis sejauh x dan menggeser ordinat sejauh y//
    void Geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
  
    //Mencetak absis dan ordinat menjadi sebuah titik//
    void PrintTitik(){
        System.out.println("Titik : (" + absis + "," + ordinat + ")");
    }//end class titik
}


