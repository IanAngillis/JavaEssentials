
public class Score {

	private int waarde;
	private static int MAX_SCORE = 5;

	public Score(int newWaarde) {
		this.setWaarde(newWaarde);
	}

	public Score(Score[] array) {
		double sum = 0;

		for (Score score : array) {
			sum += score.getStars().length();
		}
		sum = sum / array.length;
		this.setWaarde((int) sum);
	}

	public String getStars() {
		StringBuilder temp = new StringBuilder("");

		for (int i = 0; i < this.waarde; i++) {
			temp.append("*");
		}

		return temp.toString();
	}

	private void setWaarde(int newWaarde) {
		if (newWaarde < 0) {
			this.waarde = 0;
		} else if (newWaarde > MAX_SCORE) {
			this.waarde = MAX_SCORE;
		} else {
			this.waarde = newWaarde;
		}
	}

	public boolean equals(Score s) {
		return this.getStars().equals(s.getStars());
	}
}
