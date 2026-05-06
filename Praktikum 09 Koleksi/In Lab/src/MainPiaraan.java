public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan piaraan1 = new Piaraan();
        
        Anabul A = new Kucing("Jawir", "wir", 1000);
        Anabul B = new Kucing("KembangTelon", "telon", 2000);

        piaraan1.enqAnabul(A);
        piaraan1.enqAnabul(B);

        piaraan1.showAnabul();
        // piaraan1.showCount("Jawir");
    }
}
