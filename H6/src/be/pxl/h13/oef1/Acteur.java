package be.pxl.h13.oef1; 

public abstract class Acteur extends WereldObject implements Beweegbaar {

	public Acteur(int x, int y) {
		super(x, y);
	}
	
	public abstract String interageer(WereldObject wObj);
	
	public void stapBoven() {
		this.setY(this.getY() + 1);
	}
	
	public void stapLinks() {
		this.setX(this.getX() - 1);
	}
	
	public void stapRechts() {
		this.setX(this.getX() + 1);
	}
	
	public void stapOnder() {
		this.setY(this.getY() - 1);
	}
	
}
