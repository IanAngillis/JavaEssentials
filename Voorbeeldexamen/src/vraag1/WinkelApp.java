package vraag1;

public class WinkelApp {
	public static void main(String[] args) {
		System.out.printf("Oplossing van %s %s\n", "Jouw naam ", "Student PXL");

		Bestelling bestelling = new Bestelling();
		Product[] lijst = Data.artikels;

		for (Product artikel : lijst) {
			bestelling.voegProductToe(artikel);
		}
		
		bestelling.verwijderProduct(1003);
		
		bestelling.toonLijst();

		System.out.println("\nVan het merk Georgio Armani:");
		bestelling.toonPerMerk("Georgio Armani");
		System.out.println("\nAlle Parfums:");
		bestelling.toonParfums();

		System.out.printf("\nTotale prijs: €%.2f", bestelling.totalePrijs());
		System.out.printf("\nTotale prijs excl. btw: €%.2f", bestelling.totalePrijsExclBtw());
		System.out.println("\nAantal producten in bestelling: " + bestelling.getAantalProducten());

	}
}
