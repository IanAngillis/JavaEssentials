package be.pxl.h8.oef4;

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
		
	}
}
