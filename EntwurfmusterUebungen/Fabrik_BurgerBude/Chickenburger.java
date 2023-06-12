package Fabrik_BurgerBude;

class Chickenburger extends Burger {
    public Chickenburger() {
        name = "Chicken burger";
        fleisch = "Chicken patty";
        broetchen = "Burgerbrötchen";
        belag.add("Kopfsalat");
        belag.add("Toamaten");
        belag.add("Mayonnaise");
    }
}