package be.pxl.h13.oef1;

import java.util.Random;

public class ActeurApp {

	public static void main(String[] args) {
		Random rand = new Random();
		Punt [] puntenTab = new Punt [100];
		
		for(int i = 0; i < puntenTab.length; i++) {
			
			puntenTab[i] = new Punt(rand.nextInt(100), rand.nextInt(100));
		}
		
		for(Punt p : puntenTab) {
			p.drukAf();
		}
		
		System.out.println("De afstand tussen het eerste en laatste punt is " + puntenTab[0].berekenAfstand(puntenTab[puntenTab.length-1]));
		
		Egel egel = new Egel(10, 10);
		Konijn konijn = new Konijn(12, 12);
		
		System.out.println(egel.interageer(konijn));
		konijn.beschrijf();
		
		
		konijn.stapLinks();
		egel.stapRechts();
		
		Acteur [] act = new Acteur[2];
		act[0] = egel;
		act[1] = konijn;
		
		for(Acteur acteur : act) {
			acteur.beschrijf();
		}
	}

}
