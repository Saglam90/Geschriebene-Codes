package Alarm;

public class Deaktiviert implements State {
    
    private Alarmanlage alarmanlage;
    
    public Deaktiviert (Alarmanlage alarmanlage) {
        this.alarmanlage = alarmanlage;
    }
    
    public void einschalten() {
        System.out.println("Die Alarmanlage wird eingeschaltet");
    }
    
    public void aktivieren() {
        System.out.println("Die Alarmanlage wird aktiviert");
    }
    
    public void deaktivieren() {
        
    }
    
    public void ausschalten() {
        System.out.println("Die Anlage wird ausgeschaltet");
    }

}
