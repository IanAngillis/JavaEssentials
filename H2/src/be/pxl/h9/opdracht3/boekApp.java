package be.pxl.h9.opdracht3;

public class boekApp {
	public static void main(String[] args) {
		Boek b = new Boek();
		b.setTitel("The Lord of the Rings: The Fellowship of the Ring");
		b.setIsbn("0399856");
		b.setBladzijden("480");
		b.getAuteur().setVoornaam("J.R.R");
		b.getAuteur().setAchternaam("Tolkien");
		
		b.toonBoekGegevens();

	}
}
