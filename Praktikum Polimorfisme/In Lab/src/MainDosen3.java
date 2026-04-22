/*  Nama Program : MainDosen3.java
    Deskripsi : Driver yang menjalankan Dosen3 serta memberikan cara kerja dari overloading
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 22 April 2026 
*/

public class MainDosen3 {
    public static void main(String[] args) {
        
        Dosen3 cobaDosen = new Dosen3();
        Dosen3 cobaDosen2  = new Dosen3("Anton Larimaraton", "12345", "Ilmu Hitam");

        cobaDosen.printDosen();
        cobaDosen2.printDosen();
        // Terdapat dua metode dengan nama yang sama tetapi hanya salah satu metode yang memiliki parameter, sehingga metode tersebut dianggap berbeda


    }
}
