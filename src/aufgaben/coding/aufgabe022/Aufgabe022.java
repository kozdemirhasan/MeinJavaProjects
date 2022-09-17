package aufgaben.coding.aufgabe022;

import java.util.Scanner;

public class Aufgabe022 {

	public static void main(String[] args) {

		double[] array = new double[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + ". element von ArrayList geben Sie:");
			array[i] = sc.nextDouble();
		}

		// rechnen
		double summe = 0.0;
		for (int i = 0; i < array.length; i++) {
			summe += array[i];
		}

		System.out.println("Summe: " + summe);

	}

}
