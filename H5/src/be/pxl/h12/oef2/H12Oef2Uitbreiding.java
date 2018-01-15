package be.pxl.h12.oef2;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class H12Oef2Uitbreiding {

	public static void main(String[] args) {
		// Aanmaken variabelen
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		Integer aantalGetallen;
		Integer minimumWaarde;
		Integer maximumWaarde;
		BigInteger [] integerTabel;
		BigInteger gemiddelde = new BigInteger("0");

		// Opvragen getallen
		System.out.println("Aantal getallen: ");
		aantalGetallen = new Integer(keyboard.nextInt());

		System.out.println("Minimumwaarde: ");
		minimumWaarde = new Integer(keyboard.nextInt());

		System.out.println("Maximumwaarde: ");
		maximumWaarde = new Integer(keyboard.nextInt());

		// Controle maximum en minimumgetallen
		if (minimumWaarde > maximumWaarde) {
			Integer temp = minimumWaarde;
			minimumWaarde = maximumWaarde;
			maximumWaarde = temp;
		}

		System.out.println("Minimumwaarde na wisseling: " + minimumWaarde);
		System.out.println("Maximumwaarde na wisseling: " + maximumWaarde);

		integerTabel = new BigInteger[aantalGetallen];

		// Tabel vullen met random getallen
		for (int i = 0; i < integerTabel.length; i++) {
			int random = rand.nextInt(maximumWaarde - minimumWaarde + 1) + minimumWaarde;
			integerTabel[i] = new BigInteger(random + "");
			integerTabel[i].multiply(new BigInteger("999999999999"));
		}

		for (BigInteger i : integerTabel) {
			System.out.println(i);
			gemiddelde = gemiddelde.add(i);
		}

		System.out.printf("Het gemiddelde is %.2f", gemiddelde.divide(new BigInteger(aantalGetallen + "")));

		keyboard.close();
	}

}
