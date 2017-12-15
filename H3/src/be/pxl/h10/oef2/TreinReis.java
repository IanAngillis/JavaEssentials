package be.pxl.h10.oef2;

public class TreinReis extends Reis {

	private boolean nationaal;
	private String specificatie;
	private String[] specificatieArray = {"IC", "IR", "L", "P"};
	
	TreinReis(String bestemming) {
		this(bestemming, Reis.getMinprice(), false, "IC");
	}
	
	TreinReis(String bestemming, double prijs, boolean nationaal, String specificatie){
		super(bestemming, prijs);
		
		this.setNationaal(nationaal);
		this.setSpecificatie(specificatie);
	}
	
	private boolean inputIsValid(String array[], String input) {
		
		for(String inputArrayElement : array) {
			if(inputArrayElement.equals(input)) {
				return true;
			}
		}
		
		return false;
	}
	
	//getters en setters
	public boolean isNationaal() {
		return nationaal;
	}

	public void setNationaal(boolean nationaal) {
		this.nationaal = nationaal;
	}

	public String getSpecificatie() {
		return specificatie;
	}

	public void setSpecificatie(String specificatie) {
		if(this.isNationaal() && inputIsValid(this.getSpecificatieArray(), specificatie)) {
			this.specificatie = specificatie;
		} else {
			this.specificatie = this.getSpecificatieArray()[0];
		}
		
		this.specificatie = specificatie;
	}

	public String[] getSpecificatieArray() {
		return specificatieArray;
	}

	public void setSpecificatieArray(String[] specificatieArray) {
		this.specificatieArray = specificatieArray;
	}
	
	public void print() {
		super.print();
		
		if(this.isNationaal()) {
			System.out.print("Nationale treinreis ");
		} else {
			System.out.print("Internationale treinreis ");
		}
		
		System.out.print("(" + this.getSpecificatie() + ")");
		System.out.println();
	}
	
	
}
