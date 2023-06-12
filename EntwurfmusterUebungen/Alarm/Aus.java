package Alarm;

public class Aus implements State {
    
    private Alarmanlage alarmanlage;
    
    public Aus(Alarmanlage alarmanlage) {
        this.alarmanlage = alarmanlage;
    }
    
    public void einschalten() {
        System.out.println("Hallo User, ich bin nun eingeschalten!");
    }
    
    public void aktivieren() {
        System.out.println("Pieeeeeeeep pieeeeeeep pieiiihiiiiiiiiipp - \naus Sicherheitsgründen werden die Zahlen hier "
                + "nicht angezeigt ;)");
        alarmanlage.setAktuellerZustand(new Aktiv(alarmanlage)); // Zustandsübergang
        System.out.println("Alarmanlage ist nun scharf");
    }
    
    public void deaktivieren() {
        alarmanlage.setAktuellerZustand(new Deaktiviert(alarmanlage));
    }
    
    public void ausschalten() {
    }

}
