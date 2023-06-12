package DucksErstellen;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
        Duck readhead = new RedheadDuck();
        readhead.display();
        readhead.setQuackBehavior(new Squeak());
        readhead.performQuack();
        readhead.setFlyBehavior(new FlyWithWings());
        readhead.performFly();
    }
}
