
public class BordSpel extends Spel {
	
	private int speelduur;
	private int aantalSpelers;
	
	//Constructor
	public BordSpel(String newNaam, Uitgever newUitgever) {
		super(newNaam, newUitgever);
		// TODO Auto-generated constructor stub
	}

	//Getters en setters
	public int getSpeelduur() {
		return speelduur;
	}

	public void setSpeelduur(int speelduur) {
		if(speelduur < 0) {
			speelduur = 30;
		}
		this.speelduur = speelduur;
	}

	public int getAantalSpelers() {
		return aantalSpelers;
	}

	public void setAantalSpelers(int aantalSpelers) {
		if(aantalSpelers < 0) {
			aantalSpelers = 1;
		}
		this.aantalSpelers = aantalSpelers;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Bordspel [naam=" + this.getNaam() + ", minimumleeftijd=" + this.getMinimumLeeftijd() + "uitgever=" + this.getUitgever().toString() +  ",speelduur=" + speelduur + ", aantalSpelers=" + aantalSpelers + "]";
	}
}
