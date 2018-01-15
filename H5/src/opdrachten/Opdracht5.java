package opdrachten;

import java.util.Scanner;
import java.time.*;

public class Opdracht5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een dag van de week in (1 - 7)");
		DayOfWeek day = DayOfWeek.values()[keyboard.nextInt()-1];
		
		System.out.println("Het is vandaag " + day);
		System.out.println("Geef het aantal dagen dat u wenst er bij te tellen: ");
		day = day.plus(keyboard.nextLong());
		System.out.println("Het is vandaag " + day);
		
		keyboard.close();
	}

}
