package be.pxl.h12.oef4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VluchtApp {
	
	public static void main(String[] args) {
		
		Instant t1 = Instant.now();
		
		Scanner keyboard = new Scanner(System.in);
		String input = new String("");
		
		Vlucht [] vluchten = new Vlucht[7];
		
		vluchten[0] = new Vlucht("America", "New_York", 8, 30);
		vluchten[1] = new Vlucht("Africa", "Luanda", 8, 40);
		vluchten[2] = new Vlucht("Asia", "Beirut", 4, 10);
		vluchten[3] = new Vlucht("Asia", "Bangkok", 11, 5);
		vluchten[4] = new Vlucht("Asia", "Tokyo", 11, 20);
		vluchten[5] = new Vlucht("America", "Montreal", 7, 55);
		vluchten[6] = new Vlucht("Atlantic", "Reykjavik", 3, 25);
		
		DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Vertrekdatum en tijd : dd/MM/yyyy HH:mm");
		input = keyboard.nextLine();
		
		for(Vlucht vlucht : vluchten) {
			ZonedDateTime temp = ZonedDateTime.of(LocalDateTime.parse(input, inputFormat), ZoneId.of("Europe/Brussels"));
			
			System.out.println("Vlucht vanuit Zaventem naar " + vlucht.getStad() + " (" + vlucht.getRegio() + ")");
			System.out.println("Vertrek: " + temp.toString());
			temp = temp.plusMinutes(vlucht.getDuurMin());
			temp = temp.plusHours(vlucht.getDuurUur());
			System.out.println("Aankomst (onze tijd): " + temp.format(outputFormat));
			temp = temp.withZoneSameInstant(ZoneId.of(vlucht.getRegio() + "/" + vlucht.getStad()));
			System.out.println("Aankomst (lokale tijd): " + temp.format(outputFormat));
			System.out.println();
		}
		
		Instant t2 = Instant.now();
		System.out.println("De uitvoering van het programma heeft " + (t2.toEpochMilli() - t1.toEpochMilli()) + " miliseconden gelopen.");
		
		keyboard.close();
	}
}
