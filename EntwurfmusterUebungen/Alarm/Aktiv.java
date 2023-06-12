package Alarm;

public class Aktiv implements State {
    
    private Alarmanlage alarmanlage;
    
    public Aktiv(Alarmanlage alarmanlage) {
        this.alarmanlage = alarmanlage;
    }
    
    public void einschalten() {
    }

    public void aktivieren() {
    }

    public void deaktivieren() {
        System.out.println("Alarmanlage wird deaktiviert.");
        alarmanlage.setAktuellerZustand(new Deaktiviert(alarmanlage)); // Zustandsübergang
        System.out.println("Alarmanlage ist nun deaktiviert.");
    }

    public void ausschalten() {
        System.out.println("Die Alarmanlage wird ausgeschaltet");
        System.out.println("Die Alarmanlage ist nun ausgeschaltet");
    }
}

