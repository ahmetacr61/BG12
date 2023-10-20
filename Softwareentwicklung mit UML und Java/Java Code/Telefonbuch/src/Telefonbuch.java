import java.util.ArrayList;

public class Telefonbuch {
    private ArrayList<Eintrag> eintraege = new ArrayList<>();

    public void eintragAnlegen(String vorname, String nachname, String telefonnummer) {
        Eintrag eintrag = new Eintrag(vorname, nachname, telefonnummer);

        eintraege.add(eintrag);
    }

    public Eintrag eintragSuchen(String telefonnummer) {
        for(Eintrag eintrag : eintraege) {
            if(eintrag.getTelefonnummmer().equals(telefonnummer)) {
                return eintrag;
            }
        }
        return null;
    }

    public ArrayList<Eintrag> eintraegeSuchen(String vorname) {
        for(Eintrag eintrag : eintraege) {
            if(eintrag.getVorname().equals(vorname)) {
                return eintraege;
            }
        }
        return null;
    }

    public boolean eintragLoeschen(String telefonnummer) {
        for(Eintrag eintrag : eintraege) {
            if(eintrag.getTelefonnummmer().equals(telefonnummer)) {
                eintraege.remove(eintrag);
                return true;
            }
        }
        return false;
    }
}