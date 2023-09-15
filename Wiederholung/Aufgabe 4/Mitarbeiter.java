public class Mitarbeiter {
    private String Vorname, Nachname, Geburtsdatum;
    private int ID;
    private Arbeitsvertrag arbeitsvertrag;

    public Mitarbeiter(String Vorname, String Nachname, int ID, String Geburtsdatum) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.ID = ID;
        this.Geburtsdatum = Geburtsdatum;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }

    public void setGeburtsdatum(String Geburtsdatum) {
        this.Geburtsdatum = Geburtsdatum;
    }

    public int getID() {
        return ID;
    }

    public String getGeburtsdatum() {
        return Geburtsdatum;
    }

    public String getNachname() {
        return Nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setArbeitsvertrag(Arbeitsvertrag arbeitsvertrag) {
        this.arbeitsvertrag = arbeitsvertrag;
    }

    public Arbeitsvertrag getArbeitsvertrag() {
        return arbeitsvertrag;
    }
}