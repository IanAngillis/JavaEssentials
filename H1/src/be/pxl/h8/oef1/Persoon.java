package be.pxl.h8.oef1;

public class Persoon {
	private String voornaam;
	private String naam;
	private int geboorteJaar;
	private double lengte;
	private double gewicht;
	
	public Persoon() {
		this("Onbekend", "Onbekend");
	}
	
	public Persoon(String newNaam, String newVoornaam) {
		this.setNaam(newNaam);
		this.setVoornaam(newVoornaam);
	}

	public String toString() {
		return "Deze persoon is " + this.getVoornaam() + " " + this.getNaam() + "\ngewicht \t :" + this.getGewicht()
				+ "\nLengte \t\t :" + this.getLengte() + "\ngeboortejaar \t :" + this.getGeboortejaar();
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
		if (newLengte < 2.4) {
			this.lengte = newLengte;
		} else {
			this.lengte = 2.4;
		}

	}

	public void setGewicht(double newGewicht) {
		this.gewicht = newGewicht;
	}

	public double getBMI() {
		return (this.getGewicht() / (this.getLengte() * this.getLengte()));
	}

	public String geefOmschrijving() {
		double bmi = getBMI();

		if (bmi >= 40) {
			return "morbide obesitas";
		} else if (bmi >= 30) {
			return "obesitas";
		} else if (bmi >= 25) {
			return "overgewicht";
		} else if (bmi >= 18) {
			return "normaal";
		} else {
			return "ondergewicht";
		}

	}

	public void voegVoornamenToe(String... voornamen) {
		StringBuilder temp = new StringBuilder(this.getVoornaam());

		for (int i = 0; i < voornamen.length; i++) {
			temp.append(" ");
			temp.append(voornamen[i]);
		}

		this.setVoornaam(temp.toString());
	}

	public int getLeeftijd() {
		return 2017 - this.getGeboortejaar();
	}

	public void groei() {
		setLengte(this.getLengte() + 0.01);
	}

	public void groei(int cm) {
		double m = cm / 100.0;
		setLengte(this.getLengte() + m);
	}
}
