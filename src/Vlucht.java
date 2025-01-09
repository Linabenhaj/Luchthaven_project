import java.util.ArrayList;
import java.util.List;

//bepalen van de objecten
public class Vlucht {
    String vluchtcode;
    String bestemming;
    int aantalEconomyPlaatsen;
    int aantalBusinessPlaatsen;
    List<Passagier> passagiers;
    List<Personeelslid> personeel;

//constructor plaatsen
    public Vlucht(String vluchtcode, String bestemming, int aantalEconomyPlaatsen, int aantalBusinessPlaatsen){
        this.vluchtcode = vluchtcode;
        this.bestemming = bestemming;
        this.aantalEconomyPlaatsen = aantalEconomyPlaatsen;
        this.aantalBusinessPlaatsen = aantalBusinessPlaatsen;
        this.passagiers = new ArrayList<>();
        this.personeel = new ArrayList<>();
    }

//getter
    public String getVluchtCode(){
        return vluchtcode;
    }
    public void voegPassagierToe(Passagier passagier) {
        passagiers.add(passagier);
    }
    public void voegPersoneelslidToe(Personeelslid personeelslid) {
        personeel.add(personeelslid);
    }

    public boolean isErEenPiloot() {
        for (Personeelslid personeelslid : personeel) {
            if (personeelslid instanceof Piloot) {
                return true;
            }
        }
        return false;
    }

//print vluchtinfo?
public void printVluchtInfo(){
    System.out.println("Vluchtcode:" + vluchtcode);
    System.out.println("Bestemming: " + bestemming);
    System.out.println("Aantal Economy plaatsen:" + aantalEconomyPlaatsen);
    System.out.println("Aantal Business plaatsen: " + aantalBusinessPlaatsen);
    System.out.println("Aantal passagiers: " + passagiers.size());
    System.out.println("Aantal personeelsleden: " + personeel.size());
    }
}

