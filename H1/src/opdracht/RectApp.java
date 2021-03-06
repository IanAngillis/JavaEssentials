package opdracht;

public class RectApp {

	public static void main(String[] args) {

		System.out.println("This program uses a rectangle");
		Rectangle rect = new Rectangle();

		System.out.println("Height: " + rect.getHeight());
		System.out.println("Width: " + rect.getWidth());
		System.out.println("Position: " + "(" + rect.getX() + "," + rect.getY() + ")");
		System.out.println();

		// Declare explicit value
		rect.setX(1);
		rect.setY(2);
		rect.setHeight(20);
		rect.setWidth(50);

		System.out.println("Information rectangle 1:");
		System.out.println("Height: " + rect.getHeight());
		System.out.println("Height: " + rect.getWidth());
		System.out.println("Position: " + "(" + rect.getX() + "," + rect.getY() + ")");
		System.out.println();

		Rectangle rect2 = new Rectangle();

		rect2.setX(10);
		rect2.setY(20);
		rect2.setHeight(50);
		rect2.setWidth(100);

		System.out.println("Information rectangle 2:");
		System.out.println("Height: " + rect2.getHeight());
		System.out.println("Height: " + rect2.getWidth());
		System.out.println("Position: " + "(" + rect2.getX() + "," + rect2.getY() + ")");
		System.out.println();
		
		rect2.grow(30,  40);
		System.out.println("Height: " + rect2.getHeight());
		System.out.println("Height: " + rect2.getWidth());
		System.out.println();
		System.out.println("Oppervlakte: " + rect2.getArea());
		System.out.println("Perimeter: " + rect2.getPerimeter());
		
		System.out.println("----------------------------------------");
		rect2.setHeight(-50);
		rect2.setWidth(-50);
		
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getWidth());
		rect2.grow(-40, -60);
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getWidth());
		rect2.grow(20);
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getWidth());
		
		Rectangle rect3 = new Rectangle(90, 100, 5, 6);
		
		Rectangle rect4 = new Rectangle(rect3);
		
		System.out.println("Information rectangle 3:");
		System.out.println("Height: " + rect3.getHeight());
		System.out.println("Height: " + rect3.getWidth());
		System.out.println("Position: " + "(" + rect3.getX() + "," + rect3.getY() + ")");
		System.out.println();
		
		System.out.println("Information rectangle 4:");
		System.out.println("Height: " + rect4.getHeight());
		System.out.println("Height: " + rect4.getWidth());
		System.out.println("Position: " + "(" + rect4.getX() + "," + rect4.getY() + ")");
		System.out.println();
		
	}

}
