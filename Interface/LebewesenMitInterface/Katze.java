package LebewesenMitInterface;

public class Katze extends Tier {
    
    private String lebensart;
    
    public Katze(String vorname, String bewegung, String toene, String gattung, String lebensart) {
        super(vorname, bewegung, toene, gattung);
        this.lebensart = lebensart;
    }
    
    public String getLebensart() {
        return lebensart;
    }
    
    public void setLebensart(String lebensart) {
        this.lebensart = lebensart;
    }

}
