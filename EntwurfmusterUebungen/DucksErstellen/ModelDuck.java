package DucksErstellen;

public class ModelDuck extends Duck {
    
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    
    public void display() {
        System.out.println("Ich bin eine Modellente");
    }
}
