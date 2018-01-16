package be.pxl.h13.exoef1;

public class Park extends Structuur {

	public Park(Huisnummer nummer) {
		super(nummer);
	}

	@Override
	public void beschrijf() {
		System.out.println("Park gelegen op nummer " + this.getNummer().getHuisnummer());
		
	}

}
