package be.pxl.h14.oef4;

public class Datum {
	private int dag;
	private int maand;
	private int jaar;
	private String[] maandNamen = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	// Constructors
	public Datum() throws DatumException {
		this(1, 1, 2017);
	}

	public Datum(int newDag, int newMaand, int newJaar) throws DatumException {
		this.setDag(newDag);
		this.setMaand(newMaand);
		this.setJaar(newJaar);
	}

	// Setters
	public void setDag(int newDag) {
		this.dag = newDag;
	}

	public void setMaand(int newMaand) throws DatumException {

		newMaand -= 1;
		if (newMaand < 0) {
			throw new DatumException("Waarde kleiner dan 1");
		}

		if (newMaand > 12) {
			throw new DatumException("Waarde groter dan 12");
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

	// Methodes
	public String toString() {
		return this.getDag() + " " + this.getMaand() + " " + this.getJaar() + "";
	}
}
