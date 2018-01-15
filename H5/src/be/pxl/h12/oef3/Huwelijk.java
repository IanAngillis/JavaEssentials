package be.pxl.h12.oef3;

import java.time.*;

public class Huwelijk {
	private Persoon partner1;
	private Persoon partner2;
	private LocalDate huwelijksdatum;

	// Constructor
	Huwelijk(Persoon newPartner1, Persoon newPartner2, int newDag, int newMaand, int newJaar) {
		this.partner1 = newPartner1;
		this.partner2 = newPartner2;
		this.huwelijksdatum = LocalDate.of(newJaar, newMaand, newDag);
		this.getPartner2().setAdres(this.getPartner1().getAdres());

		System.out.println(this.getPartner1().getVoornaam() + " " + this.getPartner1().getNaam() + " en "
				+ this.getPartner2().getVoornaam() + " " + this.getPartner2().getNaam() + " zijn gehuwd op "
				+ this.getHuwelijksdatum().toString());

	}

	// Getters
	public Persoon getPartner1() {
		return partner1;
	}

	public Persoon getPartner2() {
		return partner2;
	}

	public LocalDate getHuwelijksdatum() {
		return huwelijksdatum;
	}

	public void printDatum(LocalDate datum) {
		System.out.printf("%s %02d %s %d\n", datum.getDayOfWeek().toString().toLowerCase(), datum.getDayOfMonth(),
				datum.getMonth().toString().toLowerCase(), datum.getYear());
	}

	public void adresWijziging(String newStraat, String newHuisnummer, String newPostcode, String newGemeenteNaam) {
		Adres temp = new Adres(newStraat, newHuisnummer, newPostcode, newGemeenteNaam);

		this.getPartner1().setAdres(temp);
		this.getPartner2().setAdres(temp);
	}

	public void print() {
		System.out.println(this.getPartner1().toString());
		System.out.println("Geboren op " + this.getPartner1().getGeboortedatum());
		System.out.println();
		System.out.println(this.getPartner2().toString());
		System.out.println("Geboren op " + this.getPartner2().getGeboortedatum());
		System.out.println();
		System.out.println("Het huwelijk vond plaats op " + this.getHuwelijksdatum().toString());
	}

	public int getAantalJaarGetrouwd() {
		return LocalDate.now().getYear() - this.getHuwelijksdatum().getYear();
	}

	public void printFeest() {
		int huwelijksCode = (this.getAantalJaarGetrouwd() / 10) + 1;
		int aantalDagen = 0;;
		LocalDate temp = this.getHuwelijksdatum();
		LocalDate temp2 = LocalDate.now();

		temp = temp.plusYears(huwelijksCode * 10);
		System.out.println("op " + temp.getDayOfMonth() + " " + temp.getMonth().toString().toLowerCase() + " " + temp.getYear() + " vieren ze hun "
				+ getSoortHuwelijksFeest(huwelijksCode) + " bruiloft");
		
		
		Period difference = Period.between(LocalDate.now(), temp);
		while(!temp2.equals(temp)) {
			
			temp2 = temp2.plusDays(1);
			aantalDagen++;
		}
		
		System.out.println("Dit zijn nog " + aantalDagen + " dagen. Of nog " + difference.getYears() + " jaren " + difference.getMonths() + " maanden en " + difference.getDays() + " dagen");
		

	}

	private String getSoortHuwelijksFeest(int huwelijksCode) {
		String feest = new String("");

		switch (huwelijksCode) {
		case 1:
			feest = "Tinnen";
			break;
		case 2:
			feest = "Porseleinen";
			break;
		case 3:
			feest = "Parel";
			break;
		case 4:
			feest = "Smaragden";
			break;
		case 5:
			feest = "Gouden";
			break;
		case 6:
			feest = "Diamenten";
			break;
		case 7:
			feest = "Platina";
			break;
		case 8:
			feest = "Eiken";
			break;
		default:
			feest = "Granieten";

		}
		
		return feest;
	}
}
