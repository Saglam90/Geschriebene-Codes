package Fabrik_BurgerBude;

class Hamburger extends Burger {
    public Hamburger() {
        name = "Hamburger";
        fleisch = "Fleischpatty";
        broetchen = "Burgerbrötchen";
        belag.add("Kopfsalat");
        belag.add("Tomaten");
        belag.add("Zwiebeln");
    }
}