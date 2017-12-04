package opdracht2;

public class KlasApp {

	public static void main(String[] args) {
		Klas k1 = new Klas();
		
		System.out.println(Klas.MAXSTUDENTEN);
		System.out.println(Klas.getCount());
		Klas k2 = new Klas("1TINA", 21);
		System.out.println(Klas.getCount());
		Klas k3 = new Klas("1TINB", 15);
		System.out.println(Klas.getCount());

		Klas k4 = new Klas("1TINC", 28);
		System.out.println(Klas.getCount());
		Klas k5 = new Klas("1TIND", 30);
		System.out.println(Klas.getCount());
		Klas k6 = new Klas("1TINE", 40);
		System.out.println(Klas.getCount());
		Klas k7 = new Klas("1TINF", 55);
		System.out.println(Klas.getCount());
		
		Klas[] klasArray = new Klas[7];
		klasArray[0] = k1;
		klasArray[1] = k2;
		klasArray[2] = k3;
		klasArray[3] = k4;
		klasArray[4] = k5;
		klasArray[5] = k6;
		klasArray[6] = k7;
		
		for(Klas klas : klasArray) {
			System.out.println(klas.getKlasNaam());
			System.out.println(klas.getAantalStudent());
		}
		
		System.out.println(Klas.getTotaalAantalStudenten());
		k7.setAantalStudenten(56);
		System.out.println(Klas.getTotaalAantalStudenten());
		k4.setAantalStudenten(30);
		System.out.println(Klas.getTotaalAantalStudenten());
		k7.setAantalStudenten(20);
		System.out.println(Klas.getTotaalAantalStudenten());

	}

}
