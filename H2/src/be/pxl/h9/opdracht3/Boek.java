package be.pxl.h9.opdracht3;

public class Boek {
	private String isbn;
	private String titel;
	private String bladzijden;
	private Auteur auteur;
	
	Boek(){
		this("0", "onbekend", "onbekend", new Auteur("onbekend", "onbekend"));
	}
	
	Boek(String newIsbn, String newTitel, String newBlz, Auteur newAuteur){
		this.setIsbn(newIsbn);
		this.setTitel(newTitel);
		this.setBladzijden(newBlz);
		this.setAuteur(newAuteur);
	}
	
	public void toonBoekGegevens() {
		System.out.println("Boekgegevens");
		System.out.println("ISBN:" + this.getIsbn());
		System.out.println("Titel: " + this.getTitel());
		System.out.println("Bladzijden: " + this.getBladzijden());
		System.out.println(this.getAuteur().toString());
	}
	
	
	//Getters en setters
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getBladzijden() {
		return bladzijden;
	}
	public void setBladzijden(String bladzijden) {
		this.bladzijden = bladzijden;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	
}
