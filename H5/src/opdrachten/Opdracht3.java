package opdrachten;

import java.math.BigInteger;

public class Opdracht3 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1000");
		
		a = berekenFaculteit(a);
		
		System.out.println(a);
	}
	
	public static BigInteger berekenFaculteit(BigInteger a) {
		BigInteger product = new BigInteger("1");
		
		for(int i = 0; i < a.intValue(); i++) {
			
			BigInteger value = new BigInteger((a.intValue()-i) + "");
			
			
			product = product.multiply(value);
										//BigInteger(valueof.(insert number))
		}
		
		return product;
	}
}
