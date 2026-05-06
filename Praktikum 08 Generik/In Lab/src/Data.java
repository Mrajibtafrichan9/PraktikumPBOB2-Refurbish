/*  Nama Program : Data.java
    Deskripsi : Berisi atribut dan metode dalam class Data,
                penerapan generik pada larik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

public class Data <Generik> {
    // Atribut

    Generik ruang = (T[]) new Object[100];

    // Method

    Generik getIsi(Generik ruang){
        return this.ruang;
    }

    void setIsi(Generik ruang, Object Obj){
        this.ruang = ruang;
            
    }

}
