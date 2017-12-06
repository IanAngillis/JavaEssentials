package be.pxl.h9.oef1;

public class Adres {
	// Instantie- en klassevariabelen
	private String straat;
	private String huisNummer;
	private Gemeente gemeente;

	// Constructor
	Adres(String newStraat, String newHuisNummer, String newPostcode, String newGemeenteNaam){
		this.setStraat(newStraat);
		this.setHuisNummer(newHuisNummer);
		this.gemeente = new Gemeente(newPostcode, newGemeenteNaam);
		
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getHuisNummer() {
		return huisNummer;
	}

	public void setHuisNummer(String huisNummer) {
		this.huisNummer = huisNummer;
	}

	public Gemeente getGemeente() {
		return this.gemeente;
	}

	
	public String toString() {
		return this.getStraat() + " " + this.getHuisNummer() + "\n" + this.getGemeente().toString() + "";
	}
	
	
}
