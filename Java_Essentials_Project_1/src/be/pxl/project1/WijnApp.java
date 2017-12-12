package be.pxl.project1;

public class WijnApp {

	public static void main(String[] args) {
		Wijn[] wijnkelder = new Wijn[4];

		wijnkelder[0] = new Wijn("Parra", "Wit", "Spanje", 2001, 11.5);
		wijnkelder[0].setDruivenras("Sauvignon Blanc");
		wijnkelder[0].setOmschrijving("Licht, fris en strak");
		wijnkelder[0].setRegio("La Mancha");
		wijnkelder[0].setServeerTip("Visgerechten");

		wijnkelder[1] = new Wijn("Domaine de la Jardine", "Rood", "Frankrijk", 2016, 14);
		wijnkelder[1].setDruivenras("Merlot");
		wijnkelder[1].setOmschrijving("Licht, soepel en fruitig");
		wijnkelder[1].setRegio("Pays d'Oc");
		wijnkelder[1].setServeerTip("Gevogelte");

		wijnkelder[2] = new Wijn("Montebello Grande Bellezza", "Rood", "Italië", 2012, 13);
		wijnkelder[2].setDruivenras("Negroamaro");
		wijnkelder[2].setOmschrijving("Licht, soepel en fruitig");
		wijnkelder[2].setRegio("Puglia");
		wijnkelder[2].setServeerTip("Gegrild vlees");

		wijnkelder[3] = new Wijn("Château Palmer 3eme Grand Cru", "Rood", "Frankrijk", 2002, 13.5);
		wijnkelder[3].setDruivenras("Bordeaux");
		wijnkelder[3].setOmschrijving("Complex, krachtig en vol");
		wijnkelder[3].setRegio("Bordeaux");

		System.out.println("** Duurste fles:");

		System.out.println(wijnkelder[getDuursteFles(wijnkelder)].getLabel());

		System.out.println("** Goedkoopste fles:");

		System.out.println(wijnkelder[getGoedkoopsteFles(wijnkelder)].getLabel());

		System.out.println("** Aantal flessen rode wijn: " + getAantalFlessen(wijnkelder, "Rood"));

		System.out.println("** Suggestie(s) bij gevogelte:");

		printSuggestiesBijServeerTip(wijnkelder, "gevogelte");

		System.out.println();
	}

	public static void printSuggestiesBijServeerTip(Wijn[] wijnkelder, String serveerTip) {
		for (Wijn fles : wijnkelder) {

			if (fles.getServeerTip().equalsIgnoreCase(serveerTip)) {
				System.out.println(fles.getLabel());
				System.out.println();
			}
		}
	}

	public static int getAantalFlessen(Wijn[] wijnkelder, String kleur) {
		int aantalFlessen = 0;

		for (Wijn fles : wijnkelder) {
			if (fles.getKleur().equals(kleur)) {
				aantalFlessen++;
			}
		}

		return aantalFlessen;
	}

	public static int getGoedkoopsteFles(Wijn[] wijnkelder) {
		int goedkoopsteFles = 0;
		double min = wijnkelder[0].getAdviesPrijs();

		for (int i = 0; i < wijnkelder.length; i++) {
			if (wijnkelder[i].getAdviesPrijs() < min) {
				min = wijnkelder[i].getAdviesPrijs();
				goedkoopsteFles = i;
			}
		}

		return goedkoopsteFles;
	}

	public static int getDuursteFles(Wijn[] wijnkelder) {

		int duursteFles = 0;
		double max = 0;

		for (int i = 0; i < wijnkelder.length; i++) {
			if (wijnkelder[i].getAdviesPrijs() > max) {
				max = wijnkelder[i].getAdviesPrijs();
				duursteFles = i;
			}
		}

		return duursteFles;
	}

}
