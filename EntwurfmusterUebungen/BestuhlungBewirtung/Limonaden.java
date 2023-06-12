package BestuhlungBewirtung;

public class Limonaden extends Bewirtung {
    
    public Limonaden(Bestuhlung bestuhlung) {
        this.bestuhlung = bestuhlung;
    }
    
    public String getBezeichnung() {
        return "Limonade";
    }
    
    public double preis() {
        return 10;
    }

}
