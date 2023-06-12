package LebewesenMitInterface;

public class Tier extends Lebewesen {
    
    private String gattung;
    
    public Tier(String vorname, String bewegung, String toene, String gattung) {
        super(vorname, bewegung, toene);
        this.gattung = gattung;
    }
    
    public void setGattung(String gattung) {
        this.gattung = gattung;
    }
    
    public String getGattung() {
        return gattung;
    }
    
    @Override
    public String toString() {
        String elternstring = super.toString();
        return String.format("%s\nKommunikation: %s\nBewegungsart: %s\nDie Gattung ist: %s", elternstring,
                getToene(), getBewegung(), gattung);
    }

}
