package be.pxl.h9.oef1;

public class Huwelijk {
	private Persoon partner1;
	private Persoon partner2;
	private Datum huwelijksdatum;
	
	//Constructor
	Huwelijk(Persoon newPartner1, Persoon newPartner2, int newDag, int newMaand, int newJaar){
		this.partner1 = newPartner1;
		this.partner2 = newPartner2;
		this.huwelijksdatum = new Datum(newDag, newMaand, newJaar);
		this.getPartner2().setAdres(this.getPartner1().getAdres());
		
		System.out.println(this.getPartner1().getVoornaam() + " " + this.getPartner1().getNaam() + " en " + this.getPartner2().getVoornaam() + " " + this.getPartner2().getNaam() + " zijn gehuwd op " + this.getHuwelijksdatum().toString());
		
	}

	//Getters
	public Persoon getPartner1() {
		return partner1;
	}

	public Persoon getPartner2() {
		return partner2;
	}

	public Datum getHuwelijksdatum() {
		return huwelijksdatum;
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
}
