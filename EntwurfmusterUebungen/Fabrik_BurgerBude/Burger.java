package Fabrik_BurgerBude;

import java.util.ArrayList;
import java.util.List;

abstract class Burger {
    protected String name;
    protected String fleisch;
    protected String broetchen;
    protected List<String> belag = new ArrayList<>();

    public void prepare() {
        System.out.println("Vorbereitung " + name);
        System.out.println("Hinzufügen " + fleisch);
        System.out.println("Hinzufügen " + broetchen);
        System.out.print("Belag hinzufügen:");
        for (String belag : belag) {
            System.out.print("  " + belag);
        }
    }

    public void cook() {
        System.out.println("Burger 10 min. grillen.");
    }

    public void box() {
        System.out.println("Burger einpacken.");
    }

    public String getName() {
        return name;
    }
}