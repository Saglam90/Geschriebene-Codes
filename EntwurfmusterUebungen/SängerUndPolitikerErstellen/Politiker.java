package SängerUndPolitikerErstellen;

public class Politiker extends Person {

    public Politiker() {
        
        singMethoden = new Laut();
        denkMethoden = new GarNicht();

        System.out.println("Ich bin ein Quatschkopf (=Politiker)");
        System.out.println("Bei mir sollte als Ergebnis herauskommen, dass ich laut singe und über mein "
                + "Denkvermögen keine Worte verloren werden");
    }
}
