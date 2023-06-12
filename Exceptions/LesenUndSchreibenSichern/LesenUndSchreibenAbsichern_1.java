package lesenUndSchreibenSichern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class LesenUndSchreibenAbsichern_1 {

    public static void main(String[] args) throws IOException {
        FileWriter f1;
        try {
            f1 = new FileWriter("C:\\Users\\yesaglam\\Desktop\\Saglam\\test.txt");
            f1.write("Hallo AE'ler");
            f1.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei nicht gefunden");
        } catch (IOException io) {
            System.out.println("Schreiben nicht erfolgreich. Möglicherweise steht das Eingabegerät nicht mehr"
                    + "zur Verfügung");
        }
        FileReader leser = null;
        try {
            leser = new FileReader("C:\\Users\\yesaglam\\Desktop\\Saglam\\test.txt");
            for (int c = 0; (c = leser.read()) != -1;) {
                System.out.print((char) c);
            }
            System.out.println("");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei nicht vorhanden");
        }
        try {
        leser.close();
        } catch (NullPointerException np) {
            System.out.println("Fehler beim Schließen");
        }
    }
}
