package opdrachten;

public class RectangleApp {

	public static void main(String[] args) {
		try {
			Rectangle r = new Rectangle(-1, 5);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
