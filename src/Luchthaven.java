import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Luchthaven {
    List<Vlucht> vluchten;


    public Luchthaven() {
        vluchten = new ArrayList<>();
    }

    //passagier en bagage if else ?
    public void maakTicketAan(Passagier passagier, String klasse, Vlucht vlucht) {
        if (passagier.isBagageInOrde()) {
            Ticket ticket = new Ticket(passagier, klasse, vlucht);
            passagier.geefTicket(ticket);
            System.out.println("Ticket aangemaakt voor passagier " + passagier.naam + " in klasse " + klasse);
        } else {
            System.out.println("Bagage van " + passagier.naam + " is te zwaar, u krijgt geen ticket.");
        }
    }
    // als wel bagage ok dan mag die boarden
    public void laatPassagierBoarden(Passagier passagier, Vlucht vlucht) {
        if (passagier.ticket.vlucht = vlucht && !vlucht.isVol()) {
            vlucht.voegPassagierToe(passagier);

        } else {
            System.out.println("Passagier " + passagier.naam + " kan niet boarden door de te zware bagage.");
        }
    }

    public void voegPersoneelToeAanVlucht(Personeelslid personeel, Vlucht vlucht) {
        vlucht.voegPersoneelslidToe(personeel);
    }
    public void printVluchtInformatie(Vlucht vlucht) {
        vlucht.printVluchtInfo();
    }

    //vluctinfo exporteren
    public void exporteerAlleVluchtInfo(){
        FileWriter writer = null;

        try {
            writer = new FileWriter("vlucht_informatie.txt");
            for (Vlucht vlucht : vluchten) {
                writer.write("Vluchtcode: " + vlucht.vluchtcode + System.lineSeparator());
                writer.write("Bestemming: " + vlucht.bestemming + System.lineSeparator());
                writer.write(System.lineSeparator());
            }

        } catch(IOException e){
            System.err.println("Er is een fout opgetreden bij het exporteren van de vluchtinformatie: " + e.getMessage());

            //backlog element: geef foutmelding als export niet werkt
        }
    }

    }


}


