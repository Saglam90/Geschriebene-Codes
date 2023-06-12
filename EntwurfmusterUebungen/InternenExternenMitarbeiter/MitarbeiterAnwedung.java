package InternenExternenMitarbeiter;

public class MitarbeiterAnwedung {

    public static void main(String[] args) {
        Mitarbeiter m = new GF();
        m.setName("Häuptling");
        m.display();
        m.internexternV();
        m.bereichV();
        System.out.println("***");
        Mitarbeiter m2 = new IT();
        m2.setName("Gandalf");
        m2.display();
        m2.internexternV();
        m2.bereichV();
        System.out.println("***");
        Mitarbeiter m3 = new IT();
        m3.setName("Morwen");
        m3.display();
        m3.internexternV();
        m3.bereichV();
        System.out.println("***");
        Mitarbeiter m4 = new Sachbearbeiter();
        m4.display();
        m4.internexternV();
        m4.bereichV();
        System.out.println("***");
        Mitarbeiter m5 = new DoziEx();
        m5.display();
        m5.internexternV();
        m5.bereichV();
        System.out.println("***");
        Mitarbeiter m6 = new DoziInt();
        m6.display();
        m6.internexternV();
        m6.bereichV();
        System.out.println("***");
        Mitarbeiter m7 = new Reinigung();
        m7.display();
        m7.internexternV();
        m7.bereichV();
        System.out.println("***");
    }
}
