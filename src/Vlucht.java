import java.util.ArrayList;
import java.util.List;

public class Vlucht {
    String vluchtcode;
    String bestemming;
    int aantalEconomyPlaatsen;
    int aantalBusinessPlaatsen;
    List<Passagier> passagiers;
    List<Personeelslid> personeel;


    public Vlucht(String vluchtcode, String bestemming, int aantalEconomyPlaatsen, int aantalBusinessPlaatsen){
        this.vluchtcode = vluchtcode;
        this.bestemming = bestemming;
        this.aantalEconomyPlaatsen = aantalEconomyPlaatsen;
        this.aantalBusinessPlaatsen = aantalBusinessPlaatsen;
        this.passagiers = new ArrayList<>();
        this.personeel = new ArrayList<>();
    }

    public String getVluchtCode(){
        return vluchtcode;
    }
    public void voegPassagierToe(Passagier passagier) {
        passagiers.add(passagier);
    }
    public void voegPersoneelslidToe(Personeelslid personeelslid) {
        personeel.add(personeelslid);
    }


//print vluchtinfo?
    public void printVluchtInfo(){
        System.out.println("Vluchtcode: " + vluchtcode);
        System.out.println("Bestemming: " + bestemming);
        System.out.println("Aantal Economy plaatsen: " + aantalEconomyPlaatsen);
        System.out.println("Aantal Business plaatsen: " + aantalBusinessPlaatsen);
        System.out.println("Aantal passagiers: " + passagiers());
        System.out.println("Aantal personeelsleden: " + personeel());
    }