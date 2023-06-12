package BestuhlungBewirtung;

public class Kaffeegedeck extends Bewirtung {
    
    public Kaffeegedeck(Bestuhlung bestuhlung) {
        this.bestuhlung = bestuhlung;
    }
    
    public String getBezeichnung() {
        return "Kaffeegedeck 420ml: ";
    }
    
    public double preis() {
        return 6.0;
    }

}
