/*  Nama Program : Anggora.java
    Deskripsi : Berisi atribut dan metode dalam class Anggora, class anak dari class Kucing
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 29 April 2026 
*/

class Anggora extends Kucing {
    
    // Atribut

    String nama;
    String panggilan;
    double bobot;
    String jenis;


    // Konstruktor

    Anggora(String nama, String panggilan, double bobot, String jenis) {
        super(nama, panggilan, bobot);
        this.jenis = jenis;
    }

    // Selector

    String getNama() {
        return nama;
    }

    String getPanggilan() {
        return panggilan;
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
