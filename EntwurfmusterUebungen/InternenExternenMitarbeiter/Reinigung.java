package InternenExternenMitarbeiter;

public class Reinigung extends Mitarbeiter {
    
    public Reinigung() {
        bereich = new Gebäudereinigung();
        internextern = new Extern();
        
    }
    
    @Override
    public void display() {
        System.out.println("Ich bin ein externer Mitarbeiter Bereich Reinigung - SonstigerExt.java");
    }

}
