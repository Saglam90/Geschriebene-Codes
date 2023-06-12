package LebewesenMitInterface;

public class Mensch extends Lebewesen {

    private String nachname;
    private String hobby;
    
    public Mensch (String vorname, String bewegung, String toene, String nachname, String hobby) {
        super(vorname, bewegung, toene);
        this.nachname = nachname;
        this.hobby = hobby;
    }
    
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    public String getNachname() {
        return nachname;
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    public String getHobby() {
        return hobby;
    }
    
    @Override
    public String toString() {
        String elternstring = super.toString();
        return String.format("%s\nNachname: %s\nKommunikation: %s\nBewegungsart: %s\nHobby: %s",
                elternstring, nachname, getToene(), getBewegung(), getHobby());
    }
}
