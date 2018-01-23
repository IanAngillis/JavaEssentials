package opdrachten;

import java.util.Scanner;

public class opdracht2 {

	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + division);
			keyboard.close();
		}
		catch(NumberFormatException | ArithmeticException ex) {
			System.out.println("Invalid number");
			ex.printStackTrace();
		}
		System.out.println("The end");

	}

}
