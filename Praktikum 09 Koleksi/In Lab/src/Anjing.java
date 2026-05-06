/*  Nama Program : Anjing.java
    Deskripsi : Berisi atribut dan metode dalam class Anjing, class anak dari class Anabul
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Anjing extends Anabul {
    
    // Atribut

    String nama;
    String panggilan;

    // Konstruktor

    Anjing(String nama, String panggilan) {
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
        System.out.println("Melata");
    }

    void Bersuara(){
        System.out.println("guk - guk");
    }

}
