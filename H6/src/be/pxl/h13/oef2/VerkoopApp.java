package be.pxl.h13.oef2;

import java.time.LocalDate;

public class VerkoopApp {

	public static void main(String[] args) {
		TeVerkopenBouwGrond g = new TeVerkopenBouwGrond("12ER", 12.4, "Open bebouwing");
		g.setBouwVoorschrift("Open Bebouwing");
		g.wijsEenNotarisToe("Dirk Peeters", LocalDate.of(2016, 12, 7));
		g.doeEenBod(150000, LocalDate.of(2016, 12, 23));
		System.out.println();
		g.doeEenBod(175000, LocalDate.of(2017, 1, 17));
		g.doeEenBod(40000, LocalDate.of(2017, 1, 18));
		
	}

}
