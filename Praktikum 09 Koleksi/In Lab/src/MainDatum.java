public class MainDatum {
    public static void main(String[] args){

        // Atribut

        Datum <Kucing> Aripin;
        Kucing kitty;

        // Apa ini

        Aripin = new Datum <> ();
        kitty = new Kucing("Andi", 10);
        Aripin.setIsi(kitty);
        Aripin.getIsi().Gerak();

    }



}
