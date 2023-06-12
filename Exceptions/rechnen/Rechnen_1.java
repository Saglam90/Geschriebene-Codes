package rechnen;

import java.util.Scanner;

public class Rechnen_1 {

    public static double ichRechne() {
        int zahl1 = 0, zahl2 = 0;
        double erg = 0.0d;
        Scanner eing = new Scanner(System.in);
        System.out.println("Bitte geben Sie zahl1 ein.");
        zahl1 = eing.nextInt();
        System.out.println("Bitte geben Sie zahl2 ein.");
        zahl2 = eing.nextInt();
        try {
            erg = zahl1 / zahl2;
            System.out.println("Das Ergebnis der Teilung von " + zahl1 + " durch " + zahl2 + " ist " + erg);
        } catch (ArithmeticException ari){
            System.out.println("Nanana, Teilung durch 0 ist doch wohl böse");
        }
        return erg;
    }
}
