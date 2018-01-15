package opdrachten;

import java.time.Instant;
import java.util.Scanner;

public class Opdracht4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		Instant t1 = Instant.now();
		System.out.println("Geef uw naam in: ");
		String naam = keyboard.next();
		Instant t2 = Instant.now();
		System.out.println("Het heeft " + (t2.getEpochSecond() - t1.getEpochSecond()) + " seconden geduurd om uw naam: " + naam + " in te geven.");
		
		keyboard.close();
	}
}
