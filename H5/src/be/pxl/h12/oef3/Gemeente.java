package be.pxl.h12.oef3;

public class Gemeente {
	// Instantie- en klassevariabelen
	private String postcode;
	private String gemeenteNaam;

	// Constructor(s)
	Gemeente() {
		this("0000", "onbekend");
	}

	Gemeente(String newPostcode, String newGemeenteNaam) {
		this.setPostcode(newPostcode);
		this.setGemeenteNaam(newGemeenteNaam);
	}

	// Getters en Setters
	// Getters
	public String getPostcode() {
		return this.postcode;
	}

	public String getGemeenteNaam() {
		return this.gemeenteNaam;
	}

	// Setters
	public void setPostcode(String newPostcode) {

		newPostcode = postcodeParser(newPostcode);

		this.postcode = newPostcode;
	}

	public void setGemeenteNaam(String newGemeenteNaam) {
		newGemeenteNaam = gemeenteNaamParser(newGemeenteNaam);
		this.gemeenteNaam = newGemeenteNaam;
	}

	// Methoden
	public String toString() {
		return this.getPostcode() + " " + this.getGemeenteNaam();
	}

	private String gemeenteNaamParser(String newGemeenteNaam) {
		newGemeenteNaam = newGemeenteNaam.toLowerCase();
		StringBuilder temp = new StringBuilder(newGemeenteNaam);

		for (int i = 0; i < temp.length(); i++) {
			if (this.isDigit(temp.charAt(i))) {
				temp.deleteCharAt(i);
				i -= 1;
			}
		}
		
		temp.setCharAt(0, (char)(temp.charAt(0) - 32));
		
		for(int i = 0; i < temp.length(); i++) {
			if((temp.charAt(i) == ' ' || temp.charAt(i) == '-') && (i != temp.length()-1) ) {
				temp.setCharAt(i+1, (char)(temp.charAt(i+1) - 32));
			}
		}
		
		newGemeenteNaam = temp.toString();
		//newGemeenteNaam = newGemeenteNaam.substring(0, 1) + newGemeenteNaam.substring(1).toLowerCase();

		return newGemeenteNaam;
	}

	private boolean isDigit(char character) {

		switch (character) {
		case '0':
			return true;
		case '1':
			return true;
		case '2':
			return true;
		case '3':
			return true;
		case '4':
			return true;
		case '5':
			return true;
		case '6':
			return true;
		case '7':
			return true;
		case '8':
			return true;
		case '9':
			return true;

		}

		return false;
	}

	// Controls postcode
	private String postcodeParser(String newPostcode) {
		if (newPostcode.length() > 4) {
			return newPostcode.substring(0, 4);
		} else if (newPostcode.length() == 4) {
			return newPostcode;
		} else {
			newPostcode = newPostcode + "0000";
			return newPostcode.substring(0, 4);
		}
	}
}
