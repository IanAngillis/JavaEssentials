package be.pxl.h9.oef2;

public class Vak {
	private String code;
	private String naam;
	private int aantalSTP;
	
	//Constructor
	Vak(String newCode, String newNaam, int newAantalSTP){
		this.setCode(newCode);
		this.setNaam(newNaam);
		this.setAantalSTP(newAantalSTP);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		code = codeParser(code);
		this.code = code;
	}
	
	private String codeParser(String code) {
		StringBuilder temp = new StringBuilder(code);
		
		if(temp.charAt(1) != '1') {
			temp.setCharAt(1,  '1');
		}
		
		return temp.toString();
	}

	public String getNaam() {
		return this.naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAantalSTP() {
		return aantalSTP;
	}

	public void setAantalSTP(int aantalSTP) {
		aantalSTP = studiePuntenChecker(aantalSTP);
		this.aantalSTP = aantalSTP;
	}
	
	private int studiePuntenChecker(int studiepunten) {
		
		if(studiepunten > 18) {
			studiepunten = 18;
		} else if(studiepunten % 3 != 0) {
			if((studiepunten +1) % 3 == 0) {
				studiepunten += 1;
			} else {
				studiepunten -= 1;
			}
		}
		
		return studiepunten;
	}
	
	
}
