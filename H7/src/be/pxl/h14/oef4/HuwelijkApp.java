package be.pxl.h14.oef4;

public class HuwelijkApp {

	public static void main(String[] args) {
		Persoon p1 = null;
		Persoon p2 = null;
		Huwelijk h = null;

		try {
			p1 = new Persoon("An", "Van Brussel", 27, 0, 2000, "Sparreweg", "18", "3500", "Hasselt-d3E-sTAD");
			p2 = new Persoon("Ian", "Angillis", 27, 06, 1997, "Diestersteenweg", "55", "3545", "Halen");
			h = new Huwelijk(p1, p2, 1, 1, 2012);

			System.out.println();
			System.out.println("Huwelijksjaar van het huwelijk: " + h.getHuwelijksdatum().getJaar());
			System.out.println();
			System.out.println("Persoonsgegevens partner 1: ");
			System.out.println(
			h.getPartner1().toString() + " \ngeboren op " + h.getPartner1().getGeboortedatum().toString());
			System.out.println();
			h.adresWijziging("Elfde linie", "12", "0000", "Kuringen");
			h.print();
		} catch (DatumException e) {
			System.out.println(e.getMessage());
		}

	}

}
