import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class Luchthaven {
    List<Vlucht> vluchten;

    public Luchthaven() {
        vluchten = new ArrayList<>();
    }

    //foutcontrole op bestaande vluchten
    //backlog element: personeel mag niet op twee dezelfde vliegtuig zijn
    public void voegVluchtToe(Vlucht vlucht) {
        boolean bestaatAl = false;
        // Controleer of de vluchtcode al bestaat in de lijst van vluchten
        for (Vlucht vluchtInLijst : vluchten) {
            if (vluchtInLijst.getVluchtCode().equals(vlucht.getVluchtCode())) {
                bestaatAl = true;
                break;
            }
        }
        if (!bestaatAl) {
            vluchten.add(vlucht);
            System.out.println("Vlucht " + vlucht.getVluchtCode() + " toegevoegd.");
        } else {
            System.out.println("Vlucht met code " + vlucht.getVluchtCode() + " bestaat al.");
        }
    }
//opzoeken van bestaande vlucht en zijn informatie
    public Vlucht zoekVluchtOpCode(String code) {
        for (Vlucht vlucht : vluchten) {
            if (vlucht.getVluchtCode().equals(code)) {
                return vlucht;
            }
        }
        return null;
    }
    //maak ticket voor passagier en bagage if else
    public void maakTicketAan(Passagier passagier, String klasse, Vlucht vlucht) {
        if (passagier.isBagageInOrde()) {
            Ticket ticket = new Ticket(passagier, klasse, vlucht);
            passagier.geefTicket(ticket);
            System.out.println("Ticket aangemaakt voor passagier " + passagier.naam + " in klasse " + klasse);
        } else {
            System.out.println("Bagage van " + passagier.naam + " is te zwaar, u krijgt geen ticket.");
        }
    }
    // als bagage ok dan mag die boarden
    public void laatPassagierBoarden(Passagier passagier, Vlucht vlucht) {
        if (passagier.ticket == null || !passagier.ticket.vlucht.equals(vlucht)) {
            System.out.println("Passagier " + passagier.naam + " heeft geen geldig ticket voor deze vlucht.");

        } else if (vlucht.isVol()) {
            System.out.println("De vlucht is vol, passagier " + passagier.naam + " kan niet boarden.");
        } else {
            vlucht.voegPassagierToe(passagier);
            System.out.println("passagier " + passagier.naam + " is succesvol aan boord gegaan.");
        }
    }
//personeel toevoegen aan een vlucht
        public void voegPersoneelToeAanVlucht(Personeelslid personeelslid, Vlucht vlucht) {
            vlucht.voegPersoneelslidToe(personeelslid);
        }

    //vluctinfo structuur voor exporteren
    public void exporteerAlleVluchtInfo() {
            try (FileWriter writer = new FileWriter("vlucht_informatie.txt")) {
                for (Vlucht vlucht : vluchten) {
                    writer.write("Vluchtcode: " +vlucht.vluchtcode + System.lineSeparator());
                    writer.write("Bestemming: " +vlucht.bestemming + System.lineSeparator());
                    writer.write(System.lineSeparator());
                }
                System.out.println("Vluchtinformatie succesvol geëxporteerd.");
            } catch (IOException e) {
                System.err.println("Er is een fout opgetreden bij het exporteren van de vluchtinformatie: " + e.getMessage());

                //backlog element: geef foutmelding als export niet werkt
            }
        }


    }





