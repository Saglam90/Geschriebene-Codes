package DucksErstellen;

public class MallardDuck extends Duck {
    
    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display() {
        System.out.println("Ich bin eine echte Stockente.");
    }
}
