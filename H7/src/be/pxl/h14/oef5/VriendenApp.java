package be.pxl.h14.oef5;

import java.util.Scanner;

public class VriendenApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String naam = new String("");
		String inputData = new String("");
		String[] list;
		Vriendengroep vriendengroep = new Vriendengroep();

		System.out.println("Naam: ");
		naam = keyboard.nextLine();

		while (!naam.toUpperCase().equals("STOP")) {

			System.out.println("Geef geboortedatum in dag maand jaar: ");
			inputData = keyboard.nextLine();

			list = inputData.split(" ");

			try {
				vriendengroep.voegVriendToe(new Persoon(naam, Integer.parseInt(list[0]), Integer.parseInt(list[1]),
						Integer.parseInt(list[2])));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Naam: ");
			naam = keyboard.nextLine();
		}

		System.out.println(vriendengroep.toString());

		System.out.println("Wil je vrienden verwijderen? j/n");
		inputData = keyboard.nextLine();

		while (!inputData.toUpperCase().equals("N")) {

			System.out.println("Geef de naam van de vriend die je wil verwijderen");
			System.out.println("Naam: ");
			naam = keyboard.nextLine();

			try {
				vriendengroep.verwijderVriend(naam);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Wil je vrienden verwijderen? j/n");
			inputData = keyboard.nextLine();
		}

		if (!vriendengroep.arrayIsEmpty()) {
			System.out.println(vriendengroep.toString());
		}

		keyboard.close();
	}

}
