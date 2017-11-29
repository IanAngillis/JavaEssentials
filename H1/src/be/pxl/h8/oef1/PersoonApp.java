package be.pxl.h8.oef1;

public class PersoonApp {

	public static void main(String[] args) {
		Persoon p1 = new Persoon();
		
		p1.setGeboortejaar(1997);
		p1.setGewicht(75);
		p1.setLengte(1.66);
		p1.setNaam("Angillis");
		p1.setVoornaam("Ian");
		
		String test = p1.toString();
		
		System.out.println(test);
		System.out.println(p1.getBMI());
		
		test = p1.geefOmschrijving();
		System.out.println(test);
		
		p1.voegVoornamenToe("Jan", "Ian", "Brecht");
		System.out.println(p1.getVoornaam());
		
	}

}
