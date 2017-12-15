package be.pxl.h10.oef3;

import be.pxl.h10.oef1.Persoon;

public class Sporter extends Persoon {

	private String beoefendeSport;
	private static int aantalSporters = 0;
	
	Sporter(String newVoornaam, String newAchternaam) {
		this(newVoornaam, newAchternaam, "onbekend");
	}
	
	Sporter(String newVoornaam, String newAchternaam, String sport) {
		super(newVoornaam, newAchternaam);
		this.setBeoefendeSport(sport);
		aantalSporters++;
		
	}

	public String getBeoefendeSport() {
		return beoefendeSport;
	}

	public void setBeoefendeSport(String sport) {
		this.beoefendeSport = sport;
	}
	
	public static int getAantalSporters() {
		return aantalSporters;
	}
	
	public void print() {
		super.Print();
		System.out.println(this.getBeoefendeSport());
	}
	
}
