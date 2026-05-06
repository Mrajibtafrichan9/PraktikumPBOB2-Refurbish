/*  Nama Program : Polimorfisme.java
    Deskripsi : Berisi atribut dan metode dalam class Dosen
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Minggu, 8 Maret 2026 
*/
public class cobaPol1 {
    public static void main(String[] args) {
        
        // Atribut
        // Polimorfisme : koersi

        int A = 22;
        int A2 = 7;
        double B = (double) A;
        char C = (char) B;
        int realint = (int) C;

        double pi;
        int pi2;

        pi = (float) A / (float) A2;
        pi2 = (int) pi;

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("Realint = " + realint);
        System.out.println("pi flo = " + pi);
        System.out.println("pi int = " + pi2);

    }
    
}
