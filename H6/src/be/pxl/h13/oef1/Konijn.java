package be.pxl.h13.oef1;

public class Konijn extends Acteur {

	public Konijn(int x, int y) {
		super(x, y);
		
	}

	@Override
	public String interageer(WereldObject wObj) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void beschrijf() {
		System.out.println("Ik ben een konijn op positie x = " + this.getX() + " , y = " + this.getY());
		
	}

}
