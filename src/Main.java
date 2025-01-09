import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Luchthaven luchthaven = new Luchthaven();

        while(true){
            System.out.println("1. Voeg een vlucht toe");
            System.out.println("2. Voeg een personeelslid toe");
            System.out.println("3. Voeg een passagier toe");
            System.out.println("4. Print vluchtinformatie");
            System.out.println("5. Exporteer vluchtinformatie naar txt");
            System.out.println("6. Stoppen");
            System.out.print("Maak een keuze: ");

            int keuze = Integer.parseInt(scanner.nextLine());
            switch (keuze) {
                case 1: {
                    System.out.print("Vluchtcode: ");
                    String vluchtcode = scanner.nextLine();
                    System.out.print("Bestemming:");
                    String bestemming = scanner.nextLine();
                    System.out.print("Aantal economy plaatsen: ");
                    int economy = Integer.parseInt(scanner.nextLine());
                    System.out.print("Aantal business plaatsen:");
                    int business = Integer.parseInt(scanner.nextLine());

                    Vlucht vlucht = new Vlucht(vluchtcode, bestemming, economy, business);
                    luchthaven.voegVluchtToe(vlucht);
                    break;
                }

                case 2: {
                    System.out.print("Naam personeelslid: ");
                    String naam = scanner.nextLine();
                    System.out.print("Leeftijd: ");
                    int leeftijd = Integer.parseInt(scanner.nextLine());
                    System.out.print("Adres: ");
                    String adres = scanner.nextLine();

                    Personeelslid personeelslid = new Personeelslid(naam, leeftijd, adres);
                    System.out.print("Kies een vluchtcode om het personeelslid toe te voegen: ");
                    String vluchtcode = scanner.nextLine();
                    Vlucht vlucht = luchthaven.zoekVluchtOpCode(vluchtcode);
                    if (vlucht != null) {
                        vlucht.voegPersoneelslidToe(personeelslid);
                    } else{
                        System.out.println("Vlucht niet gevonden!");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Naam passagier: ");
                    String naam = scanner.nextLine();
                    System.out.print("Leeftijd: ");
                    int leeftijd = Integer.parseInt(scanner.nextLine());
                    System.out.print("Adres: ");
                    String adres = scanner.nextLine();
                    System.out.println("Bagagegewicht:");
                    double bagageGewicht = Double.parseDouble(scanner.nextLine());

                    Passagier passagier = new Passagier(naam, leeftijd, adres, bagageGewicht);

                    if (passagier.isBagageInOrde()){
                        System.out.print("Vluchtcode om de passagier toe te voegen: ");
                        String vluchtcode =scanner.nextLine();
                        Vlucht vlucht = luchthaven.zoekVluchtOpCode(vluchtcode);

                        if (vlucht != null){
                            vlucht.voegPassagierToe(passagier);
                            System.out.println("Passagier toegevoegd aan de vlucht.");
                            Piloot piloot = new Piloot("Jan de Piloot", 45, "Straat 123");
                            vlucht.voegPersoneelslidToe(piloot);

                            if (piloot.flightCheck(vlucht)) {
                                System.out.println("Flightcheck oke! Alles is in orde, de vlucht kan opstijgen.");
                            } else {
                                System.out.println("Flightcheck niet oke. De vlucht kan niet opstijgen.");
                            }

                        } else {
                            System.out.println("Vlucht niet gevonden.");
                        }
                    } else {
                        System.out.println("Passagier kan niet worden toegevoegd vanwege te zwaar bagage.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Vluchtcode om informatie te printen: ");
                    String vluchtcode = scanner.nextLine();
                    Vlucht vlucht = luchthaven.zoekVluchtOpCode(vluchtcode);

                    if (vlucht != null) {
                        vlucht.printVluchtInfo();
                    } else {
                        System.out.println("Vlucht niet gevonden.");
                    }
                    break;
                }

                case 5: {
                    luchthaven.exporteerAlleVluchtInfo();
                    break;
                }
                case 6: {
                    System.out.println("Programma is gestopt.");
                    for (Vlucht vlucht : luchthaven.vluchten) {
                        if (!vlucht.personeel.isEmpty()) {
                            Personeelslid piloot = vlucht.personeel.get(0);
                            if (piloot instanceof Piloot) {
                                ((Piloot) piloot).flightCheck(vlucht);
                            }
                        } else {
                            System.out.println("Flightcheck niet oke. Geen personeel aan boord.");
                        }
                    }
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Ongeldige keuze, probeer opnieuw");
                }

            }
        }
    }
}
