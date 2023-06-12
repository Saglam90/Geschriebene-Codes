package kontoprojekt;

public abstract class Konto  {
    private final String Inhaber;
    private final int Kontonummer;
    private double Kstand;
    private final int Kartennummer;
    private int einfachePin;
    
    public Konto(String Inhaber, int Kontonummer, double Kstand, int Kartennummer, 
            int einfachePin) {
        this.Inhaber = Inhaber;
        this.Kontonummer = Kontonummer;
        this.Kstand = Kstand;
        this.Kartennummer = Kartennummer;
        this.einfachePin = einfachePin;
    }
    
    public int getKontonummer() {
        return Kontonummer;
    }
    public String getInhaber() {
        return Inhaber;
    }
    public double getKstand() {
        return Kstand;
    }
    public int getKartennummer() {
        return Kartennummer;
    }
    public int getEinfachePin() {
        return einfachePin;
    }
    public void setKstand(double ks) {
        this.Kstand = ks;
    }
    public void setEinfachePin(int ep) {
        this.einfachePin = ep;
    }
}
