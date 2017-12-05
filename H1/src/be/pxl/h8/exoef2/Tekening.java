package be.pxl.h8.exoef2;

public class Tekening {

	public void tekenDriehoek(int grootte, char teken) {
		StringBuilder temp = new StringBuilder("");

		for (int i = 0; i < grootte; i++) {

			for (int k = 0; k < grootte - (i + 1); k++) {
				temp.append(" ");
			}

			for (int l = 0; l < (i + 1); l++) {
				temp.append(teken);
			}

			System.out.println(temp.toString());
			temp.setLength(0);

		}

	}

	public void tekenRechthoekVol(int breedte, int hoogte) {

		for (int i = 0; i < hoogte; i++) {

			for (int j = 0; j < breedte; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void tekenRechthoekLeeg(int breedte, int hoogte) {
		for (int i = 0; i < hoogte; i++) {

			for (int j = 0; j < breedte; j++) {
				
				if(i == 0 || i == hoogte -1) {
					System.out.print("* ");
					continue;
				}
				if(j == 0 || j == (breedte-1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
