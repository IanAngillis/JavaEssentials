package be.pxl.h10.opdracht8_shapes;

public class Circle extends Shape {
	private double r;
	
	public Circle(int x, int y, double r) {
		this.setPosition(x, y);
		this.setR(r);
	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")" + "\nStraal: " + this.getR();
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.PI * (this.getR() * this.getR());
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.getR();
	}
	
	public boolean equals(Circle s) {
		if(this.getX() != s.getX()) {
			return false;
		}
		
		if(this.getY() != s.getY()) {
			return false;
		}
		
		if(this.getR() != s.getR()) {
			return false;
		}
		
		return true;
		
		
	}
	
	
}
