package opdrachten;

public class Opdracht2 {

	public static void main(String args[]) {

		System.out.println("min.value = " + Integer.MIN_VALUE);
		System.out.println("max.value = " + Integer.MAX_VALUE);

		Integer iObj = new Integer("1234567");
		Integer jObj = new Integer(1234567);

		System.out.println("waarden van de integer objecten vergeleken : " + iObj.equals(jObj));

		System.out.println("referenties vergeleken : " + (iObj == jObj));

		System.out.println("int-waarden vergeleken met constante: " + (iObj.intValue() == 1234567));
		//

		System.out.println("int-waarden vd objecten vergeleken : " + (iObj.intValue() == jObj.intValue()));
		//

		int k = 255;
		Integer kObj = new Integer(k);
		System.out.println(k);
		System.out.println(kObj.toString());
		//Returns a string object representing the specified integer
		System.out.println(Integer.toString(k));
		//Returns a string representation of the first argument in the radix specified by the second argument
		System.out.println(Integer.toString(k, 2));
		//Returns a string representation of the integer argument as an unsigned integer in base 2
		System.out.println(Integer.toBinaryString(k));
		//Returns a string representation of the integer argument as an unsigned integer in base 16
		System.out.println(Integer.toHexString(k));
		//Returns a string representation of the first argument in the radix specified by the second argument
		System.out.println(Integer.toString(k, 16));
	}//Radix is grondtral

}
