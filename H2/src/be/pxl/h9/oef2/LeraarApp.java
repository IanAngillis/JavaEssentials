package be.pxl.h9.oef2;

public class LeraarApp {

	public static void main(String[] args) {
		Leraar l = new Leraar("Ian", "Angillis", 78);
		
		Vak v = new Vak("12LOL", "Wiskunde", 12);
		Vak v1 = new Vak("15LEL", "Nederlands", 74);
		
		l.voegVakToe(v);
		
		
		for(int i = 0; i < l.getAantalVakken(); i++) {
			System.out.println(l.getVak(i).getNaam());
			System.out.println(l.getVak(i).getCode());

		}
		
		l.voegVakToe(v1);
		for(int i = 0; i < l.getAantalVakken(); i++) {
			System.out.println(l.getVak(i).getNaam());
			System.out.println(l.getVak(i).getCode());

		}

	}

}
