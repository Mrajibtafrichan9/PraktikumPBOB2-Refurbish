/*  Nama Program : MataKuliah.java
    Deskripsi : Berisi atribut dan metode dalam class MataKuliah
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Minggu, 8 Maret 2026 
*/

public class MataKuliah {
    
    /***************Atribut***************/
    String IDMatKul;
    String Nama;
    int SKS;

    /***************Metode***************/
    /* Konstruktor */
    // Merancang sebuah class MataKuliah tanpa parameter
    MataKuliah(){
        this.IDMatKul = "xxxxx";
        this.Nama = "xxxxxxx";
        this.SKS = 0;
    }

    // Merancang sebuah class MataKuliah dengan parameter IDMatKul, Nama MatKul, dan SKS
    MataKuliah(String IDMatKul, String Nama, int SKS) {
        this.IDMatKul = IDMatKul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    /* Selektor */
    // Mengembalikan nilai ID Mata Kuliah
    String getIDMatKul() {
        return IDMatKul;
    }

    // Mengembalikan nilai Nama Mata Kuliah
    String getNama() {
        return Nama;
    }

    // Mengembalikan nilai SKS dari Mata Kuliah
    int getSKS(){
        return SKS;
    }

    /* Mutator */
    // Mengatur nilai ID Mata Kuliah
    void setIDMatKul(String ID1) {
        IDMatKul = ID1;
    }

    // Mengatur nilai Nama Mata Kuliah
    void setNama(String Nama2) {
        Nama = Nama2;
    }

    // Mengatur nilai SKS dari Mata Kuliah
    void setSKS(int SKS1){
        SKS = SKS1;
    }
}
