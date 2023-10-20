public class Eintrag {
    private String vorname, nachname, telefonnummmer;

    public Eintrag(String vorname, String nachname, String telefonnummmer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummmer = telefonnummmer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getTelefonnummmer() {
        return telefonnummmer;
    }
}