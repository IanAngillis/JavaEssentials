package opdrachten;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Opdracht7 {

	public static void main(String[] args) {
		Instant now = Instant.now();
		
		ZonedDateTime zoned1 = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());
		ZonedDateTime zoned2 = ZonedDateTime.now(ZoneId.of("Europe/London"));
		ZonedDateTime zoned3 = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
		ZonedDateTime zoned4 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		System.out.println(zoned1);
		System.out.println(zoned2);
		System.out.println(zoned3);
		System.out.println(zoned4);
	}

}
