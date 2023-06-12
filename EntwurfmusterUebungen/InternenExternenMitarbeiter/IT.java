package InternenExternenMitarbeiter;

public class IT extends Mitarbeiter {
    
    public IT() {
    bereich = new Systemtechnik();
    internextern = new Intern();
    }

    @Override
    public void display() {
        System.out.println("Ich bin in der IT -> IT.java");
    }
}
