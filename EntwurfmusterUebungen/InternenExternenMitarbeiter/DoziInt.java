package InternenExternenMitarbeiter;

public class DoziInt extends Mitarbeiter {
    
    public DoziInt() {
        internextern = new Intern();
        bereich = new Unterricht();
    }
    
    @Override
    public void display() {
        System.out.println("Ich bin ein interner Dozent --> DoziInt.java");
    }

}
