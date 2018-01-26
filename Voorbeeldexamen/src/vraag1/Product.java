package vraag1;

public abstract class Product {
	// Instantie variabelen
	private int productNummer;
	private String merk;
	private String naam;
	private int volume;
	private double prijs; // Prijs exclusief btw

	// Constructor
	public Product(int productNummer, String merk, String naam, int volume, double prijs) {
		this.setProductNummer(productNummer);
		this.setMerk(merk);
		this.setNaam(naam);
		this.setVolume(volume);
		this.setPrijs(prijs);
	}

	// Methoden
	public String getProductCode() {
		StringBuilder temp = new StringBuilder("");

		temp.append(this.getMerk().substring(0, 3));
		temp.append(this.getNaam().substring(0, 3));
		temp.append(this.getVolume());

		for (int i = 0; i < temp.length(); i++) {

			if (temp.charAt(i) == ' ') {
				temp.setCharAt(i, '_');
			}
		}

		return temp.toString().toUpperCase();
	}

	@Override
	public String toString() {
		return String.format("%-5dMerk: %-20sNaam:%-25sVolume:%5dml Prijs: %2.2f Code: %-12s", this.getProductNummer(), this.getMerk(), this.getNaam(), this.getVolume(), this.getPrijs(), this.getProductCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj instanceof Product) {

			Product temp = (Product) obj;

			if (!this.getMerk().equals(temp.getMerk())) { // Indien merk niet gelijk is
				return false;
			} else if (!this.getNaam().equals(temp.getNaam())) {// Als naam niet gelijk is
				return false;
			} else if (this.getVolume() != temp.getVolume()) { // Als volume niet gelijk is
				return false;
			} else {
				return true;
			}

		}

		return false;
	}

	// Getters en Setters
	public int getProductNummer() {
		return productNummer;
	}

	public void setProductNummer(int productNummer) {
		this.productNummer = productNummer;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
}
