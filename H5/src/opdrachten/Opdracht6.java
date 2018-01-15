package opdrachten;

import java.time.LocalDate;

public class Opdracht6 {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1997, 6, 27);
		
		System.out.println(birthday.getDayOfYear());
		System.out.println(birthday.getDayOfWeek());
		System.out.println(birthday.isLeapYear() ? "Schrikkeljaar" : "Geen schrikkeljaar");
		
	}

}
