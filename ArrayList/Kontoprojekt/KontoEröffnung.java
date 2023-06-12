package kontoprojekt;

import java.util.ArrayList;
import java.util.Scanner;

public class KontoEröffnung {

    public static void main(String[] args) {
        ArrayList<Konto> kunden = new ArrayList<>();
        kunden.add(new Giro("Saglam", 10010088, 2000.0, 10088, 1111, 1500.0, 5.0, "98%", false));
        kunden.add(new Geschaeftskonto("Golser", 30030077, 2000.0, 30077, 3333, 5000));
        kunden.add(new Sparbuch("Fakili", 20020099, 2000.0, 20099, 2222, 3.0));
        for (int i = 0; i < kunden.size(); i++) {
            System.out.println(kunden.get(i));
        }
        Scanner eing = new Scanner(System.in);
        System.out.println("Herzlich Willkommen.\n1 Konto eroeffnen\n2 Konto verarbeiten");
        int wahl = eing.nextInt();
        switch (wahl) {
            case 1:
                System.out.println("1 Girokonto\n2 Geschaeftskonto\n3 Sparbuch");
                wahl = eing.nextInt();
                switch (wahl) {
                    case 1:
                        System.out.println("Name eingeben");
                        String name = eing.next();
                        System.out.println("Kontonummer eingeben (8 Stellig)");
                        int kontoN = eing.nextInt();
                        System.out.println("Kontostand eingeben");
                        double kontoS = eing.nextDouble();
                        System.out.println("Die Kartennummer muss zu der Kontonummer passen: "
                                + "(5 Stellig) Die Kontonummer ist: \'" + kontoN + "\'");
                        System.out.println("Kartennummer eingeben");
                        int kartenN = eing.nextInt();
                        System.out.println("Einfache Pin");
                        int einfacheP = eing.nextInt();
                        System.out.println("Dispostand eingeben");
                        double dispoS = eing.nextDouble();
                        System.out.println("Dispo Gebühren eingeben");
                        double dispoG = eing.nextDouble();
                        System.out.println("Scoring eingeben");
                        String scoring = eing.next();
                        System.out.println("Hat der Kunde eine Ueberweisungsflatrate?\ttrue eingeben für ja\t"
                                + "false eingeben für nein");
                        boolean flatrate = eing.nextBoolean();
                        kunden.add(new Giro(name, kontoN, kontoS, kartenN, einfacheP, dispoS,
                                dispoG, scoring, flatrate));
                        break;
                    case 2:
                        System.out.println("Name eingeben");
                        name = eing.next();
                        System.out.println("Kontonummer eingeben (8 Stellig)");
                        kontoN = eing.nextInt();
                        System.out.println("Kontostand eingeben");
                        kontoS = eing.nextDouble();
                        System.out.println("Die Kartennummer muss zu der Kontonummer passen: "
                                + "(5 Stellig) Die Kontonummer ist: \'" + kontoN + "\'");
                        System.out.println("Kartennummer eingeben");
                        kartenN = eing.nextInt();
                        System.out.println("Einfache Pin");
                        einfacheP = eing.nextInt();
                        System.out.println("Kreditbetrag eingeben");
                        int kredit = eing.nextInt();
                        kunden.add(new Geschaeftskonto(name, kontoN, kontoS, kartenN, einfacheP,
                                kredit));
                        break;
                    case 3:
                        System.out.println("Name eingeben");
                        name = eing.next();
                        System.out.println("Kontonummer eingeben (8 Stellig)");
                        kontoN = eing.nextInt();
                        System.out.println("Kontostand eingeben");
                        kontoS = eing.nextDouble();
                        System.out.println("Die Kartennummer muss zu der Kontonummer passen: "
                                + "(5 Stellig) Die Kontonummer ist: \'" + kontoN + "\'");
                        System.out.println("Kartennummer eingeben");
                        kartenN = eing.nextInt();
                        System.out.println("Einfache Pin");
                        einfacheP = eing.nextInt();
                        System.out.println("Zinsen in Prozent eingeben");
                        double zins = eing.nextDouble();
                        kunden.add(new Sparbuch(name, kontoN, kontoS, kartenN, einfacheP, zins));
                        break;
                    default:
                        System.out.println("Falsche Eingabe");
                }
                break;
            case 2:
                System.out.println("1 Einzahlen\n2 Kontostand abfragen\n3 Auszahlen\n");
                wahl = eing.nextInt();
                switch (wahl) {
                    case 1:
                        System.out.println("Auf Welches Konto wollen Sie einzahlen? Geben sie die "
                                + "Kontonummer ein.");
                        int KontoN = eing.nextInt();
                        System.out.println("Wie viel wollen Sie einzahlen?");
                        int einzahlen = eing.nextInt();
                        for (int i = 0; i < kunden.size(); i++) {
                            if (KontoN == kunden.get(i).getKontonummer()) {
                                System.out.println("Alter Kontostand\n" + kunden.get(i).getKstand());
                                kunden.get(i).setKstand(einzahlen + kunden.get(i).getKstand());
                                System.out.println("\nNeue Kontostand\n" + kunden.get(i));
                            } else {
                                System.out.println("Falsche Eingabe");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Geben Sie die Kartennummer ein");
                        int KartenN = eing.nextInt();
                        for (int i = 0; i < kunden.size(); i++) {
                            if (KartenN == kunden.get(i).getKartennummer()) {
                                System.out.println(kunden.get(i));
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Geben Sie die Pin ein");
                        int pin = eing.nextInt();
                        System.out.println("Wie viel wollen Sie Auzahlen?");
                        int auszahl = eing.nextInt();
                        for (int i = 0; i < kunden.size(); i++) {
                            if (pin == kunden.get(i).getEinfachePin()) {
                                kunden.get(i).setKstand(kunden.get(i).getKstand() - auszahl);
                                System.out.println("Sie Kriegen " + auszahl + " Euro\n");
                                System.out.println("Neue Kontostand " + kunden.get(i).getKstand() + " €");
                            }
                        }
                        break;
                    default:
                        System.out.println("Falsche Eingabe");
                }
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}
