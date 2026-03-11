/*  Nama Program : BangunDatar.java
    Deskripsi : Berisi atribut dan metode dalam class BangunDatar
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 11 Maret 2026 
*/

public class BangunDatar {
    /***************Atribut***************/

    int jmlhSisi;
    String Warna;
    String Border;
    int counterBangunDatar;

    /***************Metode***************/
    /* Konstruktor */
    // Merancang sebuah class BangunDatar tanpa parameter
    BangunDatar(){
        this.jmlhSisi = 0;
        this.Warna = "XXXXX";
        this.Border = "-";
        counterBangunDatar++;
    }

    // Merancang sebuah class BangunDatar dengan parameter jmlhSisi, Warna, dan Border
    BangunDatar(int jmlhSisi, String Warna, String Border){
        this.jmlhSisi = jmlhSisi;
        this.Warna = Warna;
        this.Border = Border;
        counterBangunDatar++;
    }

    /* Selektor */
    // Mengembalikan nilai dari jumlah sisi BangunDatar
    int getjmlhSisi(){
        return jmlhSisi;
    }

    // Mengembalikan nilai dari Warna BangunDatar
    String getWarna(){
        return Warna;
    }

    // Mengembalikan nilai dari Border BangunDatar
    String getBorder(){
        return Border;
    }

    /* Mutator */
    // Mengatur jumlah sisi dari BangunDatar
    void setjmlhSisi(int x){
        this.jmlhSisi = x;
    }

    // Mengatur Warna dari BangunDatar
    void setWarna(String warna){
        this.Warna = warna;
    }

    // Mengatur Border dari BangunDatar
    void setBorder(String border){
        this.Border = border;
    }

    // Mencetak BangunDatar
    void printInfo(){
        System.out.println("INFO BANGUN DATAR");
        System.out.println("jumlah sisi : " + getjmlhSisi());
        System.out.println("Warna : " + getWarna());
        System.out.println("Border : " + getBorder());
    }

    // Mencetak jumlah BangunDatar 
    void printCounterBangunDatar(){
        System.out.println("jumlah bangun datar : " + counterBangunDatar);
    }
}
