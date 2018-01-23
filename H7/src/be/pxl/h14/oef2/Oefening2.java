package be.pxl.h14.oef2;

public class Oefening2 {
	public static void main(String args[]) {
		int getal1 = 0, getal2 = 0;
		char bewerking = '+';
		boolean fout = false;
		int result = 0;
		//ArrayIndexOutOfBOundsException
		try {
		getal1 = Integer.parseInt(args[0]);
		getal2 = Integer.parseInt(args[1]);
		bewerking = args[2].charAt(0);
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("Te weinig argumenten, gebruik maken van default waarden voor missende argumenten.");
			System.out.println(ex.getMessage());//Geeft index waar het fault loopt
		}
		catch(NumberFormatException ex) {
			System.out.println("Argument klopt niet, we nemen default waarde");
		}
		switch (bewerking) {
		case '+':
			result = getal1 + getal2;
			break;
		case '-':
			result = getal1 - getal2;
			break;
		case '/':
			try {
			result = getal1 / getal2;
			}
			catch(ArithmeticException ex) {
				System.out.println("Kunnen niet delen door nul");
				result = 0;
			}
			break;
		case 'x':
			result = getal1 * getal2;
			break;
		default:
			fout = true;
		}
		if (!fout)
			System.out.println(getal1 + " " + bewerking + " " + getal2 + " = " + result);
		else
			System.out.println("Foute bewerking!");

	}
}
