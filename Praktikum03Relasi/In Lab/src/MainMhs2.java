public class MainMhs2 {
    public static void main(String [] args){
        Mahasiswa2 M1 = new Mahasiswa2("Suharnomo", "H5786NY", "Teknik Informatika", new Dosen("Dr. Budi Santoso", "NIP123456", "Teknik Informatika"), new Kendaraan("H5786NY", "Sepeda Motor"));
        MataKuliah MK1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah MK2 = new MataKuliah("IF102", "Struktur Data", 4);       
        M1.addMatkul(MK1);
        M1.addMatkul(MK2);  
        M1.printMhs2();
        M1.getJumlahSKS();
        M1.getJumlahMatKul();
    }
}
