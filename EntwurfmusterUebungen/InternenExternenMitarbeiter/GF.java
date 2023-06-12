package InternenExternenMitarbeiter;

public class GF extends Mitarbeiter {

    public GF() {

        bereich = new Verwaltung();
        internextern = new Intern();
}
    @Override
    public void display() {
        System.out.println("Ich bin ein GF --> GF.java");
    }
}
