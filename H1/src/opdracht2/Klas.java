package opdracht2;

public class Klas {
	
	private String klasNaam;
	private int aantalStudenten;
	public static final int MAXSTUDENTEN;
	public static int count = 0;
	
	static{
		MAXSTUDENTEN = 40;
		count++;
	}
	
	Klas(){
		this("1TINx", 0);
	}
	
	Klas(String nieuwKlasNaam, int nieuwAantalStudenten){
		
		this.setKlasNaam(nieuwKlasNaam);
		this.setAantalStudenten(nieuwAantalStudenten);
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
		this.aantalStudenten = nieuwAantalStudenten;
	}
	
	
	
}