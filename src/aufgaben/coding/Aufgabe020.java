package aufgaben.coding;
import java.util.Random;
import java.util.Scanner;

public class Aufgabe020 {

    public static void main(String[] args) {
        zufallZahl();
    }

    public static void zufallZahl() {
        int counter = 0;
        int geheimnisZahl = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Geben Sie zwischen von 0 bis 100 ein Zahl ein: ");
            int zahl = scanner.nextInt();

            if (geheimnisZahl < zahl) {
                counter++;
                System.out.println("Bitte kleiner Zahl geben: ");
            } else if (geheimnisZahl > zahl) {
                counter++;
                System.out.println("Bitte größer Zahl geben: ");
            } else {
                counter++;
                System.out.println("Bravo! Sie wussten es bei Ihrer  " + counter + ". Vermutung");
                break;
            }
        }

    }

}



