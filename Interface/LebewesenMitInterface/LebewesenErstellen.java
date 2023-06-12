package LebewesenMitInterface;

public class LebewesenErstellen {

    public static void main(String[] args) {

        Lebewesen[] hagebuttentee = new Lebewesen[7];
        hagebuttentee[0] = new Mensch("Yunus", "geht", "redet", "Saglam", "Zocken");
        hagebuttentee[1] = new Mensch("Hugo", "hüpft", "redet", "Wagner", "lesen");
        hagebuttentee[2] = new Katze("Mietze", "schleicht", "schnurrt", "Perser", "Freigänger");
        hagebuttentee[3] = new Hund("Wautzi", "rennt", "bellt", "Pudel", 4711);
        hagebuttentee[4] = new Huhn("Miranda", "torkelt rum", "fiepst", "gemeine Waldhenne", "Freilandhaltung");
        hagebuttentee[5] = new Kuh("Milka", "hängt so rum", "ritschratsch, wenn das Papier aufreißt",
                "Werbeikone", "lila");
        hagebuttentee[6] = new Kuh("Isabella", "trödelt gemütlich", "muht", "wilde Steppenkuh", "schwarz");

          for (Lebewesen x : hagebuttentee) {
              String ichBin;
              if (x instanceof Mensch) {
                  x.setIchBin("ein Mensch");
              } else if (x instanceof Katze) {
                  x.setIchBin("ein Katze");
              } else if (x instanceof Hund) {
                  x.setIchBin(" ein Hund");
              } else if (x instanceof Huhn) {
                  x.setIchBin(" ein Federvieh");
              } else {
                  x.setIchBin("eine Kuh");
              }
          }
        System.out.println("*******************Es lebt**********************");
        for (Lebewesen x : hagebuttentee) {
            System.out.println(x + " ");
            System.out.println("**************************************************************");
        }
    }
}
