public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialExc{
        if (angka == 13){
            throw new AngkaSialExc();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main (String [] args){
        AngkaSial AS = new AngkaSial();
        try{
            AS.cobaAngka(11);
            AS.cobaAngka(12);
            AS.cobaAngka(13);
        }catch(AngkaSialExc ASE){
            System.out.println(ASE.getMessage());
            System.out.println("yahaha hayukk ~~");
        }
    }
}
