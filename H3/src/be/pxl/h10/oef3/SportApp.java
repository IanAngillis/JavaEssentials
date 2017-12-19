package be.pxl.h10.oef3;

public class SportApp {

	public static void main(String[] args) {

		Sporter[] sporterArray = new Sporter[10];

		sporterArray[0] = new Sporter("An", "Bex", "zwemmen");
		sporterArray[1] = new Sporter("Els", "Nilis", "volleybal");
		sporterArray[2] = new Sporter("Sofie", "Baerts", "zwemmen");
		sporterArray[3] = new Sporter("Leen", "Adams", "atletiek");
		sporterArray[4] = new Sporter("Miet", "Loos", "honkbal");
		sporterArray[5] = new Voetballer("Niels", "Vos", "KSKHasselt", "aanvaller");
		sporterArray[6] = new Voetballer("Joren", "Vos", "KSKHasselt", "verdediger");
		sporterArray[7] = new Voetballer("Joni", "Dirix", "KSKHasselt", "verdediger");
		sporterArray[8] = new Voetballer("Jelle", "Maes", "KSKHasselt", "middenvelder");
		sporterArray[9] = new Voetballer("Martijn", "Hox", "KSKHasselt", "qsfdg");

		System.out.println("Overzicht sporters behalve voetballers");

		for (int i = 0; i < sporterArray.length; i++) {
			if (!sporterArray[i].getBeoefendeSport().equals("voetbal")) {
				sporterArray[i].Print();
			}
		}

		System.out.println();
		System.out.println("Overzicht van voetballers volgens hun opstelling");
		System.out.println("*** aanvaller ***");
		filter(sporterArray, "aanvaller");

		System.out.println("*** verdediger ***");
		filter(sporterArray, "verdediger");

		System.out.println("*** middenvelder ***");
		filter(sporterArray, "middenvelder");

		System.out.println("*** Onbepaald ***");
		filter(sporterArray, "onbekend");
	}

	public static void filter(Sporter[] array, String filterString) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Voetballer) {
				Voetballer temp = (Voetballer) array[i];
				if (temp.getOpstelling().equals(filterString)) {
					temp.print();
				}
			}
		}
	}

}
