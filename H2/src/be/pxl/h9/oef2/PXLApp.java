package be.pxl.h9.oef2;

import java.util.Scanner;

public class PXLApp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Voornaam:");
		String voornaam = keyboard.nextLine();
		System.out.println("Naam: ");
		String naam = keyboard.nextLine();
		System.out.println("AanstellingsPercentage: ");
		int aanstellingsPercentage = keyboard.nextInt();
		System.out.println("Aantal vakken: ");
		int aantalVakken = keyboard.nextInt();
		int[] geselecteerdeVakken = new int[5];
		int keuze;

		while (aantalVakken > 5 || aantalVakken < 0) {
			System.out.println("Aantal vakken (max 5): ");
			aantalVakken = keyboard.nextInt();
		}

		String codeTabel[] = { "41TIN1100", "48TIN1130", "41TIN1140", "41TIN1160", "41TIN1240", "41TIN1290",
				"41TIN1300", "42TIN1220", "42TIN1230", "43AON3120", "43AON3130" };
		String[] naamTabel = { "Web Essentials", "Java Essentials", ".Net Essentials", "SQL Essentials", "Desktop OS",
				"Math for IT", "Programming Basics", ".Net Advanced", "Java Advanced", "Programming Expert",
				"Mobile development" };
		
		int[] stpTabel = { 7, 6, 6, 3, 6, 6, 5, 3, 3, 3, 3 };


		Leraar l = new Leraar(voornaam, naam, aanstellingsPercentage);

		for (int i = 0; i < aantalVakken; i++) {
			printVakken(codeTabel, naamTabel, stpTabel, geselecteerdeVakken);
			System.out.println("Keuze: ");
			keuze = keyboard.nextInt();
			l.voegVakToe(new Vak(codeTabel[keuze - 1], naamTabel[keuze - 1], stpTabel[keuze-1]));
			geselecteerdeVakken[i] = keuze; 
		}


		l.print();
		keyboard.close();
	}

	public static void printVakken(String[] codeTabel, String[] naamTabel, int[] stpTabel, int[] geselecteerdeVakken) {

		for (int i = 0; i < codeTabel.length; i++) {
			if(isNotSelected(i+1, geselecteerdeVakken)) {
			System.out.println("Nr" + (i + 1) + " " + codeTabel[i] + " " + naamTabel[i] + " " + stpTabel[i]);
			}
		}
	}
	
	private static boolean isNotSelected(int number, int [] geselecteerdeVakken) {
		
		for(int i = 0; i < geselecteerdeVakken.length; i++) {
			if(geselecteerdeVakken[i] == number) {
				return false;
			}
		}
		
		return true;
		
	}
}
