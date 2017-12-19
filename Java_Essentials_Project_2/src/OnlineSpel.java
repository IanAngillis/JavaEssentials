
public class OnlineSpel extends Spel {
	
	private String genre;
	private String url;
	
	//Constructor
	public OnlineSpel(String newNaam, Uitgever newUitgever) {
		super(newNaam, newUitgever);
	}
	
	//Getters en setters
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	//tostring
	@Override
	public String toString() {
		return "OnlineSpel{naam= " + this.getNaam() + " , minimumleeftijd = " + this.getMinimumLeeftijd() + ", uitgever=" + this.getUitgever().toString() + "}" + ", genre="+this.getGenre() + ", url=" + this.getUrl();
	}
	
}
