package InternenExternenMitarbeiter;

public class Sachbearbeiter extends Mitarbeiter {
    
    public Sachbearbeiter() {
        internextern = new Intern();
        bereich = new Verwaltung();
    }
    
    @Override
    public void display() {
        System.out.println("Ich bin ein Sachbearbeiter -> VerwaltungsMA.java");
    }

}
