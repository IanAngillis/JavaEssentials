package be.pxl.h9.oef2;

public class Leraar {
	private String naam;
	private String voornaam;
	private int aanstellingsPercentage;
	private int aantalVakken;
	private Vak[] vakken = new Vak[5];
	private final int MAXAANTALVAKKEN = 5;

	// Constructors
	Leraar(String newVoornaam, String newAchternaam, int newAanstellingsPercentage) {
		this.setVoornaam(newVoornaam);
		this.setNaam(newAchternaam);
		this.setAanstellingsPercentage(newAanstellingsPercentage);
	}

	// Getters and Setters
	
	public Vak getVak(int i) {
		return vakken[i];
	}
	
	public String getNaam() {
		return this.voornaam + " " + this.naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public int getAanstellingsPercentage() {
		return aanstellingsPercentage;
	}

	public void setAanstellingsPercentage(int aanstellingsPercentage) {

		if (aanstellingsPercentage > 100) {
			aanstellingsPercentage = 100;
		}

		if (aanstellingsPercentage % 10 != 0) {
			aanstellingsPercentage += correction(aanstellingsPercentage);
		}

		this.aanstellingsPercentage = aanstellingsPercentage;
	}

	private int correction(int number) {
		String numberString = number + "";
		char lastNumber;
		int correction;

		lastNumber = numberString.charAt(numberString.length() - 1);
		correction = getCorrection(lastNumber);

		return correction;
	}

	private int getCorrection(char character) {
		switch (character) {
		case '1':
			return -1;
		case '2':
			return -2;
		case '3':
			return -3;
		case '4':
			return -4;
		case '5':
			return 5;
		case '6':
			return 4;
		case '7':
			return 3;
		case '8':
			return 2;
		case '9':
			return 1;
		}

		return 0;
	}

	public int getAantalVakken() {
		return aantalVakken;
	}

	public int getAANTALVAKKEN() {
		return MAXAANTALVAKKEN;
	}

	public void voegVakToe(Vak newVak) {
		vakken[aantalVakken] = newVak;
		aantalVakken++;
	}
	
	public void print() {
		System.out.println("Leraar " + this.getNaam() + " is aangesteld voor " + this.getAanstellingsPercentage() + "%");
		System.out.println("De volgende vakken behoren tot het takenpakker:");
		for(int i = 0; i < this.aantalVakken; i++) {
			System.out.println(this.getVak(i).getCode() + "   " + this.getVak(i).getNaam() + "   "  + this.getVak(i).getAantalSTP());
		}
	}
	
}
