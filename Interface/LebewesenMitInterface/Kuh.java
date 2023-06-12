package LebewesenMitInterface;

public class Kuh extends Tier implements Nutztier {

    private String farbe;
    private String nutzen;

    public Kuh(String vorname, String bewegung, String toene, String gattung, String farbe) {
        super(vorname, bewegung, toene, gattung);
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String nutzen() {
        if (getVorname().equals("Milka")) {
            this.nutzen = "schmeckt gut";
        } else {
            this.nutzen = "gibt Milch";
        }
        return nutzen;
    }
    
    @Override
    public String toString() {
        String elternstring = super.toString();
        return String.format("%s\nFarbe: %s\nNutzen: %s", elternstring, farbe, nutzen());
    }
}
