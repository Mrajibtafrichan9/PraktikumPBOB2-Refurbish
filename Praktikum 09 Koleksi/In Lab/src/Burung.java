/*  Nama Program : Burung.java
    Deskripsi : Berisi atribut dan metode dalam class Burung, class anak dari class Anabul
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Burung extends Anabul {
    
    // Atribut

    String nama;
    String panggilan;

    // Konstruktor

    Burung(String nama, String panggilan) {
        super(nama, panggilan);
    }

    // Selector

    String getNama() {
        return nama;
    }

    String getPanggilan() {
        return panggilan;
    }

    // Mutator

    void setNama(String nama) {
        this.nama = nama;
    }

    void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    // Methods

    void Gerak(){
        System.out.println("Terbang");
    }

    void Bersuara(){
        System.out.println("cuit - cuit");
    }

}
