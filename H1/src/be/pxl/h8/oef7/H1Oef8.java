package be.pxl.h8.oef7;

import java.util.Random;
import java.util.Scanner;

public class H1Oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("x: ");
		int x = keyboard.nextInt();
		
		int y = rand.nextInt(6000 - 5000) + 1 + 5000;
		
		double outcome = Math.E * Math.sqrt((Math.pow(x, 2) + Math.pow(y, 3)));
		
		System.out.printf("%.3f is de uitkomst.", outcome);
		
		keyboard.close();
	}

}
