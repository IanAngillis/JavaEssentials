package be.pxl.h12.oef3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HuwelijkAppBis {

	public static void main(String[] args) {
		Persoon p1 = new Persoon("Petersen", "An", 24, 4, 1958, "Bloemweg", "5", "3500", "Hasselt");
		Persoon p2 = new Persoon("Janssen", "Dirk", 13, 7, 1954, "Bloemweg", "5", "3500", "Hasselt");
		
		LocalDate l = LocalDate.of(1987, 7, 1);
		
		while(l.getDayOfWeek() != DayOfWeek.SATURDAY) {
			l = l.plusDays(1);
		}
		
		Huwelijk huwelijk = new Huwelijk(p1, p2, l.getDayOfMonth(), l.getMonthValue(), l.getYear());
		huwelijk.printDatum(huwelijk.getHuwelijksdatum());
		System.out.println();
		System.out.println(huwelijk.getPartner1().getVoornaam().toUpperCase() + " (" + huwelijk.getPartner1().getLeeftijd() + ")" + " en " + huwelijk.getPartner2().getVoornaam().toUpperCase() + " (" + huwelijk.getPartner2().getLeeftijd() + ")" + " zijn " + huwelijk.getAantalJaarGetrouwd() + " jaar getrouwd.");
		huwelijk.printFeest();
		
	}

}
