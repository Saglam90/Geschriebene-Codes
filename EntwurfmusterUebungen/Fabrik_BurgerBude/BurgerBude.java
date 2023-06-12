package Fabrik_BurgerBude;



import java.util.Scanner;

public class BurgerBude {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        BurgerBestellung burgerBestellung = new BurgerBestellung(burgerFactory);
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("---");
            System.out.println("Willkommen bei der Burger-Bude!");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1. Bestellung in Deutschland aufgeben");
            System.out.println("2. Bestellung in Indien aufgeben");
            System.out.println("3. Beenden");
            System.out.println("---");
            System.out.print("Ihre Auswahl: ");


            int auswahl = scanner.nextInt();
             

            switch (auswahl) {
                case 1:
                    System.out.println("---");
                    System.out.println("Deutsche Burger-Bude:");
                    System.out.println("Bitte wählen Sie den Burger-Typ:");
                    System.out.println("1. Hamburger");
                    System.out.println("2. Cheeseburger");
                    System.out.println("3. Chickenburger");
                    System.out.println("---");
                    System.out.print("Ihre Auswahl: ");

                    int burgerTypDeutschland = scanner.nextInt();
                    

                    switch (burgerTypDeutschland) {
                        case 1:
                            burgerBestellung.aufgebenBestellung("hamburger", "Germany");
                            break;
                        case 2:
                            burgerBestellung.aufgebenBestellung("cheeseburger", "Germany");
                            break;
                        case 3:
                            burgerBestellung.aufgebenBestellung("chickenburger", "Germany");
                            break;
                        default:
                            System.out.println("Ungültige Auswahl!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---");
                    System.out.println("Indische Burger-Bude:");
                    System.out.println("Bitte wählen Sie den Burger-Typ:");
                    System.out.println("1. Hamburger");
                    System.out.println("2. Cheeseburger");
                    System.out.println("3. Chickenburger");
                    System.out.println("---");
                    System.out.print("Ihre Auswahl: ");

                    int burgerTypIndien = scanner.nextInt();
                    scanner.nextLine(); // leere den Puffer

                    switch (burgerTypIndien) {
                        case 1:
                            burgerBestellung.aufgebenBestellung("hamburger", "India");
                            break;
                        case 2:
                            burgerBestellung.aufgebenBestellung("cheeseburger", "India");
                            break;
                        case 3:
                            burgerBestellung.aufgebenBestellung("chickenburger", "India");
                            break;
                        default:
                            System.out.println("Ungültige Auswahl!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Vielen Dank für Ihren Besuch!");
                    return;
                default:
                    System.out.println("Ungültige Auswahl!");
                    break;
            }
            System.out.println();
        }
    }
}
