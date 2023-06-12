package Fabrik_BurgerBude;

class BurgerFactory {
    public Burger createBurger(String type, String region) {
        if (region.equals("Germany")) {
            if (type.equals("hamburger")) {
                return new Hamburger_German();
            } else if (type.equals("cheeseburger")) {
                return new Cheeseburger_German();
            } else if (type.equals("chickenburger")) {
                return new Chickenburger_German();
            } else {
                return null;
            }
        } else if (region.equals("India")) {
            if (type.equals("hamburger")) {
                return new Hamburger_India();
            } else if (type.equals("cheeseburger")) {
                return new Cheeseburger_India();
            } else if (type.equals("chickenburger")) {
                return new Chickenburger_India();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}