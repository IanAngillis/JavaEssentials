package be.pxl.h10.opdracht8_shapes;

import java.awt.Rectangle;


public class ShapeApp {

	public static void main(String[] args) {
		Circle c1 = new Circle(0, 0, 5);
		Circle c2 = new Circle(0, 0, 5);
		
		System.out.printf("Oppervlakte:  %.2f\n", c1.getArea());
		System.out.printf("Omtrek:  %.2f\n", c1.getPerimeter());
		
		System.out.println("Zonder tostring" + c1);
		System.out.println("Met tostring: " + c1.toString());
		
		System.out.println(c1.equals(c2));
		
	}

}
