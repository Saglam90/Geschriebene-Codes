package Fabrik_BurgerBude;

class BurgerBestellung {

    private BurgerFactory burgerFactory;

    public BurgerBestellung(BurgerFactory burgerFactory) {
        this.burgerFactory = burgerFactory;
    }

    public void aufgebenBestellung(String burgerTyp, String region) {
        Burger burger = burgerFactory.createBurger(burgerTyp, region);

        if (burger != null) {
            
            burger.prepare();
            
            burger.cook();
            
            burger.box();
            
        } else {
            System.out.println("Ungültiger Burger-Typ oder Region.");
        }
    }
}
