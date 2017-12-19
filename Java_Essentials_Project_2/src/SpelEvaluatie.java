
public class SpelEvaluatie {
	private String motivatie;
	private Score score;
	private Speler speler;
	private Spel spel;
	private int beoordelingsCount = 0;
	
	//Constructor
	public SpelEvaluatie(Spel newSpel, Speler newSpeler) {
		this.spel = newSpel;
		this.speler = newSpeler;
	}
	
	//Getters en Setters
	public String getMotivatie() {
		return motivatie;
	}

	public Score getScore() {
		return score;
	}

	public Speler getSpeler() {
		return speler;
	}

	public Spel getSpel() {
		return spel;
	}
	
	public void maaktBeoordeling(int score, String motivatie){
		if(beoordelingsCount == 0) {
			this.score = new Score(score);
			this.motivatie = motivatie;
			beoordelingsCount++;
		}
		
	}
	
	public boolean isGeldig() {
		if(this.getSpel() == null) {
			return false;
		}
		
		if(this.getSpeler() == null) {
			return false;
		}
		
		if(this.getScore() == null) {
			return false;
		}
		
		if(this.getSpeler().getLeeftijd() < this.getSpel().getMinimumLeeftijd()) {
			return false;
		}
		
		return true;
	}
}
