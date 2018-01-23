package be.pxl.h14.oef3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Oefening3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate datum = null;
		boolean dateIsCorrect = false;

		while (!dateIsCorrect) {
			try {
				datum = LocalDate.parse(keyboard.next(), myFormatter);
				dateIsCorrect = true;
			} catch (DateTimeParseException e) {
				System.out.println("Foute ingave");
			}
		}

		try {
			System.out.println(datum.format(myFormatter));
		} catch (NullPointerException e) {
			System.out.println("Geen datum");
		}

		keyboard.close();
	}

}
