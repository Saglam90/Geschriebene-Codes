package kontoprojekt;

public class Geschaeftskonto extends Konto implements Zeichnungsberechtigt {
    private int Kreditrahmen = 5000;
    
    public Geschaeftskonto(String Inhaber, int Kontonummer, double Kstand, int Kartennummer, 
            int einfachePin, int Kreditrahmen) {
        super(Inhaber, Kontonummer, Kstand, Kartennummer, einfachePin);
        this.Kreditrahmen = Kreditrahmen;
    }
    @Override
    public void Bevollmaechtigter() {
        System.out.printf("Bevollmaechtigung hat nur der Inhaber:\t%s", getInhaber());
    }

    public int getKreditrahmen() {
        return Kreditrahmen;
    }

    public void setKreditrahmen(int Kreditrahmen) {
        this.Kreditrahmen = Kreditrahmen;
    }
    
    @Override
    public String toString() {
        return String.format("Geschaefts Konto\nName:\t%s\nKontonummer:\t%d\nKontostand:\t%.2f Euro\n"
                + "Kartennummer:\t%d\nKreditrahmen:\t%d Euro\n",getInhaber(),getKontonummer(),getKstand(),
                getKartennummer(),getKreditrahmen());
    }

}

