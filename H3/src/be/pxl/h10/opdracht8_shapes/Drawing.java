package be.pxl.h10.opdracht8_shapes;

public class Drawing {

	private Shape[] shapeArray;

	public Drawing(int aantalShapes) {
		shapeArray = new Shape[aantalShapes];
	}

	public void addShape(Shape s) {

		if (isPresent(s) || getFreeLocation() == -1) {
			return;
		}

		this.getShapeArray()[this.getFreeLocation()] = s;
	}

	private int getFreeLocation() {

		for (int i = 0; i < shapeArray.length; i++) {
			if (shapeArray[i] == null) {
				return i;
			}
		}

		return -1;
	}
	
	public void remove(Shape s) {
		
		for(int i = 0; i < this.getShapeArray().length ; i++) {
			if(this.getShapeArray()[i] == s) {
				this.getShapeArray()[i] = null;
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < this.getShapeArray().length; i++) {
			System.out.println(this.getShapeArray()[i].toString());
		}
	}

	public void clear() {

		for (int i = 0; i < this.getShapeArray().length; i++) {
			this.getShapeArray()[i] = null;
		}
	}

	public boolean equals(int currentShape, Shape s) {
		return this.getShapeArray()[currentShape].getClass() == s.getClass();

	}

	private boolean isPresent(Shape s) {

		for (int i = 0; i < shapeArray.length; i++) {
			if (shapeArray[i] == s) {
				return true;
			}
		}

		return false;
	}

	// Getters en setters
	public Shape[] getShapeArray() {
		return shapeArray;
	}

	public void setShapeArray(Shape[] shapeArray) {
		this.shapeArray = shapeArray;
	}

}
