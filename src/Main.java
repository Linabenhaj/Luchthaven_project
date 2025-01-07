public class Main {
    public static void main(String[] args) {
        Luchthaven luchthaven = new Luchthaven();

        Vlucht vlucht = new Vlucht("BU223", "Los Angeles", 100, 20);
        nomy, 20business
        Vlucht vlucht2 = new Vlucht("EF275", "Tokyo", 150, 30);
        luchthaven.voegVluchtToe(vlucht);

        BagagePersoneel bagagePersoneel1 = new BagagePersoneel("Anna", 28, "Schoenstraat 111, Leuven");
        Passagier passagier1 = new Passagier("Jan", 30, "Straat 1, Stad");
        Piloot piloot1 = new Piloot("Tom", 31, "Bergensesteenweg 35, Brussel");

        luchthaven.voegPersoneelToeAanVlucht(piloot1, vlucht1);
        luchthaven.voegPersoneelToeAanVlucht(piloot2, vlucht2);


    }
