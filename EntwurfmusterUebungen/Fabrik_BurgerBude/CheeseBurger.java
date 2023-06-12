package Fabrik_BurgerBude;

class Cheeseburger extends Burger {
    public Cheeseburger() {
        name = "Cheeseburger";
        fleisch = "Fleisch patty";
        broetchen = "Burger Brötchen";
        belag.add("Kopfsalat");
        belag.add("Tomaten");
        belag.add("Zwiebeln");
        belag.add("Käse");
    }
}