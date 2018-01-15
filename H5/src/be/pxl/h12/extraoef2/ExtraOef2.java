package be.pxl.h12.extraoef2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExtraOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = new String("");

		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy, D");

		System.out.println("Geef datum (MM/dd): ");
		input = keyboard.nextLine();

		while (!input.equals("einde")) {
			
			input = input.trim();
			input = input + " ";

			while (input.length() >= 4) {
				LocalDate local = LocalDate.parse(input.substring(0, 5) + "/" + LocalDate.now().getYear(), inputFormat);
				System.out.print(local.format(outputFormat));
				System.out.println(" dagen in het jaar.");
				input = input.substring(6);
			}
			
			System.out.println("Geef datum (MM/dd): ");
			input = keyboard.nextLine();
		}
		keyboard.close();
	}

}
