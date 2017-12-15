package be.pxl.h10.oef3;

public class Voetballer extends Sporter {
	
	private String club;
	private String opstelling;
	private String [] opstellingen = {"aanvaller", "middenvelder", "verdediger"};
	
	//constructors
	Voetballer(String voornaam, String naam){
		this(voornaam, naam, "onbekend", "onbekend");
	}
	
	Voetballer(String voornaam, String naam, String club, String opstelling){
		super(voornaam, naam, "voetbal");
		
		this.setClub(club);
		this.setOpstelling(opstelling);
	}
	
	//Methodes
	
	public boolean inputIsValid(String [] array, String input) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(input)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void print() {
		super.print();
		System.out.println("Club: " + this.getClub() + " opstelling: " + this.getOpstelling());
	}
	
	//Getters en Setters
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getOpstelling() {
		return opstelling;
	}
	public void setOpstelling(String opstelling) {
		
		opstelling = opstelling.toLowerCase();
		if(inputIsValid(opstellingen, opstelling)) {
			this.opstelling = opstelling;
		} else {
		
		this.opstelling = "onbekend";
		}
	}
	public String[] getOpstellingen() {
		return opstellingen;
	}
	
	
	
	
}
