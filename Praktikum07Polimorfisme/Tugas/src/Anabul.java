/*  Nama Program : Anabul.java
    Deskripsi : Berisi atribut dan metode dalam class Anabul, parent class
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Anabul {
    // Atribut

   String nama;

    // Konstruktor

    Anabul(String nama) {
        this.nama = nama;
    }

    // Selector

    String getNama() {
        return nama;
    }

    // Mutator

    void setNama(String nama) {
        this.nama = nama;
    }

    // Method

    void Gerak(){
        System.out.println("Kosong");
    }

    void Bersuara(){
        System.out.println("Kosong");
    }
}
