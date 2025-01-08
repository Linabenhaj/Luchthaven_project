public class Piloot extends Personeelslid {

    public Piloot(String naam, int leeftijd, String adres){

        super(naam, leeftijd, adres);
    }

//flightcheck: interpretatie "als alle passagiers aan boord zijn"

    public boolean flightCheck(Vlucht vlucht) {
        if (vlucht.isVol()) {
            System.out.println("De vlucht is vol dus de vliegtuig mag opstijgen. ");
            return true;
        } else {
            System.out.println("De vlucht is nog niet vol dus de vliegtuig kan niet opstijgen.");
            return false;
        }
    }
}
