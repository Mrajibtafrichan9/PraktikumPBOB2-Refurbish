/*  Nama Program : Kucing.java
    Deskripsi : Berisi atribut dan metode dalam class Kucing, class anak dari class Anabul
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Kucing extends Anabul {
    
    // Atribut

    String nama;
    String panggilan;
    double bobot;
    

    // Konstruktor


    Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }

    // Selector

    String getNama() {
        return nama;
    }

    double getBobot(){
        return bobot;
    }

    // Mutator

    void setNama(String nama) {
        this.nama = nama;
    }

    void setBobot(double bobot){
        this.bobot = bobot;
    }

    // Methods

    void Gerak(){
        System.out.println("Melata");
    }

    void Bersuara(){
        System.out.println("meong");
    }

}
