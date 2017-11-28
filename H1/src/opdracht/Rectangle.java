package opdracht;

public class Rectangle {

	// Public: de variabelen zijn direct aanspreekbaar en aanpasbaar
	// Private: de variabelen zijn nie tdirect aanspreekbaar
	private int x;
	private int y;
	private int height;
	private int width;

	//Default constructor
	public Rectangle() {
		this(0, 0, 0, 0);
	}
	
	//Parameter constructors
	public Rectangle(int newWidth, int newHeight) {
		this(newWidth, newHeight, 0, 0);
	}

	public Rectangle(int newWidth, int newHeight, int newX, int newY) {
		setX(newX);
		setY(newY);
		setWidth(newWidth);
		setHeight(newHeight);
	}
	
	public Rectangle(Rectangle r) {
		this(r.getWidth(), r.getHeight(), r.getX(), r.getY());
		
	}

	public void setX(int newX) {
		this.x = newX;
	}

	public void setY(int newY) {
		this.y = newY;
	}

	public void setHeight(int newHeight) {

		if (newHeight < 0) {
			newHeight *= -1;
		}

		this.height = newHeight;
	}

	public void setWidth(int newWidth) {

		if (newWidth < 0) {
			newWidth *= -1;
		}

		this.width = newWidth;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public double getArea() {
		return this.getHeight() * this.getWidth();
	}

	public int getPerimeter() {
		return ((2 * this.getHeight()) + (2 * this.getWidth()));
	}

	public void grow(int dw, int dh) {
		setHeight(this.getHeight() + dh);
		setWidth(this.getWidth() + dw);
	}

	public void grow(int d) {
		setHeight(this.getHeight() + d);
		setWidth(this.getWidth() + d);
	}

	public void setPosition(int xPos, int yPos) {
		setX(xPos);
		setY(yPos);
	}

}
