/*  Nama Program : OperatorGenerik.java
    Deskripsi : Berisi atribut dan metode dalam class OperatorGenerik, 
                penerapan generik pada operator
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

public class OperatorGenerik <Generik> {
    
    // Atribut

    Generik A;
    Generik B;
    Generik Temp;

    // Method

    void Tukar(Generik A, Generik B){
        Temp = A;
        A = B;
        B = Temp;
    }

    /*Generik Bobot2(Generik A, Generik B){
        A = A + B;
        return A;
    }*/

}
