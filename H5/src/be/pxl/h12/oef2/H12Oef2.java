package be.pxl.h12.oef2;

import java.util.Scanner;
import java.util.Random;

public class H12Oef2 {

	public static void main(String[] args) {
		//Aanmaken variabelen
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		Integer aantalGetallen;
		Integer minimumWaarde;
		Integer maximumWaarde;
		Integer [] integerTabel;
		float gemiddelde = 0;
		
		//Opvragen getallen
		System.out.println("Aantal getallen: ");
		aantalGetallen = new Integer(keyboard.nextInt());
		
		System.out.println("Minimumwaarde: ");
		minimumWaarde = new Integer(keyboard.nextInt());
		
		System.out.println("Maximumwaarde: ");
		maximumWaarde = new Integer(keyboard.nextInt());
		
		//Controle maximum en minimumgetallen
		if(minimumWaarde > maximumWaarde) {
			Integer temp = minimumWaarde;
			minimumWaarde = maximumWaarde;
			maximumWaarde = temp;
		}
		
		System.out.println("Minimumwaarde na wisseling: " + minimumWaarde);
		System.out.println("Maximumwaarde na wisseling: " + maximumWaarde);
		
		integerTabel = new Integer [aantalGetallen];
		
		//Tabel vullen met random getallen
		for(int i = 0; i < integerTabel.length; i++) {
			
			integerTabel[i] = new Integer(rand.nextInt(maximumWaarde - minimumWaarde + 1) + minimumWaarde);
		}
		
		for(Integer i : integerTabel) {
			System.out.println(i);
			gemiddelde += i.intValue();
		}
		
		System.out.printf("Het gemiddelde is %.2f", gemiddelde/aantalGetallen);
		
		keyboard.close();
	}

}
