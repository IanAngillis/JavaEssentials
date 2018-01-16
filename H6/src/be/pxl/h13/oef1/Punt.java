package be.pxl.h13.oef1;

public class Punt {
	private int x;
	private int y;
	public static final int MAXIMUMGROOTTE = 99;

	public Punt(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	//Methodes
	public double berekenAfstand(Punt p) {
		return Math.sqrt(((this.getX() - p.getX()) * (this.getX() - p.getX())
				+ ((this.getY() - p.getY()) * (this.getY() - p.getY()))));
	}
	
	public void drukAf() {
		System.out.println("x = " + this.getX() + ", y = " + this.getY());
	}

	private void controleer() {

		if (this.getX() < 0) {
			this.setX(0);
		}

		if (this.getX() > Punt.MAXIMUMGROOTTE) {
			this.setX(MAXIMUMGROOTTE);
		}

		if (this.getY() < 0) {
			this.setY(0);
		}

		if (this.getY() > Punt.MAXIMUMGROOTTE) {
			this.setY(MAXIMUMGROOTTE);
		}
	}

	// Getters en setters
	public void setX(int x) {

		this.x = x;
		controleer();
	}

	public int getX() {
		return this.x;
	}

	public void setY(int y) {

		this.y = y;
		controleer();
	}

	public int getY() {
		return this.y;
	}

}
