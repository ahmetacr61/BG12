import java.util.ArrayList;
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        String raumbezeichnung;
        int schuelerarbeitsplaetze;
        boolean besitztWaschbecken;
        ArrayList<Raum> raumList = new ArrayList<Raum>();
        Scanner s = new Scanner(System.in);
        boolean exitCode;

        while(true) {
            System.out.println("------- Geben sie die Daten eines Raumes ein! -------");
            System.out.println("Bezeichnung des Raums eingeben: ");
            raumbezeichnung = s.next();
            System.out.println("Anzahl der Plaetze eingeben: ");
            schuelerarbeitsplaetze = s.nextInt();
            System.out.println("Waschbecken? Geben sie true oder false ein: ");
            besitztWaschbecken = s.nextBoolean();
            System.out.println("Eingabe beenden? Geben sie true oder false ein: ");
            exitCode = s.nextBoolean();
            Raum raum = new Raum(raumbezeichnung, schuelerarbeitsplaetze, besitztWaschbecken);
            raumList.add(raum);
            if(exitCode) {
                System.out.println("-------- Gespeicherte Daten ---------");
                for(int i = 0; i < raumList.toArray().length; i++) {
                    System.out.println("-------------------------------------");
                    System.out.println("Bezeichnung des Raums: " + raumList.get(i).getRaumbezeichnung());
                    System.out.println("Anzahl Plaetze: " + raumList.get(i).getSchuelerarbeitsplaetze());
                    System.out.println("Waschbecken vorhanden: " + raumList.get(i).getBesitztWaschbecken());
                }
                break;
            } else {

            }
        }
    }
}