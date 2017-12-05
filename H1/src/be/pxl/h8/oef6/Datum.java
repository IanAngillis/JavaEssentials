package be.pxl.h8.oef6;

public class Datum {
	private int dag;
	private int maand;
	private int jaar;
	private String[] maandNamen = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	// Constructors
	public Datum() {
		this(1, 1, 2017);
	}

	public Datum(int newDag, int newMaand, int newJaar) {
		this.setDag(newDag);
		this.setMaand(newMaand);
		this.setJaar(newJaar);
	}

	// Setters
	public void setDag(int newDag) {
		this.dag = newDag;
	}

	public void setMaand(int newMaand) {

		newMaand -= 1;
		if (newMaand < 1) {
			newMaand = 0;
		}

		if (newMaand > 12) {
			newMaand = 12;
		}

		this.maand = newMaand;
	}

	public void setJaar(int newJaar) {
		this.jaar = newJaar;
	}

	// Getters
	public int getDag() {
		return this.dag;
	}

	public String getMaand() {
		return this.maandNamen[maand];
	}

	public int getJaar() {
		return this.jaar;
	}
	
	//Methodes
	public String toString() {
		return this.getDag() + " " + this.getMaand() + " " + this.getJaar() + "";
	}
}
