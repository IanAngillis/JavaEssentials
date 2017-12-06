package be.pxl.h9.oef1;

public class HuwelijkApp {

	public static void main(String[] args) {
		Persoon p1 = new Persoon("An", "Van Brussel", 27, 9, 2000, "Sparreweg", "18", "3500", "Hasselt");
		Persoon p2 = new Persoon("Ian", "Angillis", 27, 06, 1997, "Diestersteenweg", "55", "3545", "Halen");

		Huwelijk h = new Huwelijk(p1, p2, 1, 1, 2012);
		System.out.println();
		System.out.println("Huwelijksjaar van het huwelijk: " + h.getHuwelijksdatum().getJaar());
		System.out.println();
		System.out.println("Persoonsgegevens partner 1: ");
		System.out.println(h.getPartner1().toString() + " geboren op " + h.getPartner1().getGeboortedatum().toString());
		System.out.println();
		h.adresWijziging("Elfde linie", "12", "0000", "Kuringen");
		h.print();
		
		
	}

}
