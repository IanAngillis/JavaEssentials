package be.pxl.h10.oef2;

public class GeboekteReis {
	// klassevariabelen
	private int maxAantalReizen;
	private String naam;
	private Reis[] reizen;
	private int aantalGeboekteReizen;

	// Constructors
	public GeboekteReis(String naam, int aantalReizen) {
		this.setNaam(naam);
		this.setMaxAantalReizen(aantalReizen);
		this.reizen = new Reis[aantalReizen];
		this.setAantalGeboekteReizen(0);
	}

	// Methodes
	public void voegReisToe(Reis r) {
		
		if (this.getAantalGeboekteReizen() < 5) {
			this.getReizen()[this.getAantalGeboekteReizen()] = r;
			this.setAantalGeboekteReizen(this.getAantalGeboekteReizen() + 1);
			System.out.println("Reis succesvol toegevoegd.");
		} else {
			System.out.println("Geboekte reizen array is vol.");
		}
	}

	public void print() {
		System.out.println("Reis van " + this.getNaam());

		for (int i = 0; i < this.getAantalGeboekteReizen(); i++) {
			System.out.print("==> reis " + (i + 1) + " ");
			this.getReizen()[i].print();
		}
		
		System.out.println("Deze passagier moet " + (this.getAantalGeboekteReizen() - 1) + " keer overstappen");
	}

	// Getters en Setters
	public int getMaxAantalReizen() {
		return maxAantalReizen;
	}

	public void setMaxAantalReizen(int aantalReizen) {
		this.maxAantalReizen = aantalReizen;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Reis[] getReizen() {
		return reizen;
	}

	public void setReizen(Reis[] reizen) {
		this.reizen = reizen;
	}

	public int getAantalGeboekteReizen() {
		return aantalGeboekteReizen;
	}

	public void setAantalGeboekteReizen(int aantalGeboekteReizen) {
		this.aantalGeboekteReizen = aantalGeboekteReizen;
	}

}
