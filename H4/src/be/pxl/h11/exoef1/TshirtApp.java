package be.pxl.h11.exoef1;

import java.util.Scanner;

public class TshirtApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String naam = new String("");
		String kleur = new String("");
		TShirt[] shirtList = new TShirt[TshirtSize.values().length * Kleur.values().length];
		int shirtIndex = 0;
		int borstomtrek;
		int aantalGewensteTshirts;
		TshirtSize tsize;
		Kleur tkleur;

		for (int i = 0; i < Kleur.values().length; i++) {

			for (int j = 0; j < TshirtSize.values().length; j++) {
				shirtList[shirtIndex] = new TShirt(TshirtSize.values()[j], Kleur.values()[i]);
				shirtIndex++;
			}
		}

		System.out.println("Geef naam:");
		naam = keyboard.nextLine();

		while (!naam.equals("stop") && !naam.equals("Stop")) {

			System.out.println("Uw borstomtrek: ");
			borstomtrek = keyboard.nextInt();
			keyboard.nextLine();

			printJuisteMaat(borstomtrek);

			tsize = TshirtSize.getSize(borstomtrek);

			System.out.println("Gewenste kleur (" + Kleur.ROOD.name() + "/" + Kleur.GROEN.name() + "/"
					+ Kleur.BLAUW.name() + "/" + Kleur.WIT.name() + "): ");// enum opvragen
			kleur = keyboard.nextLine().toUpperCase();

			while (!inputIsValid(kleur)) {
				System.out.println("Gewenste kleur (" + Kleur.ROOD.name() + "/" + Kleur.GROEN.name() + "/"
						+ Kleur.BLAUW.name() + "/" + Kleur.WIT.name() + "): ");
				kleur = keyboard.nextLine().toUpperCase();
			}

			tkleur = Kleur.getColor(kleur);

			System.out.println("Aantal Tshirts: ");
			aantalGewensteTshirts = keyboard.nextInt();
			keyboard.nextLine();

			voegTshirtsToe(shirtList, tsize, tkleur, aantalGewensteTshirts);

			System.out.println("Geef naam:");
			naam = keyboard.nextLine();
		}

		printShirtList(shirtList);
		System.out.println();
		System.out.println("De kleur " + getMeestBesteldeKleur(shirtList).name() + " werd het meeste besteld.");
		System.out.println("De maat " + getMinstBesteldeMaat(shirtList).name() + " werd het minst besteld.");
		keyboard.close();
	}

	public static void printShirtList(TShirt[] shirtList) {
		int index = 0;
		String aantal;
		System.out.print("          ");

		for (int i = 0; i < TshirtSize.values().length; i++) {
			System.out.printf("%5s", TshirtSize.values()[i].getVerkorteNotatie());
		}

		System.out.println();

		for (int i = 0; i < Kleur.values().length; i++) {
			System.out.printf("%10s", Kleur.values()[i].name());

			for (int j = 0; j < TshirtSize.values().length; j++) {
				aantal = shirtList[index].getAantalBesteld() + "";
				System.out.printf("%5s", aantal);
				index++;
			}

			System.out.println();
		}
	}

	public static void voegTshirtsToe(TShirt[] shirtList, TshirtSize size, Kleur kleur, int aantal) {

		for (TShirt t : shirtList) {

			if (t.getKleur().ordinal() == kleur.ordinal() && t.getMaat().ordinal() == size.ordinal()) {
				t.setAantalBesteld(t.getAantalBesteld() + aantal);
			}
		}
	}

	public static boolean inputIsValid(String inputkleur) {
		String[] kleuren = { "ROOD", "GROEN", "BLAUW", "WIT" };// enum gebruiken

		for (String kleur : kleuren) {
			if (kleur.equals(inputkleur)) {
				return true;
			}
		}

		return false;

	}

	public static void printJuisteMaat(int borstomtrek) {

		for (TshirtSize t : TshirtSize.values()) {
			if (borstomtrek <= t.getMaximaleBorstmtrek()) {
				System.out.println("Maat: " + t.getVerkorteNotatie());
				return;
			}
		}
		System.out.println("Maat: " + TshirtSize.values()[TshirtSize.values().length - 1].getVerkorteNotatie());
		return;
	}

	public static Kleur getMeestBesteldeKleur(TShirt[] shirtList) {
		int aantalShirts = 0;
		Kleur meesteKleur = null;
		Kleur currentKleur = null;
		int meestBestelde = -1;

		for (int i = 0; i < Kleur.values().length; i++) {
			currentKleur = Kleur.values()[i];

			for (TShirt t : shirtList) {

				if (currentKleur.name().equals(t.getKleur().name())) {
					aantalShirts += t.getAantalBesteld();
				}

			}

			if (aantalShirts > meestBestelde) {
				meesteKleur = currentKleur;
				meestBestelde = aantalShirts;
			}

			aantalShirts = 0;

		}

		if (meesteKleur == null) {
			meesteKleur = Kleur.ROOD;
		}

		return meesteKleur;

	}

	public static TshirtSize getMinstBesteldeMaat(TShirt[] shirtList) {
		int aantalShirts = 0;
		TshirtSize minsteSize = null;
		TshirtSize currentSize = null;
		int minstBestelde = 0;

		for (int i = 0; i < TshirtSize.values().length; i++) {
			currentSize = TshirtSize.values()[i];

			for (TShirt t : shirtList) {

				if (currentSize.name().equals(t.getMaat().name())) {
					aantalShirts += t.getAantalBesteld();
				}

			}

			if (aantalShirts > 0) {
				minstBestelde = aantalShirts;
			}
			
			if ((aantalShirts <= minstBestelde) && aantalShirts != 0) {
				minsteSize = currentSize;
				minstBestelde = aantalShirts;
			}

			aantalShirts = 0;

		}

		if (minsteSize == null) {
			minsteSize = TshirtSize.LARGE;
		}

		return minsteSize;
	}

}
