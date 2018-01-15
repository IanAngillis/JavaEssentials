package opdrachten;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Opdracht9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DateTimeFormatter myFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String input = new String("");
		
		System.out.println("Geef een datum in (DD/MM/YYYY): ");
		input = keyboard.nextLine();
		
		LocalDate date = LocalDate.parse(input, myFormatter1);
		
		System.out.println(date);
		
		keyboard.close();
	}

}
