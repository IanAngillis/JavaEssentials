package be.pxl.h8.oef3;

public class BankrekeningApp {

	public static void main(String[] args) {
		Bankrekening rekening1 = new Bankrekening();
		
		rekening1.stort(50);
		rekening1.setRekeningnummer("00-01574125-77");
		rekening1.stort(50);
		rekening1.neemOp(20);
		rekening1.verrichting(50, -10, 20, -40);
		rekening1.schrijfRenteBij();
		
		Bankrekening rekening2 = new Bankrekening("000-2536987-33", "Jef Klak", 150, 2.5);
		//Oefening 10 			Functie schrijfover?
		rekening2.neemOp(50);
		rekening1.stort(50);
		
		//10 maar met een functie
		rekening1.schrijfGeldOver(rekening1.getSaldo(), rekening2);
	}

}
