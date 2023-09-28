import java.util.ArrayList;

public class Kunde {
    private int kundennummer;
    private String vorname;
    private String nachname;
    private ArrayList<Konto> konten = new ArrayList<Konto>();

    public Kunde(String vorname, String nachname, int kundennummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kundennummer = kundennummer;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}