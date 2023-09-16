public class main {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Melitta", "Jacobs-Dallmayr", 4711, null);
        Arbeitsvertrag arbeitsvertrag = new Arbeitsvertrag(4711, "Kaffe Kochen", 4000);

        System.out.println("---Mitarbeiter---");
        System.out.println(mitarbeiter.getID());
        System.out.println(mitarbeiter.getVorname());
        System.out.println(mitarbeiter.getNachname());
        System.out.println(mitarbeiter.getGeburtsdatum());
        mitarbeiter.setArbeitsvertrag(arbeitsvertrag);

        System.out.println("\n---Arbeitsvertrag---");
        System.out.println(mitarbeiter.getArbeitsvertrag().getID());
        System.out.println(mitarbeiter.getArbeitsvertrag().getTaetigkeitsbeschreibung());
        System.out.println(mitarbeiter.getArbeitsvertrag().getMonatlicherGehalt());
        System.out.println(mitarbeiter.getArbeitsvertrag());

        System.out.println("\n---Firma und Mitarbeiter---");

        Firma firma = new Firma();

        firma.einfuegenMitarbeiter(new Mitarbeiter("Rheina", "Neuwuert", 69, null));
        firma.einfuegenMitarbeiter(new Mitarbeiter("Lois", "Gruffyn", 420, null));

        System.out.println(firma.suchenMitarbeiter(69));
        System.out.println(firma.suchenMitarbeiter(840));
        System.out.println(firma.suchenMitarbeiter(420));
        System.out.println(firma.loeschenMitarbeiter(420));
        System.out.println(firma.loeschenMitarbeiter(420));
        System.out.println(firma.suchenMitarbeiter(420));
    }
}