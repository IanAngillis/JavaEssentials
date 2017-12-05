package be.pxl.h8.exoef4;

import java.util.Scanner;

public class H8ExOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int x, y;
		double outcome;
		
		System.out.println("Reël getal x: ");
		x = keyboard.nextInt();
		
		System.out.println("Reël getal y: ");
		y = keyboard.nextInt();
		
		outcome = Math.PI * Math.sqrt((Math.pow(x, 4) + Math.pow(y, 4)));
		
		System.out.printf("De uitkomst is %.1f", outcome);
		
		keyboard.close();
	}

}
