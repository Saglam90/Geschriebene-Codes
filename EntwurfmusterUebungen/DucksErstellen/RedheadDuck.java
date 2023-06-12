package DucksErstellen;

public class RedheadDuck extends Duck {
    
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display() {
        System.out.println("Ich bin eine Rotkopf Ente");
    }

}
