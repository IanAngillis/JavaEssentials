package opdrachten;

import java.util.Scanner;

public class Opdracht1 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = new String();
		
		//Vraag een waarde aan de gebruiker en slaag het op als een String
		System.out.println("Geef een getal in:");
		input = keyboard.next();
		
		//Zet string om naar Integer object
		Integer number = new Integer(input);
		
		System.out.println("1 :" + number.intValue());
		number = number + 5; //unboxen, optellen, wrappen(autoboxen)
		System.out.println("2 :" + number.intValue());
		
		System.out.println("Aantal bits op 1: " + Integer.bitCount(number.intValue()));
		
		System.out.println("Aantal bytes: " + Integer.BYTES);
		System.out.println("Aantal bits: " + Integer.BYTES * 8);
		
		keyboard.close();
	}
}
