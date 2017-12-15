package opdrachtSlides;

public class Persoon {
	private String voornaam;
	private String naam;
	private static int countPersoon;
	
	{
		setCount(getCount() + 1);
	}
	
	//Constructors
	Persoon(){
		this("Onbekend", "Onbekend");
	}
	
	Persoon(String newVoornaam, String newAchternaam){
		this.setVoornaam(newVoornaam);
		this.setNaam(newAchternaam);
	}
	
	//Getters en setters
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return "Persoon [voornaam=" + voornaam + ", naam=" + naam + "]";
	}

	public static int getCount() {
		return countPersoon;
	}

	public static void setCount(int count) {
		Persoon.countPersoon = count;
	}
	
	
}
