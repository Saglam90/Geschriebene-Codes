package InternenExternenMitarbeiter;

public class DoziEx extends Mitarbeiter {
    
    public DoziEx() {
        internextern = new Extern();
        bereich = new Unterricht();
    }
    
    @Override
    public void display() {
        System.out.println("Ich bin ein externer Dozent --> DoziExt.java");
    }

}
