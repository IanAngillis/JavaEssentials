package be.pxl.h10.oef2;

public abstract class Reis {
	private String bestemming;
	private double prijs;
	private static final double MINPRICE = 5;
	
	public void print() {
		System.out.printf("Reis met bestemming %s kost %.2f euro. \n", this.getBestemming(), this.getPrijs());	}

	Reis(String bestemming) {
		this(bestemming, MINPRICE);
	}

	Reis(String bestemming, double prijs) {
		this.setBestemming(bestemming);
		this.setPrijs(prijs);
	}

	public String getBestemming() {
		return bestemming;
	}

	public void setBestemming(String bestemming) {
		while(isDigit(bestemming.charAt(0))) {
			bestemming = bestemming.substring(1);
		}

		this.bestemming = bestemming;
	}

	private boolean isDigit(char character) {
		switch (character) {
		case '0':
			return true;
		case '1':
			return true;
		case '2':
			return true;
		case '3':
			return true;
		case '4':
			return true;
		case '5':
			return true;
		case '6':
			return true;
		case '7':
			return true;
		case '8':
			return true;
		case '9':
			return true;
		}

		return false;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		if (prijs < MINPRICE) {
			prijs = MINPRICE;
		}

		this.prijs = prijs;
	}

	public static double getMinprice() {
		return MINPRICE;
	}

}
