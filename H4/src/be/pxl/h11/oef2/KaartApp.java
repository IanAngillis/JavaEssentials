package be.pxl.h11.oef2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class KaartApp {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		Kaart[] kaarten = new Kaart[52];
		int index = 0;
		boolean gameHasWinner = false;
		
		int computerCardIndex;
		int playerCardIndex;
		
		//Create carddeck
		for (int i = 0; i < Soort.values().length; i++) {

			for (int j = 0; j < Ranking.values().length; j++) {

				kaarten[index] = new Kaart(Ranking.values()[j], Soort.values()[i]);
				index++;
			}
		}
		
		Collections.shuffle(Arrays.asList(kaarten));
		
		while(!gameHasWinner) {
			computerCardIndex = rand.nextInt(52);
			
			System.out.println("Trek een kaart (nummer tussen 0 en 51)");
			playerCardIndex = keyboard.nextInt();
			
			while(playerCardIndex < 0 || playerCardIndex > 51) {
				System.out.println("Trek een kaart (nummer tussen 0 en 51)");
				playerCardIndex = keyboard.nextInt();
			}
			
			if(kaarten[playerCardIndex].getRanking().ordinal() > kaarten[computerCardIndex].getRanking().ordinal()) {
				System.out.println("winnaar speler " + kaarten[playerCardIndex].getSoort() + " " + kaarten[playerCardIndex].getRanking());
				System.out.println("verliezer computer "  + kaarten[computerCardIndex].getSoort() + " " + kaarten[computerCardIndex].getRanking());
				gameHasWinner = true;
				
			} else if (kaarten[playerCardIndex].getRanking().ordinal() == kaarten[computerCardIndex].getRanking().ordinal()){
				System.out.println("Gelijkspel");
				System.out.println("speler " + kaarten[playerCardIndex].getSoort() + " " + kaarten[playerCardIndex].getRanking());
				System.out.println("computer "  + kaarten[computerCardIndex].getSoort() + " " + kaarten[computerCardIndex].getRanking());
				
			} else {
				System.out.println("winnaar computer "  + kaarten[computerCardIndex].getSoort() + " " + kaarten[computerCardIndex].getRanking());
				System.out.println("verliezer speler " + kaarten[playerCardIndex].getSoort() + " " + kaarten[playerCardIndex].getRanking());
				gameHasWinner = true;
			}
		}
		
		keyboard.close();
	}

}
