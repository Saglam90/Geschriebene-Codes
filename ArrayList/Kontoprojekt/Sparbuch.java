package kontoprojekt;

public class Sparbuch extends Konto {
    private double ZinsenInProzent;
    
    public Sparbuch(String Inhaber, int Kontonummer, double Kstand, int Kartennummer, 
            int einfachePin, double ZinsenInProzent) {
        super(Inhaber, Kontonummer, Kstand, Kartennummer, einfachePin);
        this.ZinsenInProzent = ZinsenInProzent;
    }

    public double getZinsenInProzent() {
        return ZinsenInProzent;
    }

    public void setZinsenInProzent(double ZinsenInProzent) {
        this.ZinsenInProzent = ZinsenInProzent;
    }
    
    @Override
    public String toString() {
        return String.format("Sparbuch Konto\nName:\t%s\nKontonummer:\t%d\nKontostand:\t%.2f Euro\n"
                + "Kartennummer:\t%d\nZinzenInProzent:\t%.2f\n",getInhaber(),getKontonummer(),getKstand(), 
                getKartennummer(), getZinsenInProzent());
    }

}

