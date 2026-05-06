/*  Nama Program : Teman.java
    Deskripsi : Berisi atribut dan metode dalam class Teman,
                penerapan koleksi pada larik
    Pembuat : Muchammad Rajib Tafrichan
    Tanggal : Rabu, 6 Mei 2026 
*/

import java.util.List;

public class Teman {
    
    // Atribut

    int nbelm;
    List<String> Lnama;

    // Method

    Teman(int nbelm, List<String> Lnama){
        this.nbelm = nbelm;
        this.Lnama = Lnama;
    }

    int getNbelm(){
        return this.nbelm;
    }

    String getNama(int i){
        return this.Lnama.get(i);
    }

    void setNama(int i, String Nama){
        this.Lnama.set(i, Nama);
    }

    void addaNama(String Nama){
        this.Lnama.add(Nama);
    }

    void delNama(String Nama){
        this.Lnama.remove(Nama);
    }

    boolean isMember(String Nama){
        return this.Lnama.contains(Nama);
    }

    void gantiNama(String NamaLama, String NamaBaru){
        int i = this.Lnama.indexOf(NamaLama);
        if(i != -1){
            this.Lnama.set(i, NamaBaru);
        }
    }

    int countNama(String Nama){
        int count = 0;
        for(String nama : this.Lnama){
            if(nama.equals(Nama)){
                count++;
            }
        }
        return count;
    }

    void showTeman(){
        System.out.println("Jumlah teman: " + this.nbelm);
        System.out.println("Daftar teman:");
        for(String nama : this.Lnama){
            System.out.println("- " + nama);
        }
    }
}
