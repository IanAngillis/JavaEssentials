package be.pxl.h13.exoef1;

public abstract class Structuur {
	private Huisnummer nummer;

	//Constructor
	public Structuur(Huisnummer nummer) {
		this.nummer = new Huisnummer(nummer);
	}
	
	//Methodes
	public abstract void beschrijf();
	
	// Getters en setters
	public Huisnummer getNummer() {
		return nummer;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Structuur other = (Structuur) obj;
		
		if(!this.getNummer().equals(other.getNummer())) {
			return false;
		}
		
		return true;
	}
	
	
}
