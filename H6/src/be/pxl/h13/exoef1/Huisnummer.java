package be.pxl.h13.exoef1;

public class Huisnummer {
	// Klasse en instantievariabelen
	private int getal;
	private char symbool;

	/* Constructors */
	// Hoofdconstructor
	public Huisnummer(int getal, char symbool) {

		if (getal < 0 || getal > 1000) {
			getal = -1;
		}

		if (!(Character.isLetter(symbool) || symbool == ' ')) {
			symbool = ' ';
		}

		this.setGetal(getal);
		this.setSymbool(symbool);
	}

	// Copy constructor
	public Huisnummer(Huisnummer huisnummer) {
		this(huisnummer.getGetal(), huisnummer.getSymbool());
	}

	// Methoden
	public String getHuisnummer() {
		StringBuilder temp = new StringBuilder("");
		temp.append(this.getGetal());
		temp.append(symbool);
		return temp.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Huisnummer other = (Huisnummer) obj;
		if (getal != other.getal)
			return false;
		if (symbool != other.symbool)
			return false;
		return true;
	}

	/* Getters en setters */
	public int getGetal() {
		return getal;
	}

	public void setGetal(int getal) {
		this.getal = getal;
	}

	public char getSymbool() {
		return symbool;
	}

	public void setSymbool(char symbool) {
		this.symbool = symbool;
	}

}
