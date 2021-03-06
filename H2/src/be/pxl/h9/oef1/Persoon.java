package be.pxl.h9.oef1;

public class Persoon {
	//Instantie- en klassevariabelen
	private String naam;
	private String voornaam;
	private Datum geboortedatum;
	private Adres adres;
	
	//Constructor
	Persoon(String newNaam, String newVoornaam, int newDag, int newMaand, int newJaar, String newStraat, String newHuisnummer, String newPostcode, String newGemeenteNaam){
		this.setNaam(newNaam);
		this.setVoornaam(newVoornaam);
		this.geboortedatum = new Datum(newDag, newMaand, newJaar);
		this.adres = new Adres(newStraat, newHuisnummer, newPostcode, newGemeenteNaam);
	}
	
	//Getters en Setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Datum getGeboortedatum() {
		return geboortedatum;
	}
	
	//Methoden
	public void voegVoornamenToe(String... voornamen) {
		StringBuilder temp = new StringBuilder(this.getVoornaam());

		for (int i = 0; i < voornamen.length; i++) {
			temp.append(" ");
			temp.append(voornamen[i]);
		}

		this.setVoornaam(temp.toString());
	}
	
	public String toString() {
		return this.getVoornaam() + " " + this.getNaam() + "\n" + this.getAdres().toString();
	}
	
	
}
