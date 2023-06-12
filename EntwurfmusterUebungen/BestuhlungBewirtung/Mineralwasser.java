package BestuhlungBewirtung;

public class Mineralwasser extends Bewirtung {
    
    public Mineralwasser(Bestuhlung bestuhlung) {
        this.bestuhlung = bestuhlung;
    }
    
    public String getBezeichnung() {
        return "Minerallwasser 0,33: ";
    }
    
    public double preis() {
        return 2.0;
    }

}
