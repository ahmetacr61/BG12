public class Computerraum extends Raum {
    private int anzahlDerComputer;

    public Computerraum(String raumbezeichnung, int schuelerarbeitsplaetze, boolean besitztWaschbecken, int anzahlDerComputer) {
        super(raumbezeichnung, schuelerarbeitsplaetze, besitztWaschbecken);
        this.anzahlDerComputer = anzahlDerComputer;
    }

    public int getAnzahlDerComputer() {
        return anzahlDerComputer;
    }

    public void setAnzahlDerComputer(int anzahlDerComputer) {
        this.anzahlDerComputer = anzahlDerComputer;
    }

    public boolean genugComputerVorhanden() {
        if(getSchuelerarbeitsplaetze() == anzahlDerComputer) {
            return true;
        } else {
            return false;
        }
    }
}