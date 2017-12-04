package opdracht2;

public class Klas {
	
	private String klasNaam;
	private int aantalStudenten;
	public static final int MAXSTUDENTEN;
	private static int count = 0;
	private static int totaalAantalStudenten = 0;
	
	static{
		MAXSTUDENTEN = 40;
		Klas.setCount(Klas.getCount() + 1);
	}
	
	Klas(){
		this("1TINx", 0);
	}
	
	Klas(String nieuwKlasNaam, int nieuwAantalStudenten){
		
		this.setKlasNaam(nieuwKlasNaam);
		this.setAantalStudenten(nieuwAantalStudenten);
	}
	
	public static void setTotaalAantalStudenten(int nieuwAantalStudenten) {
		Klas.totaalAantalStudenten += nieuwAantalStudenten;
	}
	
	public static int getTotaalAantalStudenten() {
		return Klas.totaalAantalStudenten;
	}
	
	public static int getCount() {
		return Klas.count;
	}
	
	public static void setCount(int nieuwCount) {
		Klas.count = nieuwCount;
	}
	
	public String getKlasNaam() {
		return this.klasNaam;
	}
	
	public int getAantalStudent() {
		return this.aantalStudenten;
	}
	
	public void setKlasNaam(String nieuwKlasNaam){
		this.klasNaam = nieuwKlasNaam;
	}
	
	public void setAantalStudenten(int nieuwAantalStudenten) {
		if(nieuwAantalStudenten > Klas.MAXSTUDENTEN) {
			nieuwAantalStudenten = Klas.MAXSTUDENTEN;
		}
		
		
		Klas.setTotaalAantalStudenten(nieuwAantalStudenten - this.aantalStudenten);
		this.aantalStudenten = nieuwAantalStudenten;
	}
	
	
	
}
