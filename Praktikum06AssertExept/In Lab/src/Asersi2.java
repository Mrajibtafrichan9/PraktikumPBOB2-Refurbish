class Lingkaran{
    private double Jari2;
    public Lingkaran(double Jari2){
        this.Jari2 = Jari2;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * Jari2;
        return keliling;
    }

}

public class Asersi2{
    public static void main (String[] args){
        double Jari2 = 0;
        assert(Jari2 > 0) : "Jari2 tidak boleh nol";
        Lingkaran L = new Lingkaran(Jari2);
        double kelilingLingkaran = L.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}