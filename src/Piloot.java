public class Piloot extends Personeelslid {

    public Piloot(String naam, int leeftijd, String adres){

        super(naam, leeftijd, adres);
    }

//flightcheck: interpretatie "als alle passagiers aan boord zijn"

    public boolean flightCheck(Vlucht vlucht) {
        boolean isErEenPiloot = false;
        for (Personeelslid personeelslid : vlucht.personeel) {
            if (personeelslid instanceof Piloot) {
                isErEenPiloot = true;
                break;
            }
    }
        if (!isErEenPiloot) {
            System.out.println("Flightcheck niet oke. Er is geen piloot aan boord.");
            return false;
        }

        if (vlucht.passagiers.isEmpty()) {
            System.out.println("Flightcheck niet oke. Er zijn geen passagiers aan boord.");
            return false;
        }

        System.out.println("Flightcheck oke! Alles is in orde, de vlucht kan opstijgen.");
        return true;
    }
}

