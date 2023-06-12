package taschenrechner;

import java.util.Scanner;

public class Taschenrechner_1 {

    public static void main(String[] args) {
        double erg = 0;
        Scanner eing = new Scanner(System.in);
        System.out.println("Erste Zahl eingeben");
        int zahl1 = eing.nextInt();
        System.out.println("Operator eingeben");
        String op = eing.next();
        System.out.println("Zweiter Zahl eingeben");
        int zahl2 = eing.nextInt();

        switch (op) {
            case "+":
                erg = addition(zahl1, zahl2);
                break;
            case "-":
                erg = subtraktion(zahl1, zahl2);
                break;
            case "*":
                erg = multiplikation(zahl1, zahl2);
                break;
            case "/":
                if (zahl2 != 0) {
                    erg = division(zahl1, zahl2);
                } else {
                    System.out.println("Division durch 0 ist nicht erlaubt");
                }
                break;
            default:
                System.out.println("Falscher Operator.");
        }
        ausgabe(erg);
    }

    public static int addition(int x, int y) {

        int erg = x + y;
        return erg;

    }

    public static int subtraktion(int x, int y) {

        int erg = x - y;
        return erg;
    }

    public static int multiplikation(int x, int y) {

        int erg = x * y;
        return erg;
    }

    public static double division(int x, int y) {

        double erg = (double) x / y;
        return erg;
    }

    public static void ausgabe(double erg) {

        System.out.println(erg);
    }
}
