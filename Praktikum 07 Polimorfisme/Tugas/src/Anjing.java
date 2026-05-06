/*  Nama Program : Anjing.java
    Deskripsi : Berisi atribut dan metode dalam class Anjing, class anak dari class Anabul
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Anjing extends Anabul {
    
    // Atribut

    String nama;

    // Konstruktor

    Anjing(String nama) {
        super(nama);
    }

    // Selector

    String getNama() {
        return nama;
    }

    // Mutator

    void setNama(String nama) {
        this.nama = nama;
    }
    // Methods

    void Gerak(){
        System.out.println("Melata");
    }

    void Bersuara(){
        System.out.println("guk - guk");
    }

}
