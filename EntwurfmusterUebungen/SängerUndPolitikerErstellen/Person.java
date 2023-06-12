package SängerUndPolitikerErstellen;

public abstract class Person {
    
    SingMethoden singMethoden;
    DenkMethoden denkMethoden;

    public Person() {
    }
    
    public void denkweise() {
        denkMethoden.denken();
    }
    
    public void singweise() {
        singMethoden.singen();
    }
}
