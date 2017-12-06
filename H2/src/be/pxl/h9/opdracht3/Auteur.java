package be.pxl.h9.opdracht3;

public class Auteur {
	private String voornaam;
	private String achternaam;
	
	Auteur(){
		this("onbekend", "onbekend");
	}
	
	Auteur(String voornaam, String achternaam){
		this.setVoornaam(voornaam);
		this.setAchternaam(achternaam);
		
	}
	
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	public String toString() {
		return "Auteur [voornaam=" + voornaam + ", achternaam=" + achternaam + "]";
	}
	
	
}
