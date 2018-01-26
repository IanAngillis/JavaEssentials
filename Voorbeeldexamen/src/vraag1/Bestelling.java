package vraag1;

public class Bestelling implements Berekenbaar {
	// Instance variabelen
	private Product[] bestelling = new Product[100];

	// Klasse variabelen
	private static int productNummer = 1000;

	// Constructor
	public Bestelling() {

	}

	// Methodes
	public void voegProductToe(Product product) {

		if (productAlreadyInBestelling(product)) {
			System.out.println("Het product is reeds toegevoegd");
			return;
		}

		if (this.getAantalProducten() == 100) {
			System.out.println("De bestelling is vol");
			return;
		}

		product.setProductNummer(Bestelling.getProductNummer());

		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i] == null) {
				this.getBestelling()[i] = product;
				Bestelling.setProductNummer(Bestelling.getProductNummer() + 1);
				return;
			}
		}
	}

	public void verwijderProduct(int productNummer) {

		if (this.getAantalProducten() == 0) {
			System.out.println("De bestelling is leeg");
			return;
		}

		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i].getProductNummer() == productNummer) {
				this.getBestelling()[i] = null;
				System.out.println("Product met het productnummer " + productNummer + " werd verwijderd.");
				return;
			}
		}

		System.out.println("Het product met productnummer " + productNummer + " werd niet gevonden.");
	}

	public int getAantalProducten() {
		int teller = 0;

		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i] != null) {
				teller++;
			}
		}

		return teller;
	}

	public void toonLijst() {

		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i] != null) {
				System.out.println(this.getBestelling()[i].toString());
			}
		}
	}

	public void toonPerMerk(String gekozenMerk) {
		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i] != null && this.getBestelling()[i].getMerk().equals(gekozenMerk)) {
				System.out.println(this.getBestelling()[i].toString());
			}
		}

	}

	public void toonParfums() {

		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i] != null && this.getBestelling()[i] instanceof Parfum) {
				System.out.println(this.getBestelling()[i].toString());
			}
		}
	}

	private boolean productAlreadyInBestelling(Product p) {

		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i] != null) {

				if (this.getBestelling()[i].equals(p)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public double totalePrijs() {
		double totaalprijs = 0;
		double btwMultiplier = ((double)Berekenbaar.BTW / 100) + 1;

		for (int i = 0; i < this.getBestelling().length; i++) {

			if (this.getBestelling()[i] != null) {
				totaalprijs += this.getBestelling()[i].getPrijs();
			}
		}
		
		totaalprijs += btwMultiplier;
		return totaalprijs;
	}

	public Product[] getBestelling() {
		return bestelling;
	}

	public void setBestelling(Product[] bestelling) {
		this.bestelling = bestelling;
	}

	public static int getProductNummer() {
		return productNummer;
	}

	public static void setProductNummer(int productNummer) {
		Bestelling.productNummer = productNummer;
	}
}
