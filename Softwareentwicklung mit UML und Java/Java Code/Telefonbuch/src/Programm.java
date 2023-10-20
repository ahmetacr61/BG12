import java.util.Scanner;

public class Programm {
    private static String vorname, nachname, telefonnummer, eingabe;
    private static Telefonbuch telefonbuch = new Telefonbuch();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Was möchten sie machen? \n- eintrag anlegen \n- eintrag suchen \n- eintraege suchen \n- eintrag loeschen");
            eingabe = s.nextLine().toLowerCase();

            switch (eingabe) {
                case "eintrag anlegen":
                    System.out.println("Geben sie den Vornamen der Person ein:");
                    vorname = s.nextLine();
                    System.out.println("Geben sie den Nachnamen der Person ein:");
                    nachname = s.nextLine();
                    System.out.println("Geben sie die Telefonnummer der Person ein:");
                    telefonnummer = s.nextLine();

                    telefonbuch.eintragAnlegen(vorname, nachname, telefonnummer);
                    break;
                case "eintrag suchen":
                    System.out.println("Geben sie eine Telefonnummer ein:");
                    telefonnummer = s.nextLine();
                    System.out.println(telefonbuch.eintragSuchen(telefonnummer));
                    break;
                case "eintraege suchen":
                    System.out.println("Geben sie einen Vorname ein:");
                    vorname = s.nextLine();
                    System.out.println(telefonbuch.eintraegeSuchen(vorname));
                    break;
                case "eintrag loeschen":
                    System.out.println("Geben sie eine Telefonnummer ein:");
                    telefonnummer = s.nextLine();
                    System.out.println(telefonbuch.eintragLoeschen(telefonnummer));
                    break;

                default:
                    System.out.println("Keine gueltige Eingabe, bitte versuche es erneut! \n");
                    break;
            }
        }
    }
}