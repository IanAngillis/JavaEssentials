package be.pxl.project1;

import java.time.LocalDate;

public class Wijn {

	// Object variabelen
	private String naam;
	private String omschrijving;
	private String druivenras;
	private String kleur;
	private String land;
	private String regio;
	private int jaargang;
	private String serveerTip;
	private double alcoholpercentage;
	private String[] landen = { "Frankrijk", "Chili", "Italië", "Spanje" };
	private String[] kleuren = { "Wit", "Rood", "Rosé" };
	private double[] basisAdviesPrijzen = { 7.5, 8.25, 9.30, 6.45 };
	public static final double MAX_ALCOHOLPERCENTAGE = 17;

	// Constructors

	// Constructor met parameters naam, land, kleur. Standaarwaarde voor jaar is
	// huidig jaar -1
	// Standaarwaarde voor alcoholpercentage is 12,5, andere velden blijven leeg
	Wijn(String newNaam, String newKleur, String newLand) {
		this(newNaam, newKleur, newLand, (LocalDate.now().getYear() - 1), 12.5);

	}

	// Constructor met parameters naam, land, kleur, jaargang, alcoholpercentage,
	// rest van de waarden blijven leeg
	Wijn(String newNaam, String newKleur, String newLand, int jaargang, double alcoholpercentage) {
		this.setNaam(newNaam);
		this.setKleur(newKleur);
		this.setLand(newLand);
		this.setJaargang(jaargang);
		this.setAlcoholPercentage(alcoholpercentage);
		this.setOmschrijving("");
		this.setDruivenras("");
		this.setRegio("");
		this.setServeerTip("");
	}

	// Methoden
	// Vergelijkt de inputwaarde met de waardes van de gegeven array (hetzij
	// kleuren, hetzij landen)
	// en geeft true terug als de waarde in de array zit en false indien het niet in
	// de array zit.
	private boolean inputIsValid(String[] choices, String choice) {

		for (int i = 0; i < choices.length; i++) {
			if (choices[i].equals(choice)) {
				return true;
			}
		}

		return false;
	}

	public double getAdviesPrijs() {
		double adviesPrijs = getBasisAdviesPrijs();
		int ouderdom = getOuderdom();

		adviesPrijs += (ouderdom * 0.10);

		return adviesPrijs;
	}

	public String getLabel() {
		return this.getNaam() + "\n" + this.getDruivenras() + "\n" + this.getRegio() + "\n" + this.getJaargang() + "";
	}

	// Gegenereerd
	public String toString() {
		return "Wijn [naam=" + naam + ", omschrijving=" + omschrijving + ", druivenras=" + druivenras + ", kleur="
				+ kleur + ", land=" + land + ", regio=" + regio + ", jaargang=" + jaargang + ", serveertip="
				+ serveerTip + ", alcoholpercentage=" + alcoholpercentage + "]";
	}

	// Wordt gebruikt in getAdviesPrijs()
	private int getOuderdom() {

		String temp = this.getJaargang() + "";

		if (temp.charAt(temp.length() - 1) == '7') {
			return 0;
		} else {
			return LocalDate.now().getYear() - this.getJaargang();
		}
	}

	// Wordt gebruikt in getAdviesPrijs()
	private double getBasisAdviesPrijs() {
		double adviesPrijs = 0;

		if (this.getLand().equals("Onbekend")) {
			return this.getHoogsteBasisAdviesPrijs();
		}

		for (int i = 0; i < this.landen.length; i++) {
			if (this.getLand().equals(landen[i])) {
				adviesPrijs = this.basisAdviesPrijzen[i];
			}
		}

		return adviesPrijs;
	}

	// Wordt gebruikt in getAdviesPrijs()
	private double getHoogsteBasisAdviesPrijs() {
		double max = 0;

		for (double number : this.basisAdviesPrijzen) {
			if (number > max) {
				max = number;
			}
		}

		return max;
	}

	// Getters en Setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getDruivenras() {
		return druivenras;
	}

	public void setDruivenras(String druivenras) {
		this.druivenras = druivenras;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {

		if (inputIsValid(this.kleuren, kleur)) {
			this.kleur = kleur;
		} else {
			this.kleur = "Rood";
		}

	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {

		if (inputIsValid(this.landen, land)) {
			this.land = land;

		} else {
			this.land = "Onbekend";
		}

	}

	public String getRegio() {
		return regio;
	}

	public void setRegio(String regio) {
		this.regio = regio;
	}

	public int getJaargang() {
		return jaargang;
	}

	public void setJaargang(int jaargang) {

		if (jaargang < 1950) {

			this.jaargang = 1950;
		} else if (jaargang > LocalDate.now().getYear()) {

			this.jaargang = LocalDate.now().getYear();
		} else {

			this.jaargang = jaargang;
		}

	}

	public String getServeerTip() {
		return serveerTip;
	}

	public void setServeerTip(String serveertip) {
		this.serveerTip = serveertip;
	}

	public double getAlcoholPercentage() {
		return alcoholpercentage;
	}

	public void setAlcoholPercentage(double alcoholpercentage) {

		if (alcoholpercentage < 0) {
			this.alcoholpercentage = 0;
		} else if (alcoholpercentage > Wijn.MAX_ALCOHOLPERCENTAGE) {
			this.alcoholpercentage = 17;
		} else {
			this.alcoholpercentage = alcoholpercentage;
		}
	}

}
