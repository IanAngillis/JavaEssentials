package be.pxl.h10.oef1;

public class Manager extends Werknemer {
	
	//Instantie- en klassevariabelen
	private double bonus;
	private static int managerCount = 0;
	
	{
		setManagerCount(getManagerCount() + 1);
	}

	public Manager(String voornaam, String naam, double salaris, String functie) {
		this(voornaam, naam, salaris, functie, 50);
	}

	public Manager(String voornaam, String naam, double salaris, String functie, double bonus) {
		super(voornaam, naam, salaris, functie);
		this.setBonus(bonus);
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalaris() {
		return super.getSalaris() + bonus;
		
	}

	public static int getManagerCount() {
		return managerCount;
	}

	public static void setManagerCount(int managerCount) {
		Manager.managerCount = managerCount;
	}
	
	public static double getProcAandeelManager() {
		double procAandeelManager = ((double)Manager.getManagerCount() / Werknemer.getAantalWerknemers()) * 10000;
		int temp = (int)procAandeelManager;
		procAandeelManager = (double)temp/100;
		
		return procAandeelManager;
	}
}
