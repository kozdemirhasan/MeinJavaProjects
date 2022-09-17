package aufgaben.coding.aufgabe019;
import java.util.Scanner;

public class Aufgabe019 {
    public static void main(String[] args) {
        summe();

    }

    public static void summe() {
        int summe = 0;
        int zahl;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Geben Sie bitte ein Zahl: ");
            zahl = scanner.nextInt();
            if (zahl == 0) {
                System.out.println("Program wird beended!");
                System.exit(0);
                break;
            } else {
                summe = summe + zahl;
                System.out.println("Summe: " + summe);

            }
        }

    }
}
