package LebewesenMitInterface;

public class Hund extends Tier {
    
    private int steuernummer;
    
    public Hund(String vorname, String bewegung, String toene, String gattung, int steuernummer) {
        super(vorname, bewegung, toene, gattung);
        this.steuernummer = steuernummer;
    }
    
    public int getSteuernummer() {
        return steuernummer;
    }
    
    public void setSteuernummer(int steuernummer) {
        this.steuernummer = steuernummer;
    }

}
