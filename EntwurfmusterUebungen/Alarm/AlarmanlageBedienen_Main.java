package Alarm;

public class AlarmanlageBedienen_Main {

    public static void main(String[] args) {
        Alarmanlage alarmanlage = new Alarmanlage();
        
        
        alarmanlage.einschalten();
        
        alarmanlage.aktivieren();

        alarmanlage.deaktivieren();
        
        alarmanlage.ausschalten();
    }
}
