import java.util.ArrayList;

public class Konto {
    private String kontonummer;
    private double kontostand;
    private Kunde kunde;

    public Konto(String kontonummer, double kontostand, Kunde kunde) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.kunde = kunde;
    }

    public void geldEinzahlen(double betrag) {
        kontostand += betrag;
    }

    public boolean geldAbheben(double betrag) {
        if(kontostand <= betrag && kontostand - betrag == 1) {
            return false;
        } else {
            kontostand -= betrag;
            return true;
        }
    }

    public boolean geldUEberweisen(double betrag, Konto zielKonto) {
        if(kontostand <= betrag) {
            return false;
        } else {
            zielKonto.geldEinzahlen(betrag);
            this.geldAbheben(betrag);
            return true;
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
