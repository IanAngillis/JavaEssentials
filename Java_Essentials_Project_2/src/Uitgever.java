import java.time.LocalDate;

public class Uitgever {
	// Instantievariabelen
	private String naam;
	private int jaarOprichting;
	private String hoofdkantoor;
	private String website;

	// Constructors
	public Uitgever(String newNaam, String newHoofdkantoor, int newJaarOprichting) {
		this.setNaam(newNaam);
		this.setHoofdkantoor(newHoofdkantoor);
		this.setJaarOprichting(newJaarOprichting);
	}

	// Getters en setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getJaarOprichting() {
		return jaarOprichting;
	}

	public void setJaarOprichting(int jaarOprichting) {

		if (jaarOprichting > LocalDate.now().getYear()) {
			this.jaarOprichting = LocalDate.now().getYear();
		} else {
			this.jaarOprichting = jaarOprichting;
		}
	}

	public String getHoofdkantoor() {
		return hoofdkantoor;
	}

	public void setHoofdkantoor(String hoofdkantoor) {
		this.hoofdkantoor = hoofdkantoor;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "Uitgever [naam=" + naam + ", jaarOprichting=" + jaarOprichting + ", hoofdkantoor=" + hoofdkantoor
				+ ", website=" + website + "]";
	}

}
