package BestuhlungBewirtung;

public class Eventausstatter {

    public static void main(String[] args) {
        
        System.out.println("*****");
        Bestuhlung bestuhlung = new Kabarett();
        bestuhlung = new U_Form(bestuhlung);
        System.out.println(bestuhlung.getBezeichnung() + "\nEinzelpreis: € " + bestuhlung.preis() + "\n");
        

    }
}
