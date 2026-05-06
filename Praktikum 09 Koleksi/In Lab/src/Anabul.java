/*  Nama Program : Anabul.java
    Deskripsi : Berisi atribut dan metode dalam class Anabul, parent class
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Anabul {
    // Atribut

   String nama;
   String panggilan;

    // Konstruktor

    Anabul(){
        this.nama = "Andi";
        this.panggilan = "di";
    }

    Anabul(String Nama, String Panggilan) {
        nama = Nama;
        panggilan = Panggilan;
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

    void setpanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    // Method

    void Gerak(){
        System.out.println("Kosong");
    }

    void Bersuara(){
        System.out.println("Kosong");
    }
}
