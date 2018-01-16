import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Speler {
	private String naam;
	private LocalDate geboorteDatum;
	
	//Constructor
	Speler(String newNaam, String geboorteDatum){
		this.setNaam(newNaam);
		this.setGeboortejaar(geboorteDatum);
	}
	
	//methoden
	public  int getLeeftijd() {
		if(this.getGeboorteDatum() == null) {
			return -1;
		} else {
			return LocalDate.now().getYear() - this.getGeboorteDatum().getYear();
		}
	}
	
	//Getters en setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public LocalDate getGeboorteDatum() {
		return geboorteDatum;
	}

	public void setGeboortejaar(String geboorteDatum) {
		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate temp = LocalDate.parse(geboorteDatum, inputFormat);
		
		if(temp.getYear() > LocalDate.now().getYear()) {
			this.geboorteDatum = null;
		} else if (temp.getYear() < 1900) {
			this.geboorteDatum = null;
		} else {
			this.geboorteDatum = temp;
		}
	}
}
