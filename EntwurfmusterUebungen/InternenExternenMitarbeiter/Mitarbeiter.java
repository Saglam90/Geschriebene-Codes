package InternenExternenMitarbeiter;

public abstract class Mitarbeiter {
    Bereich bereich;
    InternExtern internextern;
    
    String Name = "";
    
    public abstract void display();
    
    public void setName(String n) {
        this.Name = n;
        System.out.println("Mein Name ist " + n);
    }
    
    public void bereichV() {
        bereich.bereichW();
    }
    
    public void internexternV() {
        internextern.internexternW();
    }
    
}
