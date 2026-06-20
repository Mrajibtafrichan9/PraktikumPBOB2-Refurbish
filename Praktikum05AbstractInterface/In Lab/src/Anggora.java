/*  Nama Program : Anggora.java
    Deskripsi : Berisi atribut dan metode dalam class Anggora, class anak dari class Kucing
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Anggora extends Kucing {
    
    // Atribut

    String nama;
    double bobot;
    

    // Konstruktor

    Anggora(String nama, double bobot) {
        super(nama,bobot);
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
