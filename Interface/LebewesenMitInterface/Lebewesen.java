package LebewesenMitInterface;

public class Lebewesen {
    
    private String vorname;
    private String bewegung;
    private String toene;
    private String ichBin;
    
    public Lebewesen(String vorname, String bewegung, String toene) {
        this.vorname = vorname;
        this.bewegung = bewegung;
        this.toene = toene;
    }
    
    public void setBewegung(String bewegung) {
        this.bewegung = bewegung;
    }
    
    public String getBewegung() {
        return bewegung;
    }
    
    public void setToene (String toene) {
        this.toene = toene;
    }
    
    public String getToene() {
        return toene;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    
    public String getVorname() {
        return vorname;
    }
    
    public void setIchBin(String ichBin) {
        this.ichBin = ichBin;
    }
    
    public String getIchBin() {
        return ichBin;
    }
    
    @Override
    public String toString() {
        return String.format("Ich bin: %s\nVorname: %s ", getIchBin(), getVorname());
    }

}
