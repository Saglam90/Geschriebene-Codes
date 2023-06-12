package Alarm;

public class Alarmanlage {
    
    //Was man mit der Alarmanlage so machen kann
    private State aktuellerZustand;
    
    //Defaultzustand Aus in Konstruktor setzen.
    public Alarmanlage() {
        setAktuellerZustand(new Aus(this));
    }
    
    //Setter zum Setzen des aktuellen Zustands.
    public void setAktuellerZustand(State aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }
    
    public void einschalten() {
        aktuellerZustand.einschalten();
    }
    
    public void aktivieren() {
        aktuellerZustand.aktivieren();
    }
    
    public void deaktivieren() {
        aktuellerZustand.deaktivieren();
    }
    
    public void ausschalten() {
        aktuellerZustand.ausschalten();
    }

}
