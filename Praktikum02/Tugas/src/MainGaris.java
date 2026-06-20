public class MainGaris {
    public static void main(String[] args){
        Titik2 T1 = new Titik2(3,5);
        Titik2 T2 = new Titik2(7,9);
        Garis G1 = new Garis(T1,T2);

        System.out.println("Panjang garis G1 : " + G1.panjangGaris());
        System.out.println("Gradien garis G1 : " + G1.gradienGaris());
        System.out.println("Titik tengah garis G1 : (" + G1.titikTengah().absis + "," + G1.titikTengah().ordinat + ")");
        G1.printGaris();
    }
}
