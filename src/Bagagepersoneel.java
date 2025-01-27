public class BagagePersoneel extends Personeelslid {
    public BagagePersoneel(String naam, int leeftijd, String adres) {
        super(naam, leeftijd, adres);
    }

    public boolean controleerBagage(Passagier passagier) {
        if (passagier.getBagageGewicht() > 30) {
            System.out.println("Bagage van" + passagier.naam + " is te zwaar.");
            return false;
        }
        System.out.println("Bagage van " + passagier.naam + " is in orde.");
        return true;
    }
}