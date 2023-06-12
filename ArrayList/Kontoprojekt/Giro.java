package kontoprojekt;

public class Giro extends Konto implements Zeichnungsberechtigt {
    private double Dispo;
    private double Dispogebuehren;
    private String Scoring;
    private boolean Ueberweisungsflatrate;
    
    public Giro(String Inhaber, int Kontonummer, double Kstand, int Kartennummer, 
            int einfachePin, double Dispo, double Dispogebuehren, String Scoring, boolean Ueberweisungsflatrate) {
        super(Inhaber, Kontonummer, Kstand, Kartennummer, einfachePin);
        this.Dispo = Dispo;
        this.Dispogebuehren = Dispogebuehren;
        this.Scoring = Scoring;
        this.Ueberweisungsflatrate = Ueberweisungsflatrate;
    }
    @Override
    public void Bevollmaechtigter() {
        System.out.printf("Bevollmaechtigung hat nur der Inhaber:\t%s", getInhaber());
    }

    public double getDispo() {
        return Dispo;
    }
    public void setDispo(double Dispo) {
        this.Dispo = Dispo;
    }
    public double getDispogebuehren() {
        return Dispogebuehren;
    }
    public void setDispogebuehren(double Dispogebuehren) {
        this.Dispogebuehren = Dispogebuehren;
    }
    public String getScoring() {
        return Scoring;
    }
    public void setScoring(String Scoring) {
        this.Scoring = Scoring;
    }
    public boolean isUeberweisungsflatrate() {
        return Ueberweisungsflatrate;
    }
    public void setUeberweisungsflatrate(boolean Ueberweisungsflatrate) {
        this.Ueberweisungsflatrate = Ueberweisungsflatrate;
    }

    @Override
    public String toString() {
        return String.format("Giro Konto\nName:\t%s\nKontonummer:\t%d\nKontostand:\t%.2f Euro\nKartennummer:"
                + "\t%d\nDispo:\t%.2f Euro\nDispogebuehren:\t%.2f Euro\nScoring:\t%s\nUeberweisungsflatrate:"
                + "\t%b\n",getInhaber(),getKontonummer(),getKstand(),getKartennummer(),getDispo(),
                getDispogebuehren(),getScoring(),isUeberweisungsflatrate());
    }
}

