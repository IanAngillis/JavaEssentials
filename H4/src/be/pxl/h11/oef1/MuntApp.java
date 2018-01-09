package be.pxl.h11.oef1;

import java.util.Random;

public class MuntApp {

	public static void main(String[] args) {
		Random rand = new Random();
		int bedrag;

		bedrag = rand.nextInt(1000);

		for (Munt m : Munt.values()) {
			int aantalMunten;

			if (bedrag == 0) {
				break;
			}

			aantalMunten = bedrag / m.getWaarde();

			if (aantalMunten != 0) {
				System.out.println(bedrag / m.getWaarde() + " munten van " + m.name());
			}

			bedrag %= m.getWaarde();
		}
	}

}
