public class Ticket{
    Passagier passagier;
    String klasse;
    Vlucht vlucht;


    public Ticket(Passagier passagier, String klasse, Vlucht vlucht){
        this.passagier = passagier;
        this.klasse = klasse;
        this.vlucht = vlucht;
    }

public void maakTicketAan(Passagier passagier, String klasse, Vlucht vlucht) {
    Ticket ticket = new ticket(passagier, klasse, vlucht);
    passagier.geefTicket(ticket);
    System.out.println("Ticket aangemaakt voor passagier " + passagier.naam);
}

