package LebewesenMitInterface;

public class Huhn extends Tier implements Nutztier {

    private String haltung;
    private String nutzen;

    public Huhn(String vorname, String bewegung, String toene, String gattung, String haltung) {
        super(vorname, bewegung, toene, gattung);
        this.haltung = haltung;
    }

    public String getHaltung() {
        return haltung;
    }

    public void setHaltung(String haltung) {
        this.haltung = haltung;
    }

    @Override
    public String nutzen() {
        this.nutzen = "legt Eier";
        return nutzen;
    }

    @Override
    public String toString() {
        String elternstring = super.toString();
        return String.format("%s\nHaltung: %s\nNutzen: %s", elternstring, haltung, nutzen());
    }
}
