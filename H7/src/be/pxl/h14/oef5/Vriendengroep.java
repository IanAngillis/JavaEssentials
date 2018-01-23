package be.pxl.h14.oef5;

import java.time.format.DateTimeFormatter;

public class Vriendengroep {
	Persoon[] vrienden;
	public final int MAXAANTALVRIENDEN = 10;

	{
		this.vrienden = new Persoon[this.MAXAANTALVRIENDEN];
	}

	public String toString() {
		StringBuilder temp = new StringBuilder("");
		int kortsteAantalDagenTotVerjaardag = vrienden[0].aantalDagenTotVerjaardag();
		int index = 0;

		for (int i = 0; i < vrienden.length; i++) {
			if(vrienden[i] == null) {
				continue;
			}
			temp.append(vrienden[i].getNaam() + " "
					+ vrienden[i].getGeboorteDatum().format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
			temp.append("\n");
		}

		for (int i = 0; i < vrienden.length; i++) {
			if(vrienden[i] == null) {
				continue;
			}
			
			if (vrienden[i].aantalDagenTotVerjaardag() < kortsteAantalDagenTotVerjaardag) {
				kortsteAantalDagenTotVerjaardag = vrienden[i].aantalDagenTotVerjaardag();
				index = i;
			}
		}

		temp.append("De volgende jarige is " + vrienden[index].getNaam());

		return temp.toString();
	}

	public void verwijderVriend(String naam) throws Exception {

		for (int i = 0; i < vrienden.length; i++) {
			if (vrienden[i] != null) {
				if (vrienden[i].getNaam().equals(naam)) {
					vrienden[i] = null;
					if(arrayIsEmpty()) {
						System.out.println("Er zijn geen vrienden meer over");
					}
					return;
				}
			}
		}

		throw new Exception("Deze persoon is geen vriend en kan niet verwijderd worden uit de vriendelijst");

	}

	public boolean arrayIsEmpty() {

		for(int i = 0; i < vrienden.length; i++) {
			
			if(vrienden[i] != null) {
				return false;
			}
		}
		
		return true;
	}

	public void voegVriendToe(Persoon persoon) throws Exception {

		if (friendExists(persoon)) {
			throw new Exception("Deze naam bestaat al: " + persoon.getNaam());
		}

		if (arrayIsFull()) {
			throw new Exception("De rij vrienden is al vol");
		}

		for (int i = 0; i < vrienden.length; i++) {

			if (vrienden[i] == null) {
				vrienden[i] = persoon;
				break;
			}
		}
	}

	private boolean arrayIsFull() {

		for (int i = 0; i < vrienden.length; i++) {

			if (vrienden[i] == null) {
				return false;
			}
		}

		return true;
	}

	private boolean friendExists(Persoon persoon) {

		for (int i = 0; i < vrienden.length; i++) {
			if (vrienden[i] == null) {
				continue;
			}

			if (vrienden[i].getNaam().equals(persoon.getNaam())) {
				return true;
			}
		}

		return false;
	}
}
