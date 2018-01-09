package be.pxl.h11.exoef1;

public class TShirt {
	private TshirtSize maat;
	private Kleur kleur;
	private int aantalBesteld = 0;
	
	public TShirt(TshirtSize maat, Kleur kleur) {
		this.setMaat(maat);
		this.setKleur(kleur);
	}

	public TshirtSize getMaat() {
		return maat;
	}

	public void setMaat(TshirtSize maat) {
		this.maat = maat;
	}

	public int getAantalBesteld() {
		return aantalBesteld;
	}

	public void setAantalBesteld(int aantalBesteld) {
		this.aantalBesteld = aantalBesteld;
	}
	
	public Kleur getKleur() {
		return kleur;
	}
	
	public void setKleur(Kleur kleur) {
		this.kleur = kleur;
	}
	
}
