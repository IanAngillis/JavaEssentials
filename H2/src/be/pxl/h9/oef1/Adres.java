package be.pxl.h9.oef1;

public class Adres {
	//Instantie- en klassevariabelen
	private String straat;
	private String huisNummer;
	private Gemeente gemeente;
	
	//Constructor
	Adres(String newStraat, String newHuisNummer, String newPostcode, String newGemeente){
		Gemeente gemeente = new Gemeente(newPostcode, newGemeente);
	}
}
