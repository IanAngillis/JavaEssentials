import java.time.LocalDate;

public class Speler {
	private String naam;
	private int geboortejaar;
	
	//Constructor
	Speler(String newNaam, int newGeboortejaar){
		this.setNaam(newNaam);
		this.setGeboortejaar(newGeboortejaar);
	}
	
	//methoden
	public  int getLeeftijd() {
		if(this.getGeboortejaar() == 0) {
			return -1;
		} else {
			return LocalDate.now().getYear() - this.getGeboortejaar();
		}
	}
	
	//Getters en setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getGeboortejaar() {
		return geboortejaar;
	}

	public void setGeboortejaar(int geboortejaar) {
		this.geboortejaar = geboortejaar;
	}
	
}
