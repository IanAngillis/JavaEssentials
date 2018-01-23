package opdrachten;

import java.util.Scanner;

public class opdracht3 {

	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + division);
			keyboard.close();
		}
		catch(RuntimeException ex) {
			System.out.println("Invalid input");
			ex.printStackTrace();
		}
		System.out.println("The end");

	}

}
