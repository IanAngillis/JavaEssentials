package be.pxl.h12.extraoef3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class H12ExtraOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int beginjaar;
		int eindjaar;
		
		System.out.println("Beginjaar: ");
		beginjaar = keyboard.nextInt();
		
		System.out.println("Eindjaar: ");
		eindjaar = keyboard.nextInt();
		
		LocalDate datum = LocalDate.of(beginjaar, 1, 13);
		
		System.out.println("Lijst van vrijdag de 13de in het jaar " + beginjaar + " tot en met het jaar " + eindjaar);
		
		while(datum.getYear() < eindjaar + 1) {
			
			if(datum.getDayOfWeek() == DayOfWeek.FRIDAY) {
				System.out.println(datum.getDayOfMonth() + " " + datum.getMonth().toString().toLowerCase().substring(0, 3) + " " + datum.getYear());
			}
			
			datum = datum.plusMonths(1);
		}
		
		
		
		keyboard.close();
	}

}
