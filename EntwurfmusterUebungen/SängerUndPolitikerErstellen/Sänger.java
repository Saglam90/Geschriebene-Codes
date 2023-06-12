package SängerUndPolitikerErstellen;

public class Sänger extends Person {

    public Sänger() {

        singMethoden = new Laut();
        denkMethoden = new Schnell();

        System.out.println("Ich bin ein Sänger");
        System.out.println("Bei mir sollte als Ergebnis herauskommen, dass ich laut singe und "
                + "eine gute Auffassungsgabe habe");
    }
}
