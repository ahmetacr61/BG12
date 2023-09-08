public class Raum {
    //String, da der name vom Raum aus Buchstaben, Zahlen und Sonderzeichen besteht
    private String raumbezeichnung;
    //Int, da es keine halben arbeitsplätze geben sollte
    private int schuelerarbeitsplaetze;
    //Boolean, da es entweder ein Waschbecken hat, oder kein hat, die Anzahl ist in der Aufgabenstellung nicht gefragt
    private boolean besitztWaschbecken;

    public Raum(String raumbezeichnung, int schuelerarbeitsplaetze, boolean besitztWaschbecken) {
        this.raumbezeichnung = raumbezeichnung;
        this.schuelerarbeitsplaetze = schuelerarbeitsplaetze;
        this.besitztWaschbecken = besitztWaschbecken;
    }

    public Raum(String raumbezeichnung, int schuelerarbeitsplaetze) {
        this.raumbezeichnung = raumbezeichnung;
        this.schuelerarbeitsplaetze = schuelerarbeitsplaetze;
        this.besitztWaschbecken = false;
    }

    public Raum() {

    }

    public String getRaumbezeichnung() {
        return raumbezeichnung;
    }

    public int getSchuelerarbeitsplaetze() {
        return schuelerarbeitsplaetze;
    }

    public boolean getBesitztWaschbecken() {
        return besitztWaschbecken;
    }

    public void setRaumbezeichnung(String raumbezeichnung) {
        this.raumbezeichnung = raumbezeichnung;
    }

    public void setSchuelerarbeitsplaetze(int schuelerarbeitsplaetze) {
        this.schuelerarbeitsplaetze = schuelerarbeitsplaetze;
    }

    public void setBesitztWaschbecken(boolean besitztWaschbecken) {
        this.besitztWaschbecken = besitztWaschbecken;
    }
}