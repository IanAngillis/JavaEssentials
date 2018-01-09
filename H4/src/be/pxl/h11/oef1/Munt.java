package be.pxl.h11.oef1;

public enum Munt {
	EURO_2(200),
	EURO_1(100),
	EUROCENT_50(50),
	EUROCENT_20(20),
	EUROCENT_10(10),
	EUROCENT_5(5),
	EUROCENT_2(2),
	EUROCENT_1(1);
	
	private int eurocent;
	
	private Munt(int eurocent) {
		this.eurocent = eurocent;
	}
	
	public int getWaarde() {
		return this.eurocent;
	}
	
	public String toString() {
		return this.ordinal() + " " + this.name() + " waarde: " + this.getWaarde();
	}
}
