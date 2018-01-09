package be.pxl.h11.exoef1;

public enum Kleur {
	ROOD, GROEN, BLAUW, WIT;

	public static Kleur getColor(String color) {

		for (Kleur k : Kleur.values()) {
			if (k.name().equals(color)) {
				return k;
			}
		}
		
		return null;
	}
}
