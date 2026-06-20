/*  Nama Program : Polimorfisme2.java
    Deskripsi : Berisi contoh penerapan polimorfisme overloading
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Minggu, 22 April 2026 
*/
public class cobaPol2 {
    
    // Atribut

    int A, B, C;

    //Metode
    //Polimorfisme : penerapan overlo

    void Arit(){
        A = 10 + 20;
        System.out.println("Arit A = " + A);
    }

    void Arit(int A, int B){
        A = (A + B) - 11;
        System.out.println("Arit2 = " + A);
    }

    void Arit(int A, int B, int C){
        C = (A + B) + (A + C) + (B + C);
        System.out.println("Arit3 = " + C);
    }

    
    
}
