package be.pxl.h8.exoef2;

public class TekenApp {

	public static void main(String[] args) {
		Tekening t = new Tekening();
		
		t.tekenDriehoek(9, '$');
		System.out.println();
		t.tekenRechthoekVol(6, 4);
		System.out.println();
		t.tekenRechthoekLeeg(6, 4);
	}

}
