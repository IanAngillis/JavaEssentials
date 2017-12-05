package be.pxl.h8.oef5;

public class Auto {
	//Opdracht 1
	private String merk;
	private String model;
	private int bouwjaar;
	private String kleur;
	private int maxSnelheid;
	
	public static int count = 0;
	public static final int MAX = 180;
	
	{
		count++;
	}
	
	//Opdracht 2
	public Auto() {
		this("VolksWagen", "Polo", 2017, "grijs", 160);
	}
	
	public Auto(Auto auto) {
		this(auto.getMerk(), auto.getModel(), auto.getBouwjaar(), auto.getKleur(), auto.getMaxSnelheid());
	}
	
	public Auto(String newMerk, String newModel, int newBouwJaar, String newKleur, int newMaxSnelheid) {
		this.setMerk(newMerk);
		this.setModel(newModel);
		this.setBouwjaar(newBouwJaar);
		this.setKleur(newKleur);
		this.setMaxSnelheid(newMaxSnelheid);
		System.out.println("Auto " + Auto.getCount() + " is succesvol aangemaakt.");

	}
	
	//Opdracht 3
	//Getters
	public String getMerk() {
		return this.merk;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getBouwJaar() {
		return this.bouwjaar;
	}
	
	public String getKleur() {
		return this.kleur;
	}
	
	public int getMaxSnelheid() {
		return this.maxSnelheid;
	}

	public int getBouwjaar() {
		return bouwjaar;
	}
	//Setters
	public void setBouwjaar(int newBouwjaar) {
		this.bouwjaar = newBouwjaar;
	}

	public void setMerk(String newMerk) {
		this.merk = newMerk;
	}

	public void setModel(String newModel) {
		this.model = newModel;
	}

	public void setKleur(String newKleur) {
		this.kleur = newKleur;
	}

	public void setMaxSnelheid(int newMaxSnelheid) {
		if(newMaxSnelheid > Auto.MAX) {
			newMaxSnelheid = Auto.MAX;
		}
		
		this.maxSnelheid = newMaxSnelheid;
	}
	
	public static int getCount() {
		return Auto.count;
	}

	public void print() {
		System.out.println("Gegevens auto");
		System.out.println("Merk: " + this.getMerk());
		System.out.println("Model: " + this.getModel());
		System.out.println("Bouwjaar: " + this.getBouwJaar());
		System.out.println("Kleur: " + this.getKleur());
		System.out.println("Maximum snelheid: " + this.getMaxSnelheid());
	}
	
	
	
}
