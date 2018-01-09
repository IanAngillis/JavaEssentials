package opdrachten;

public class App {

	public static void main(String[] args) {
		
		for(Weekday w : Weekday.values()) {
			System.out.println((w.ordinal()+1)  +" " + w);
		}
	}
}
