package be.pxl.h8.exoef3;
//TODO
public class Munt {
	private String naam;
	private double koers;
	private final int AFRONDING = 3;
	private int aantal;
	
	Munt(){
		this("euro", 1);
	}
	
	Munt(String n, double k){
		
	}
	
	public void setNaam(String n) {
		this.naam = n;
	}
	
	public void setKoers(Double k) {
		this.koers = k;
	}
	
	public String getNaam() {
		return this.naam;
	}

	public double getKoers() {
		return this.koers;
	}

	public int getAfronding() {
		return AFRONDING;
	}

	public int getAantal() {
		return this.aantal;
	}
	
	
	
	
}
