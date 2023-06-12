package BestuhlungBewirtung;

public class Fruchtsaft extends Bewirtung {
    
    public Fruchtsaft(Bestuhlung bestuhlung) {
        this.bestuhlung = bestuhlung;
    }
    
    public String getBezeichnung() {
        return "Fruchtsaft";
    }
    
    public double preis() {
        return 10;
    }

}
