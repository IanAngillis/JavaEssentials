package be.pxl.h10.oef1;

public class Werknemer extends Persoon {
	
	//Instantie -en klassevariabelen 
	private String functie;
	private double salaris;
	private static final double MIN = 1000.0;
	private static int aantalWerknemers = 0;
	
	{
		setAantalWerknemers(getAantalWerknemers() + 1);
	}
	
	//Constructors
	public Werknemer(String voornaam, String naam) {
		this(voornaam, naam, 1800, "algemeen bediende");
	}
	
	public Werknemer(String voornaam, String naam, double salaris, String functie) {
		super(voornaam, naam);
		this.setSalaris(salaris);
		this.setFunctie(functie);
	}
	
	//Getters en setters
	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public double getSalaris() {
		return salaris;
	}

	public void setSalaris(double salaris) {
		
		if(salaris < MIN) {
			salaris = MIN;
		}
		this.salaris = salaris;
	}
	
	@Override
	public void Print() {
		super.Print();
		System.out.println("Functie: " + this.getFunctie());
		System.out.println("Salaris: " + this.getSalaris());
	}

	public static int getAantalWerknemers() {
		return aantalWerknemers;
	}

	public static void setAantalWerknemers(int aantalWerknemers) {
		Werknemer.aantalWerknemers = aantalWerknemers;
	}

	public static double getMin() {
		return MIN;
	}
	
}
