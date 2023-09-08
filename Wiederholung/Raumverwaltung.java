public class Raumverwaltung {
    public static void main(String[] args) {
        /*
        Raum raum = new Raum("A-110", 10, false);
        System.out.println(raum.getRaumbezeichnung());
        System.out.println(raum.getSchuelerarbeitsplaetze());
        System.out.println(raum.getBesitztWaschbecken());

        raum.setRaumbezeichnung("A-420");
        raum.setSchuelerarbeitsplaetze(69);
        raum.setBesitztWaschbecken(true);

        System.out.println(raum.getRaumbezeichnung());
        System.out.println(raum.getSchuelerarbeitsplaetze());
        System.out.println(raum.getBesitztWaschbecken());

        Raum raum2 = new Raum("A-111", 13);

        System.out.println(raum2.getRaumbezeichnung());
        System.out.println(raum2.getSchuelerarbeitsplaetze());
        System.out.println(raum2.getBesitztWaschbecken());
        */
        Computerraum computerraum = new Computerraum("B-002", 20, false, 10);


        System.out.println(computerraum.getBesitztWaschbecken());
        System.out.println(computerraum.genugComputerVorhanden());
        computerraum.setAnzahlDerComputer(20);
        System.out.println(computerraum.genugComputerVorhanden());
    }
}
