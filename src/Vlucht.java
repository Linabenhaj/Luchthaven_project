import java.util.ArrayList;
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
        Passagier.add(passagier);
    }
    public void voegPersoneelslidToe(Personeelslid personeelslid) {
        Personeelslid.add(personeelslid);
    }


