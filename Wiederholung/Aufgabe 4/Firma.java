import javax.swing.plaf.InsetsUIResource;
import java.util.ArrayList;

public class Firma {
    private Mitarbeiter mitarbeiter;
    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();

    public void einfuegenMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.add(mitarbeiter);
    }

    public Mitarbeiter suchenMitarbeiter(int id) {
        boolean mitarbeiterGefunden = false;
        Mitarbeiter mitarbeiter = new Mitarbeiter(null, null, 0, null);
        for(int i = 0; i < mitarbeiterListe.toArray().length; i++) {
            if(mitarbeiterListe.get(i).getID() == id) {
                mitarbeiterGefunden = true;
                mitarbeiter = mitarbeiterListe.get(i);
                break;
            } else {
                mitarbeiterGefunden = false;
            }
        }
        if(mitarbeiterGefunden) {
            return mitarbeiter;
        } else {
            return null;
        }
    }

    public boolean loeschenMitarbeiter(int id) {
        boolean mitarbeiterGefunden = false;
        for(int i = 0; i < mitarbeiterListe.toArray().length; i++) {
            if(mitarbeiterListe.get(i).getID() == id) {
                mitarbeiterGefunden = true;
                mitarbeiterListe.remove(i);
                break;
            } else {
                mitarbeiterGefunden = false;
            }
        }
        if(mitarbeiterGefunden) {
            return true;
        } else {
            return false;
        }
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

}
