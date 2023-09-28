public class Main {
    private Bank bank;
    private Konto kontoRinat, kontoLouis;
    private Kunde rinat, louis, mychi;
    public static void main(String[] args) {
        rinat = new Kunde("Rinat", "Neuwert", 6969);
        louis = new Kunde("Louis", "Schefflus", 420);
        mychi = new Kunde("Mychi", "Gaudacheese", 0000);

        kontoRinat = new Konto(6969, 1000, rinat);
    }
}
