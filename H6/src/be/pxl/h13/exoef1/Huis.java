package be.pxl.h13.exoef1;

public class Huis extends Structuur {

	private String eigenaar;
		
	public Huis(String eigenaar, Huisnummer nummer) {
		super(nummer);
		this.setEigenaar(eigenaar);
	}

	@Override
	public void beschrijf() {
		System.out.println(this.getEigenaar() + " woont op de nummer " + this.getNummer().getHuisnummer());
		
	}

	public String getEigenaar() {
		return eigenaar;
	}

	public void setEigenaar(String eigenaar) {
		this.eigenaar = eigenaar;
	}
}
