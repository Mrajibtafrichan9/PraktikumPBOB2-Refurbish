interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args){
        // Tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        // Dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // Dengan lambda dengan blok Statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.System.out.println("Diskon Merdeka : " + diskonMerdeka.hitungDiskon(45000));
        System.out.System.out.println("Diskon Lebaran : " + diskonLebaran.hitungDiskon(45000));
        System.out.System.out.println("Diskon Biasa : " + diskonBiasa.hitungDiskon(45000));
    }
}