/*  Nama Program : Persegi.java
    Deskripsi : Berisi atribut dan metode dalam class Persegi
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 11 Maret 2026 
*/

public class Persegi extends BangunDatar {
   /***************Atribut***************/

    double Sisi;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class Persegi tanpa parameter
    Persegi(){
        setjmlhSisi(4);
    }

    // Merancang sebuah class Persegi dengan parameter sisi, Warna dan Border(menggunakan keyword super untuk menyatakan )
    Persegi(double Sisi, String Warna, String Border){
        super(4, Warna, Border);
        this.Sisi = Sisi;
    }

    /* Selektor */
    // Mengembalikan nilai dari sisi
    double getSisi(){
        return Sisi;
    }

    // Mengembalikan nilai Luas dari Persegi
    double getLuas(){
        return Sisi * Sisi;
    }

    // Mengembalikan nilai Keliling dari Persegi
    double getKeliling(){
        return Sisi * 4;
    }

    // Mengembalikan nilai diagonal dari Persegi
    double getDiagonal(){
        return Math.sqrt(Sisi * Sisi);
    }

    /* Mutator */
    // Mengatur nilai dari sisi
    void setSisi(double sisi){
        this.Sisi = sisi;
    }

    // Mencetak Persegi
    void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + Sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diagonal : " + getDiagonal());
    }
}
