/*  Nama Program : Burung.java
    Deskripsi : Berisi atribut dan metode dalam class Burung, class anak dari class Anabul
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Burung extends Anabul {
    
    // Atribut

    String nama;

    // Konstruktor

    Burung(String nama) {
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
        System.out.println("Terbang");
    }

    void Bersuara(){
        System.out.println("cuit - cuit");
    }

}
