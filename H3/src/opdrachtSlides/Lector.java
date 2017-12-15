package opdrachtSlides;

public class Lector extends Persoon{
	
	private String personeelsNummer;
	private double aanstellingsPercentage;
	private double salaris;
	private static int countLector = 0;

	{
		setCountLector(getCountLector() + 1);
	}
	
	public Lector() {
		this("Onbekend", "Onbekend", 100, 2000, "20009999");
	}
	
	public Lector(String voornaam, String naam, double aanstellingsPercentage, double salaris) {
		this(voornaam, naam, aanstellingsPercentage, salaris, "20009999");
	}
	
	public Lector(String voornaam, String naam, double aanstellingsPercentage, double salaris, String personeelsNummer) {
		super(voornaam, naam);
		this.setAanstellingsPercentage(aanstellingsPercentage);
		this.setSalaris(salaris);
		this.setPersoneelsNummer(personeelsNummer);
	}
	
	
	
	//Getters en setters
	public String getPersoneelsNummer() {
		return personeelsNummer;
	}
	public void setPersoneelsNummer(String personeelsNummer) {
		this.personeelsNummer = personeelsNummer;
	}
	public double getAanstellingsPercentage() {
		return aanstellingsPercentage;
	}
	public void setAanstellingsPercentage(double aanstellingsPercentage) {
		
		if(aanstellingsPercentage < 0 ) {
			aanstellingsPercentage = 0;
		} else if (aanstellingsPercentage > 100) {
			aanstellingsPercentage = 100;
		}
		
		wijzigLoon(aanstellingsPercentage - this.getAanstellingsPercentage());
		
		this.aanstellingsPercentage = aanstellingsPercentage;
	}
	public double getSalaris() {
		return salaris;
	}
	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}
	
	public void wijzigLoon(double verschil) {
		
		double temp = (this.getSalaris() / 100) * verschil; 
		this.setSalaris(this.getSalaris() + (this.getSalaris() * temp));
	}
	
	public void print() {
		System.out.println("Informatie lector: ");
		System.out.println("Naam: " + this.getVoornaam() + " " + this.getNaam());
		System.out.println("Personeelsnr: " + this.getPersoneelsNummer());
		System.out.println("Aanstellingspercentage: " + this.getAanstellingsPercentage());
		System.out.println("Salaris: " + this.getSalaris());
	}

	public static int getCountLector() {
		return countLector;
	}

	public static void setCountLector(int countLector) {
		Lector.countLector = countLector;
	}
	
	
}
