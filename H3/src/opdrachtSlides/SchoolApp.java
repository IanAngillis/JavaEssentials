package opdrachtSlides;

public class SchoolApp {

	public static void main(String[] args) {
		Persoon p = new Persoon();
		Student s = new Student();
		Student s2 = new Student();
		Lector l1 = new Lector();
		Lector l2 = new Lector();
		Lector l3 = new Lector();
		
		s.setNaam("Angillis");
		s.setVoornaam("Ian");
		
		System.out.println("Personen: " + Persoon.getCount());
		System.out.println("Studenten: " + Student.getCountStudent());
		System.out.println("Lectors: " + Lector.getCountLector());
	}

}
