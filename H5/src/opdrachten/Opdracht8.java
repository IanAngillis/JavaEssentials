package opdrachten;

import java.time.LocalDate;
import java.time.Period;

public class Opdracht8 {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1997, 6, 27);
		LocalDate now = LocalDate.now();
		
		Period period = Period.between(birthday,now);
		
		System.out.println("Aantal dagen: " + period.getDays());
		System.out.println("Aantal maanden: " + period.getMonths());
		System.out.println("Aantal jaren: " + period.getYears());
	}

}
