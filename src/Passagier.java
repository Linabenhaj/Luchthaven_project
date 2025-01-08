public class Passagier {

    String naam;
    int leeftijd;
    String adres;
    Ticket ticket;
    double bagageGewicht;


    public Passagier(String naam, int leeftijd, String adres, double bagageGewicht){
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres =adres;
        this.bagageGewicht = bagageGewicht;

    }

    public boolean isBagageInOrde(){
        try{
            if(this.bagageGewicht > 30) {
                throw new Exception("Bagage is zwaarder dan 30kg.")
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void geefTicket(Ticket ticket) {
        this.ticket = ticket;
        System.out.println("Ticket gegeven!");
    }
}
