/*  Nama Program : KembangTelon.java
    Deskripsi : Berisi atribut dan metode dalam class KembangTelon, class anak dari class Kucing
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/


class KembangTelon extends Kucing {
    
    // Atribut

    String nama;
    String panggilan;
    double bobot;
    

    // Konstruktor

    KembangTelon(String nama, String panggilan, double bobot) {
        super(nama, panggilan, bobot);
    }

    // Selector

    

    // Mutator

    

    // Methods

    void Gerak(){
        System.out.println("Melata");
    }

    void Bersuara(){
        System.out.println("meong");
    }

}
