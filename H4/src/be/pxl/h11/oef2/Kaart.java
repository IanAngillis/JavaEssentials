package be.pxl.h11.oef2;

public class Kaart {
	
	private Ranking ranking;
	private Soort soort;
	
	public Kaart(Ranking newRanking, Soort newSoort) {
		this.setRanking(newRanking);
		this.setSoort(newSoort);
	}
	
	//Getters en setters
	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	public Soort getSoort() {
		return soort;
	}

	public void setSoort(Soort soort) {
		this.soort = soort;
	}
	
	
}
