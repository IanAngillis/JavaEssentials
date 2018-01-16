package be.pxl.h13.oef1;

public class Egel extends Acteur {

	public Egel(int x, int y) {
		super(x, y);
	}

	@Override
	public String interageer(WereldObject wObj) {
		
		double distance = this.berekenAfstand(wObj);
		
		if(distance <= 10) {
			
			if(wObj instanceof Egel) {
				return "Dag egel";
			} else if  (wObj instanceof Konijn) {
				return "Dag konijn";
			} else {
				return "";
			}
		} else if (distance  <= 20) {
			
			if(wObj instanceof Egel) {
				return "Dag egel";
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

	@Override
	public void beschrijf() {
		System.out.println("Ik ben een egel op positie x = " + this.getX() + " , y = " + this.getY());
		
	}

}
