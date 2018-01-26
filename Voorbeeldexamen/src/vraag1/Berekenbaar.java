package vraag1;

public interface Berekenbaar {
	public static final int BTW = 21;
	
	public abstract double totalePrijs();
	public default double totalePrijsExclBtw() {
		double divider = ((double)Berekenbaar.BTW / 100) + 1;
		
		return totalePrijs()/divider;
	};
}
