package be.pxl.h13.oef1;

public abstract class WereldObject {
	private Punt positie;
	
	public WereldObject(int x, int y) {
		this.positie = new Punt(x, y);
	}
	
	//Methodes
	public double berekenAfstand(WereldObject wObj) {
		return this.positie.berekenAfstand(new Punt(wObj.getX(), wObj.getY()));
	}
	
	public abstract void beschrijf();
	
	//Getters en setters
	public int getX() {
		return this.positie.getX();
	}
	
	public int getY() {
		return this.positie.getY();
	}
	
	public void setX(int x) {
		this.positie.setX(x);
	}
	
	public void setY(int y) {
		this.positie.setY(y);
	}
}
