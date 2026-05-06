/*  Nama Program : Piaraan.java
    Deskripsi : Berisi atribut dan metode dalam class Piaraan,
                penerapan koleksi pada larik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 6 Mei 2026 
*/

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    
    //Atribut

    int nbelm;
    Queue<Anabul> Lanabul;

    //Methods

    Piaraan(){
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    int getNbelm() {
        return nbelm;
    }

    void enqAnabul(Anabul anabul){
        Lanabul.offer(anabul);
        nbelm++;
    }

    boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    void getAnabul(){
        Lanabul.peek();
    }

    Anabul deqAnabul(){
        nbelm--;
        return Lanabul.poll();

    }

    void showAnabul(){
        for(Anabul anabul : Lanabul){
            System.out.println("Nama : " + anabul.getNama());
        }
    }

    int countKucing(String Nama){
        int count = 0;
        for(Anabul anabul : Lanabul){
            if(anabul.getNama().equals(Nama)){
                count++;
            }
        }
        return count;
    }

    

}
