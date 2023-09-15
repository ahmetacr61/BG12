public class Arbeitsvertrag {
    private String Taetigkeitsbeschreibung;
    private int monatlicherGehalt, ID;

    public Arbeitsvertrag(int ID, String Taetigkeitsbeschreibung, int monatlicherGehalt) {
        this.ID = ID;
        this.Taetigkeitsbeschreibung = Taetigkeitsbeschreibung;
        this.monatlicherGehalt = monatlicherGehalt;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTaetigkeitsbeschreibung(String Taetigkeitsbeschreibung) {
        this.Taetigkeitsbeschreibung = Taetigkeitsbeschreibung;
    }

    public void setMonatlicherGehalt(int monatlicherGehalt) {
        this.monatlicherGehalt = monatlicherGehalt;
    }

    public int getID() {
        return ID;
    }

    public int getMonatlicherGehalt() {
        return monatlicherGehalt;
    }

    public String getTaetigkeitsbeschreibung() {
        return Taetigkeitsbeschreibung;
    }
}