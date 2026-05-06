/*  Nama Program : Dosen.java
    Deskripsi : Berisi atribut dan metode dalam class Dosen serta penerapan overloading
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 22 April 2026 
*/

public class Dosen3 {
    
    /***************Atribut***************/
    String Nama;
    String NIP;
    String Prodi;

    /***************Metode***************/
    // Konstruktor
    // Merancang class Dosen tanpa parameter
    Dosen3(){
        this.Nama = "XXX";
        this.NIP = "xxxxxx";
        this.Prodi = "-";
    }

    // Merancang class Dosen dengan parameter Nama, NIP, dan Prodi
    Dosen3(String Nama, String NIP, String Prodi) {
        this.Nama = Nama;
        this.NIP = NIP;
        this.Prodi = Prodi;
    }

    /* Selektor */
    // Mengembalikan nilai dari Nama Dosen
    String getNama() {
        return Nama;
    }

    // Mengembalikan nilai dari NIP
    String getNIP() {
        return NIP;
    }

    // Mengembalikan nilai dari nama prodi
    String getProdi(){
        return Prodi;
    }

    /* Mutator */
    // Mengatur nilai dari Nama Dosen
    void setNama(String NamaDosen) {
        Nama = NamaDosen;
    }

    // Mengatur nilai dari NIP
    void setNIP(String NIPDos) {
        NIP = NIPDos;
    }

    // Mengatur nilai dari nama prodi
    void setProdi(String NamaProdi){
        Prodi = NamaProdi;
    }

    // Mencetak class dosen
    void printDosen(){
        System.out.println("Nama Dosen: " + Nama);
        System.out.println("NIP Dosen: " + NIP);
        System.out.println("Prodi : " + Prodi);
        System.out.println("\n");
    }
}
