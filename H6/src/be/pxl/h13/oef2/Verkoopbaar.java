package be.pxl.h13.oef2;

import java.time.LocalDate;

public interface Verkoopbaar {
	//variabelen
	public static final double MINPRIJSM2 = 83;
	
	//methoden
	public abstract void wijsEenNotarisToe(String s, LocalDate date);
	public abstract void doeEenBod(double bod, LocalDate date);
	
}
