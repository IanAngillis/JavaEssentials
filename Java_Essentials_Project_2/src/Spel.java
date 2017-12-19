
public abstract class Spel {
	
	private String naam;
	private int minimumLeeftijd;
	private Uitgever uitgever;
	
	//Constructor
	public Spel(String newNaam, Uitgever newUitgever) {
		this.setNaam(newNaam);
		this.uitgever = newUitgever;
		this.setMinimumLeeftijd(12);
	}
	
	//Getters en setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getMinimumLeeftijd() {
		return minimumLeeftijd;
	}

	public void setMinimumLeeftijd(int leeftijd) {
		if(leeftijd < this.getMinimumLeeftijd()) {
			leeftijd = this.getMinimumLeeftijd();
		}
		
		this.minimumLeeftijd = leeftijd;
	}

	public Uitgever getUitgever() {
		return uitgever;
	}

	@Override
	public String toString() {
		return "Spel [naam=" + naam + ", leeftijd=" + minimumLeeftijd + ", uitgever=" + uitgever + "]";
	}
	
	
	
	
	
	
}
