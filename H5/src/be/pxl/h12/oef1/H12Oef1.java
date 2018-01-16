package be.pxl.h12.oef1;

import java.util.Arrays;
import java.util.Collections;

public class H12Oef1 {
	public static void main(String[] args) {

		Object[] test = new Object[5];

		char character1 = 'a';
		int number1 = 125;
		long number2 = 1453;
		float number3 = 1.5f;
		double number4 = 10.0 / 3;

		Character character2 = new Character(character1);
		Integer number5 = new Integer(number1);
		Long number6 = new Long(number2);
		Float number7 = new Float(number3);
		Double number8 = new Double(number4);

		test[0] = character2;
		test[1] = number5;
		test[2] = number6;
		test[3] = number7;
		test[4] = number8;

		for (Object obj : test) {
			System.out.println(obj.toString());
		}

		Collections.shuffle(Arrays.asList(test));
		System.out.println("After shuffling");

		for (Object obj : test) {

			if (obj instanceof Character) {
				Character x = (Character) obj;

				if (x.charValue() >= 'A' && x.charValue() <= 'Z') {
					System.out.println(x.charValue() + " is een grote letter");
				} else {
					System.out.println(x.charValue() + " is een kleine letter");
				}

			} else if (obj instanceof Integer) {
				Integer x = (Integer) obj;

				if (x.intValue() >= 0) {
					System.out.println(x.intValue() + " is een integer en de afstand tot het grootste is "
							+ (Integer.MAX_VALUE - x.intValue()));
				} else {
					System.out.println(x.intValue() + " is een integer en de afstand tot het kleinste is "
							+ (Integer.MIN_VALUE + x.intValue()));
				}

			} else if (obj instanceof Long) {
				Long x = (Long) obj;

				if (x.intValue() >= 0) {
					System.out.println(x.intValue() + " is een integer en de afstand tot het grootste is "
							+ (Long.MAX_VALUE - x.intValue()));
				} else {
					System.out.println(x.intValue() + " is een integer en de afstand tot het kleinste is "
							+ (Long.MIN_VALUE + x.intValue()));
				}
				
			} else if (obj instanceof Float) {
				Float x = (Float) obj;
				String intValue = x.intValue()  + "";

				if(!x.isInfinite()) {
					System.out.println(x.floatValue() + " is een float en het aantal cijfers voor de komma " + intValue.length() + " en het aantal cijfers na de komma is " + getAantalCijfersNaKomma((double)x));
				} else {
					System.out.println(x.floatValue() + " is een float en het aantal cijfers voor de komma " + intValue.length() + " en het aantal cijfers na de komma is oneindig");

				}
				
			} else {
				Double x = (Double) obj;
				String intValue = x.intValue() + "";
				
				if(!x.isInfinite()) {
					System.out.println(x.floatValue() + " is een float en het aantal cijfers voor de komma " + intValue.length() + " en het aantal cijfers na de komma is " + getAantalCijfersNaKomma(x));
				} else {
					System.out.println(x.floatValue() + " is een float en het aantal cijfers voor de komma " + intValue.length() + " en het aantal cijfers na de komma is oneindig");

				}
			}
		}

	}

	private static int getAantalCijfersNaKomma(double x) { //Met substring
		
		String value = x + "";
		System.out.println(value);
		int teller = 0;
		boolean kommaHasPassed = false;
		
		for(int i = 0; i < value.length(); i++) {
			
			if(value.charAt(i) == '.') {
				kommaHasPassed = true;
				continue;
			}
			
			if(kommaHasPassed) {
				teller++;
			}
			
		}
		return teller;
	}
}
