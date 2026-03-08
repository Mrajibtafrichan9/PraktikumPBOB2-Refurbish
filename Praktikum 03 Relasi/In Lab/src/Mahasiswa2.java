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
        this.ListMatKul = new ArrayList<>();
    }

    void addMatkul(MataKuliah newMataKuliah){
        ListMatKul.add(newMataKuliah);
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
