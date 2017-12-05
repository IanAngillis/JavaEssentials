package be.pxl.h8.oef6;

import java.util.Scanner;

public class ScoutsKalendarApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int dag;
		int maand;
		int jaar;
		String activiteit;
		int index = 0;
		Datum[] kalender = new Datum[10];
		String[] activiteiten = new String[10];

		for (int i = 0; i < kalender.length; i++) {

			kalender[i] = new Datum();
		}

		System.out.println("geef een maandnr in: ");
		maand = keyboard.nextInt();

		System.out.println("Geef een jaar in: ");
		jaar = keyboard.nextInt();

		System.out.println("Geef een dag in: ");
		dag = keyboard.nextInt();

		// Waarden in array steken
		while (dag != 0 && index < 10) {

			keyboard.nextLine();
			System.out.println("Geef de activiteit in: ");
			activiteit = keyboard.nextLine();

			kalender[index].setDag(dag);
			kalender[index].setMaand(maand);
			kalender[index].setJaar(jaar);
			activiteiten[index] = activiteit;

			index++;

			System.out.println("Geef een dag in: ");
			dag = keyboard.nextInt();

		}

		System.out.println("**** Kalender voor " + kalender[0].getMaand() + " " + jaar + " ****");

		for (int i = 0; i < index; i++) {
			System.out.println(kalender[i].getDag() + " " + kalender[i].getMaand() + " " + kalender[i].getJaar() + "\t"
					+ activiteiten[i]);
		}
		keyboard.close();
	}

}
