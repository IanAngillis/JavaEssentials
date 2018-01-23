package opdrachten;

public class Rectangle {
	private int height;
	private int width;
	
	public Rectangle(int width, int height){
		setHeight(height);
		setWidth(width);
	}
	
	public void setHeight(int height){
		if(height < 0) {
			throw new RuntimeException("Negative height");
		}
		this.height = height;
	}
	
	public void setWidth(int width){
		if(width < 0) {
			throw new RuntimeException("Negative width");
		}
		this.width = width;
	}
}
