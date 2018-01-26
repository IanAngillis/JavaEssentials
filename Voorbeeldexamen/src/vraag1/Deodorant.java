package vraag1;

public class Deodorant extends Product {
	// Instance variabelen
	private DeoType soort;

	//Constructor
	public Deodorant(int productNummer, String merk, String naam, int volume, double prijs, DeoType soort) {
		super(productNummer, merk, naam, volume, prijs);
		this.setSoort(soort);
	}
	
	//Methoden
	@Override
	public String toString() {
		return super.toString() + " " + this.getSoort().name();
	}
	
	//Getters en setters
	public DeoType getSoort() {
		return soort;
	}

	public void setSoort(DeoType soort) {
		this.soort = soort;
	}
}
