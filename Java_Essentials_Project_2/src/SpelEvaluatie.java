
import java.time.LocalDateTime;

public class SpelEvaluatie {
	private LocalDateTime tijdstip;
	private String motivatie = null;
	private Score score;
	private Speler speler;
	private Spel spel;

	// Constructor
	public SpelEvaluatie(Spel newSpel, Speler newSpeler) {
		this.spel = newSpel;
		this.speler = newSpeler;
		this.tijdstip = LocalDateTime.now();
	}

	// Getters en Setters
	public String getMotivatie() {
		return motivatie;
	}
	
	public LocalDateTime getTijdstip() {
		return this.tijdstip;
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

	public boolean maaktBeoordeling(int score, String motivatie) {
		if (this.getMotivatie() == null) {
			this.score = new Score(score);
			this.motivatie = motivatie;
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		SpelEvaluatie other = (SpelEvaluatie) obj;

		if (!score.equals(other.score)) {
			return false;
		} 
		
		return true;
	}

	public boolean isGeldig() {
		if (this.getSpel() == null) {
			return false;
		}

		if (this.getSpeler() == null) {
			return false;
		}

		if (this.getScore() == null) {
			return false;
		}

		if (this.getSpeler().getLeeftijd() < this.getSpel().getMinimumLeeftijd()) {
			return false;
		}

		return true;
	}
}
