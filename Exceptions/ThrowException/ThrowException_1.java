package throwException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException_1 {

    public static void main(String[] args) {
        Scanner eing = new Scanner(System.in);
        System.out.println("Ihr Alter bitte");
        try {
            int alter = eing.nextInt();
            System.out.println("Blasser Typ: Ich bin "+ alter);
            if (alter < 18) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("Tür steher: Kommen Sie herein");
            }
        } catch (InputMismatchException im) {
            System.out.println("Tür steher: Sorry, dein Typ ist hier nicht gefragt");
        } catch (IllegalArgumentException ia) {
            System.out.println("Tür steher: Geh heim Bub");
        }
    }
}
