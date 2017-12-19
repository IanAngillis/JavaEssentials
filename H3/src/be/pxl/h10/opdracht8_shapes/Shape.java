package be.pxl.h10.opdracht8_shapes;

public abstract class Shape {
	private int x;
	private int y;
	private static int count = 0;
	
	public void setPosition(int newX, int newY){
		this.x = newX;
		this.y = newY;
		Shape.setCount(Shape.getCount() + 1);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Shape.count = count;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	
}
