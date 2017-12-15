package be.pxl.h10.oef1;

public class WerknemerApp {

	public static void main(String[] args) {
		Werknemer w1 = new Werknemer("Jan", "Janssens");
		Werknemer w2 = new Werknemer("Lol", "Lollen");
		Manager m1 = new Manager("Ian", "Angillis", 150, "Manager");
		
		
		if(w1.getSalaris() < 1000) {
			System.out.println("Onder minimumloon");
		}
		
		if(w2.getSalaris() < 1000) {
			System.out.println("Onder minimumloon");
		}
		
		if(m1.getSalaris() < 1000) {
			System.out.println("Onder minimumloon");
		}
		
		m1.Print();
		System.out.println();
		System.out.println("Procentueel aandeel managers t.o.v. werknemer: ");
		System.out.println(Manager.getProcAandeelManager());
	}

}
