import java.util.ArrayList;
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        String raumbezeichnung, raumSuchen;
        int schuelerarbeitsplaetze;
        boolean besitztWaschbecken, suchen;
        ArrayList<Raum> raumList = new ArrayList<Raum>();
        Scanner s = new Scanner(System.in);
        boolean exitCode, wurdeRaumGefunden = false;

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
            System.out.println("Möchten sie nach einem Raum suchen? Geben sie true oder false ein");
            suchen = s.nextBoolean();
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
            if(suchen) {
                System.out.println("Geben sie die Raumbezeichnung ein, nach der gesucht werden soll: ");
                raumSuchen = s.next();
                for(int i = 0; i < raumList.toArray().length; i++) {
                    if(raumList.get(i).getRaumbezeichnung().equals(raumSuchen)) {
                        System.out.println("Der Raum " + raumList.get(i).getRaumbezeichnung() + " ist vorhanden und hier sind weitere Daten zum Raum: ");
                        System.out.println("Bezeichnung des Raums: " + raumList.get(i).getRaumbezeichnung());
                        System.out.println("Anzahl Plaetze: " + raumList.get(i).getSchuelerarbeitsplaetze());
                        System.out.println("Waschbecken vorhanden: " + raumList.get(i).getBesitztWaschbecken());
                        wurdeRaumGefunden = true;
                    }
                }
                if(!wurdeRaumGefunden) {
                    System.out.println("Der Raum " + raumSuchen + " ist nicht im System eingetragen!");
                } else {
                    wurdeRaumGefunden = false;
                }
            }
        }
    }
}