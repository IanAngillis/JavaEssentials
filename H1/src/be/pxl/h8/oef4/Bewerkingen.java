package be.pxl.h8.oef4;

import java.util.Scanner;

public class Bewerkingen {

	public void trekAf(double getal1, double getal2) {
		char teken;
		double uitkomst;

		if (getal2 < 0) {
			teken = '+';
			uitkomst = getal1 + getal2;
		} else {
			teken = '-';
			uitkomst = getal1 - getal2;
		}

		System.out.println(getal1 + " " + teken + " " + getal2 + " = " + uitkomst);

	}

	public void trekAf(int getal1, int getal2) {

		char teken;
		int uitkomst;

		if (getal2 < 0) {
			teken = '+';
			uitkomst = getal1 + getal2;
		} else {
			teken = '-';
			uitkomst = getal1 - getal2;
		}

		System.out.println(getal1 + " " + teken + " " + getal2 + " = " + uitkomst);
	}

	public void telOp(double getal1, double getal2) {
		char teken;
		double uitkomst;

		if (getal2 < 0) {
			teken = '-';
			uitkomst = getal1 + getal2;
		} else {
			teken = '+';
			uitkomst = getal1 - getal2;
		}

		System.out.println(getal1 + " " + teken + " " + getal2 + " = " + uitkomst);
	}

	public void telOp(double... telopArray) {
		String teken;
		double som = 0;
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < telopArray.length; i++) {
			som += telopArray[i];
			if (i == 0) {
				temp.append(telopArray[i]);
			} else {
				if (telopArray[i] > 0) {
					teken = " + ";
					temp.append(teken + telopArray[i]);
				} else {
					teken = " - ";
					temp.append(teken + (telopArray[i] * -1));
				}
			}

		}

		System.out.println(temp.toString() + " = " + som);

	}
	
	public void deel(int getal1, int getal2) {
		
		double quotient = (double) getal1 / getal2;
		
		System.out.printf("%d + %d = %.2f\n", getal1, getal2, quotient);
	}
	
	public void faculteit(int getal) {
		Scanner keyboard = new Scanner(System.in);
		
		while(getal <= 0) {
			System.out.println("We kunnen geen faculteit van een negatief getal berekenen. Geef een positief getal in: ");
			getal = keyboard.nextInt();
			
		}
		
		
		long temp = 1;
		
		for(int i = 0; i < getal; i++) {
			temp *= (getal - i);
		}
		
		System.out.println("Faculteit van " + getal + ": " + temp);
	}
}
