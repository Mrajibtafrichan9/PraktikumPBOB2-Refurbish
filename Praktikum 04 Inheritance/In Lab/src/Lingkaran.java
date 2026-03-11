/*  Nama Program : Lingkaran.java
    Deskripsi : Berisi atribut dan metode dalam class Lingkaran
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 11 Maret 2026 
*/

public class Lingkaran extends BangunDatar {
   /***************Atribut***************/

    double Jari2;

    /***************Metode***************/ 
    /* Konstruktor */
    // Merancang sebuah class Lingkaran tanpa parameter
    Lingkaran(){
        setjmlhSisi(1);
    }

    // Merancang sebuah class Lingkaran dengan parameter diameter, Warna dan Border(menggunakan keyword super untuk menyatakan )
    Lingkaran(double Jari2, String Warna, String Border){
        super(1, Warna, Border);
        this.Jari2 =Jari2;
    }

    /* Selektor */
    // Mengembalikan nilai dari diameter
    double getDiameter(){
        return Jari2 * 2;
    }

    // Mengembalikan nilai Luas dari Lingkaran
    double getLuas(){
        double jariJari = Diameter / 2;
        return Math.PI * jariJari * jariJari;
    }

    // Mengembalikan nilai Keliling dari Lingkaran
    double getKeliling(){
        double jariJari = Diameter / 2;
        return 2 * Math.PI * jariJari;
    }

    // Mengembalikan nilai jari-jari dari Lingka
    double getJari2(){
        return Jari2;
    }

    /* Mutator */
    // Mengatur nilai Diameter dari lingkaran
    void setJari2(double jari2){
        this.Jari2 = jari2;
    }

    // Mencetak Lingkaran
    void printInfo(){
        super.printInfo();
        System.out.println("Jari : " + Jari2);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diameter : " + getDiameter());
    }
}
