package be.pxl.h8.oef1;

public class Persoon {
	private String voornaam;
	private String naam;
	private int geboorteJaar;
	private double lengte;
	private double gewicht;

	public String toString() {
		return "Deze persoon is " + this.getVoornaam() + " " + this.getNaam() + "\n gewicht \t :" + this.getGewicht()
				+ "\n Lengte \t : " + this.getLengte() + "\ngeboortejaar \t :" + this.getGeboortejaar();
	}

	// Getters
	public int getGeboortejaar() {
		return this.geboorteJaar;
	}
	
	public String getVoornaam() {
		return this.voornaam;
	}

	public String getNaam() {
		return this.naam;
	}

	public double getLengte() {
		return this.lengte;
	}

	public double getGewicht() {
		return this.gewicht;
	}

	// Setters
	public void setGeboortejaar(int newGeboortejaar) {
		this.geboorteJaar = newGeboortejaar;
	}
	
	public void setVoornaam(String newVoornaam) {
		this.voornaam = newVoornaam;
	}

	public void setNaam(String newNaam) {
		this.naam = newNaam;
	}

	public void setLengte(double newLengte) {
		this.lengte = newLengte;
	}

	public void setGewicht(double newGewicht) {
		this.gewicht = newGewicht;
	}
}
