package be.pxl.h14.oef1;

import java.time.*;
import java.time.format.*;

public class FormatterApp {
	
	public static void main(String[] args) {
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime dt = LocalDateTime.now();
		
		try {
			dt = LocalDateTime.parse("03/08/1998 13:45:23", myFormatter);

		}
		catch(DateTimeParseException ex){
			System.out.println("Foute datum");
			ex.printStackTrace();
		}
		
		System.out.println(myFormatter.format(dt));
		System.out.println(isoFormatter.format(dt));
	}
}
