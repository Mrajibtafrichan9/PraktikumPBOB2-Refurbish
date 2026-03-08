import java.util.ArrayList;

public class Mahasiswa2 {

    /***************Atribut***************/
    String NamaMhs2;
    String NIM;
    String Prodi;
    ArrayList<MataKuliah> ListMatKul;
    Dosen DosenWali;
    Kendaraan Kendaraan;

    /***************Metode***************/
    /* Konstruktor */
    //
    Mahasiswa2(){
        this.NamaMhs2 = "XXX";
        this.NIM = "xxxxxx";
        this.Prodi = "-";
        this.DosenWali = null;
        this.Kendaraan = null;
        this.ListMatKul = new ArrayList<>();
    }

    public Mahasiswa2(String NamaMhs2, String NIM, String Prodi, Dosen DosenWali, Kendaraan Kendaraan){
        this.NamaMhs2 = NamaMhs2;
        this.NIM = NIM;
        this.Prodi = Prodi;
        this.DosenWali = DosenWali;
        this.Kendaraan = Kendaraan;
        this.ListMatKul = new ArrayList<>();
    }

    void addMatkul(MataKuliah newMataKuliah){
        ListMatKul.add(newMataKuliah);
    }

    void getJumlahSKS(){
        int totalSKS = 0;
        for(int i = 0; i < ListMatKul.size(); i++){
            totalSKS += ListMatKul.get(i).getSKS();
        }
        System.out.println("Total SKS : " + totalSKS);
    }

    void getJumlahMatKul(){
        System.out.println("Jumlah Mata Kuliah : " + ListMatKul.size());
    }

    void printMhs2(){
        System.out.println("Nama : " + NamaMhs2);
        System.out.println("NIM : "+ NIM);
        System.out.println("Prodi : " + Prodi);
        int i;
        for(i = 0; i < ListMatKul.size(); i++){
            System.out.println("Mata Kuliah " + (i+1) + " : ");
            ListMatKul.get(i).printMatKul();
        }
    }
}
