package SängerUndPolitikerErstellen;

public class SängUndPoltErstellen {

    public static void main(String[] args) {
        Person sänger = new Sänger();
        sänger.singweise();
        sänger.denkweise();
        
        System.out.println("*********");
        
        Person politiker = new Politiker();
        politiker.singweise();
        politiker.denkweise();
    }
}
