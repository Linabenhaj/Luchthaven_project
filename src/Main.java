
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                case 1:
                    System.out.print("Vluchtcode: ");
                    String vluchtcode = scanner.nextLine();
                    System.out.print("Bestemming:");
                    String bestemming = scanner.nextLine();
                    System.out.print("Aantal economy plaatsen: ");
                    int economy = Integer.parseInt(scanner.nextLine());
                    System.out.print("Aantal business plaatsen:");
                    int business = Integer.parseInt(scanner.nextLine());

                    Vlucht vlucht = new Vlucht(vluchtcode, bestemming, economy, business);
                    vlucht = scanner.nextLina();

                    break;
                    case 2:
                        System.out.print("Naam personeelslid: ");
                        String naam = scanner.nextLine();
                        System.out.print("Leeftijd: ");
                        int leeftijd = Integer.parseInt(scanner.nextLine());
                        System.out.print("Adres: ");
                        String adres = scanner.nextLine();

                        Personeelslid personeelslid = new Personeelslid(naam, leeftijd, adres);
                        vluchtcode = scanner.nextLine();

                        break;

                        case 3:
                            System.out.print("Naam passagier: ");
                            String naam = scanner.nextLine();
                            System.out.print("Leeftijd: ");
                            int leeftijd = Integer.parseInt(scanner.nextLine());
                            System.out.print("Adres: ");
                            String adres = scanner.nextLine();
// bagage toevoegen
                            break;
                            case 4:
                                System.out.print("Kies een vluchtcode om informatie te printen:");
   // hoe linken van de vluchtcode?

                                break;
                                case 5: luchthaven.exporteerAlleVluchtInfo();
                                break;
                                case 6:
                                    System.out.println("Programma stoppen");

            }
        }
        scanner.close();
        }
    }