package be.pxl.h13.oef2;

public abstract class BouwGrond implements Verkoopbaar{
	
	private String perceelNr;
	private double perceelGrootte;
	private String bouwVoorschrift;
	
	//Constructor
	public BouwGrond(String perceelNr, double PerceelGrootte) {
		this.setPerceelNr(perceelNr);
		this.setPerceelGrootte(PerceelGrootte);
		
	}
	
	//Gettes en Setters
	public String getPerceelNr() {
		return perceelNr;
	}
	public void setPerceelNr(String perceelNr) {
		this.perceelNr = perceelNr;
	}
	public double getPerceelGrootte() {
		return perceelGrootte;
	}
	public void setPerceelGrootte(double perceelGrootte) {
		this.perceelGrootte = perceelGrootte;
	}
	public String getBouwVoorschrift() {
		return bouwVoorschrift;
	}
	public void setBouwVoorschrift(String bouwVoorschrift) {
		this.bouwVoorschrift = bouwVoorschrift;
	}

}
