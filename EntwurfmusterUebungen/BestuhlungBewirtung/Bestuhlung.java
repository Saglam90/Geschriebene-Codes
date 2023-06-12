package BestuhlungBewirtung;

public abstract class Bestuhlung {
    
    String bezeichnung = "Unbekannte Bezeichnung";
    
    public String getBezeichnung() {
        return bezeichnung;
    }
    
    public abstract double preis();

}
