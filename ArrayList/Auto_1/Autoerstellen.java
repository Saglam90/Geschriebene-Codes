package Auto_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Autoerstellen {

    public static void main(String[] args) {
        Scanner eing = new Scanner(System.in);

        ArrayList<Auto> autos = new ArrayList<>();
        Auto eintrag;
        autos.add(new Auto("Audi A8", 2010));
        autos.add(new Auto("Mercedes", 2010));
        eintrag = new Auto("Mercedes", 2007);
        autos.add(eintrag);
        eintrag = new Auto("Audi A8", 2007);
        autos.add(eintrag);


        System.out.println("1 Nach Baujahr suchen\n2 Nach Marken suchen");
        int wahl = eing.nextInt();
        switch (wahl) {
            case 1:
                System.out.println("Geben Sie das Baujahr ein");
                int bauj = eing.nextInt();
                for (int i = 0; i < autos.size(); i++) {
                    if (autos.get(i).getBaujahr() == bauj) {
                        System.out.println(autos.get(i).getMarke());
                        System.out.println(autos.get(i).getBaujahr());
                    }
                }
                break;
            case 2:
                System.out.println("Geben Sie die Marke ein");
                String markeS = eing.next();
                for (int i = 0; i < autos.size(); i++) {
                    if (autos.get(i).getMarke().equals(markeS)) {
                        System.out.println(autos.get(i).getBaujahr());
                        System.out.println(autos.get(i).getMarke());
                    }
                }
                break;
            default:
                System.out.println("Nicht vorhanden");
        }
    }
}
