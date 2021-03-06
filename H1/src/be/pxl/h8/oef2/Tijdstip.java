package be.pxl.h8.oef2;

public class Tijdstip {
	// Oefening 1
	private int uren;
	private int minuten;
	private int seconden;

	// Oefening 3 Constructors
	public Tijdstip(int nieuwUur, int nieuwMinuten, int nieuwSeconden) {
		this.setSeconden(this.getSeconden() + nieuwSeconden);
		this.setMinuten(this.getMinuten() + nieuwMinuten);
		this.setUren(this.getUren() + nieuwUur);
	}

	public Tijdstip(int nieuwSeconden) {
		this(0, 0, nieuwSeconden);
	}

	public Tijdstip(Tijdstip t) {
		this(t.getUren(), t.getMinuten(), t.getSeconden());
	}

	// Getters en Setters
	// Getters Oefening 5
	public int getUren() {
		return this.uren;
	}

	public int getMinuten() {
		return this.minuten;
	}

	public int getSeconden() {
		return this.seconden;
	}

	// Setters oefening 4
	public void setUren(int nieuwUur) {
		if (nieuwUur >= 24) {
			this.uren = (nieuwUur % 24);
		} else {
			this.uren = nieuwUur;
		}
	}

	public void setMinuten(int nieuwMinuten) {
		int aantalUren;

		if (nieuwMinuten == 60) {
			this.setUren(this.getUren() + 1);
		} else if (nieuwMinuten > 60) {
			aantalUren = nieuwMinuten / 60;
			nieuwMinuten %= 60;

			this.setUren(this.getUren() + aantalUren);
			this.minuten = nieuwMinuten;
		} else {
			this.minuten = nieuwMinuten;
		}

	}

	public void setSeconden(int nieuwSeconden) {
		int aantalMinuten;

		if (nieuwSeconden > 60) {
			aantalMinuten = nieuwSeconden / 60;
			nieuwSeconden %= 60;

			this.setMinuten(this.getMinuten() + aantalMinuten);
			this.seconden = nieuwSeconden;
		} else if (nieuwSeconden == 60) {
			this.setMinuten(this.getMinuten() + 1);

		} else {
			this.seconden = nieuwSeconden;
		}
	}

	// Oefening 6
	public void voegUrenToe(int nieuwUur) {
		this.setUren(this.getUren() + nieuwUur);
	}

	public void voegUrenToe() {
		this.setUren(this.getUren() + 1);
	}

	public void voegMinutenToe(int nieuwMinuten) {
		this.setMinuten(this.getMinuten() + nieuwMinuten);
	}

	public void voegMinutenToe() {
		this.setMinuten(this.getMinuten() + 1);
	}

	public void voegSecondenToe(int nieuwSeconden) {
		this.setSeconden(this.getSeconden() + nieuwSeconden);
	}

	public void voegSecondenToe() {
		this.setSeconden(this.getSeconden() + 1);
	}

	// Oefening 7
	public String toStringTijd(boolean englishNotation) {

		StringBuilder temp = new StringBuilder("");
		int uur = this.getUren();
		int minuten = this.getMinuten();
		String suffix = new String("");

		// Check notation
		if (englishNotation) {
			if (uur > 12) {
				suffix = "PM";
				uur -= 12;
			} else {
				suffix = "AM";
			}

		} else {
			suffix = "u";
		}

		// Construct time to string
		if (uur < 10) {
			if (suffix.equals("u")) {
				temp.append(uur + ":");
			} else {
				temp.append("0" + uur + ":");
			}
		} else {
			temp.append(uur + ":");
		}

		if (minuten < 10) {
			temp.append("0" + minuten + " " + suffix);
		} else {
			temp.append(minuten + " " + suffix);
		}

		if (temp.toString().equals("12:00 AM")) {
			temp.append(" (noon)");
		}

		if (temp.toString().equals("00:00 AM")) {
			return "12:00 PM (midnight)";
		}

		return temp.toString();
	}

	// Oefening 8
	public String toStringTechnisch() {
		StringBuilder temp = new StringBuilder("");
		int uur = this.getUren();
		int minuten = this.getMinuten();
		int seconden = this.getSeconden();

		if (uur < 10) {
			temp.append("0" + uur + ":");
		} else {
			temp.append(uur + ":");
		}

		if (minuten < 10) {
			temp.append("0" + minuten + ":");
		} else {
			temp.append(minuten + ":");
		}

		if (seconden < 10) {
			temp.append("0" + seconden);
		} else {
			temp.append(seconden);
		}

		return temp.toString();
	}
}
