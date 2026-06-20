/*  Nama Program : Titik.java
    Deskripsi : Berisi atribut dan metode dalam class titik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Kamis, 19 Februari 2026 
*/

public class Titik2 {
    /******Atribut******/
    double absis;
    double ordinat;
    static int counterTitik2;

    /*******Metode*******/
    //Konstruktor untuk membuat titik (0,0)//
    Titik2(){
        this(0,0);
        counterTitik2++;
    }

    //Konstruktor untuk membuat titik (x,y)//
    Titik2(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik2++;
    }

    //Penghitung jumlah titik yang telah dibuat
    static int getcounterTitik(){
        return counterTitik2;
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
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mengeluarkan kuadran dari sebuah titik//
    double getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        }else{
            if(absis < 0 && ordinat > 0){
                return 2;
            }else{
                if(absis < 0 && ordinat < 0){
                    return 3;
                }else{
                    if(absis > 0 && ordinat < 0){
                    return 4;
                    }else{
                        return 0;
                    }
                }
            }
        }
    }

    //Mengembalikan nilai jarak dari titik (0,0)//
    double getJarakPusat(){
        return Math.sqrt((this.absis*this.absis)+(this.ordinat*this.ordinat));
    }

    //Mengembalikan nilai jarak dari kedua garis//
    double getJarak(Titik2 T2){
        double lengx2, lengy2;
        lengx2 = (T2.absis - this.absis)*(T2.absis - this.absis);
        lengy2 = (T2.ordinat - this.ordinat)*(T2.ordinat - this.ordinat);
        return Math.sqrt(lengx2+lengy2);

    }

    //Mencari hasil dari refleksi X dari suatu titik//
    void refleksiX(){
        ordinat = - ordinat;
    }

    //Mencari hasil dari refleksi X dari suatu titik//
    void refleksiY(){
        absis = - absis;
    }

    //Mengembalikan nilai refleksi terhadap X//
    double getRefleksiX(){
        return -this.ordinat;
    }

    //Mengembalikan nilai refleksi terhadap Y//
    double getRefleksiY(){
        return -this.absis;
    }

    //Mencetak absis dan ordinat menjadi sebuah titik//
    void PrintTitik(){
        System.out.println("Titik : (" + absis + "," + ordinat + ")");
    }//end class titik

    //Mencetak jumlah titik yang telah dibuat//
    /*void Printcounter(){
        System.out.println("Jumlah titik yang telah dibuat: "+this.counterTitik2);
    }*/
}


