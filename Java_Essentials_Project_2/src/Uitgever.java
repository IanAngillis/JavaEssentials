import java.time.LocalDate;
import java.time.Period;

public class Uitgever {
	// Instantievariabelen
	private String naam;
	private LocalDate datumOprichting;
	private String hoofdkantoor;
	private String website;

	// Constructors
	public Uitgever(String newNaam, String newHoofdkantoor, int newJaarOprichting, int maand, int dag) {
		this.setNaam(newNaam);
		this.setHoofdkantoor(newHoofdkantoor);
		this.setDatumOprichting(newJaarOprichting, maand, dag);
	}
	
	public long getAantalMaandenVanafOprichting() {
		
		Period difference = Period.between(LocalDate.now(), this.getDatumOprichting());
		
		return difference.toTotalMonths();
	}

	// Getters en setters
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public LocalDate getDatumOprichting() {
		return datumOprichting;
	}

	public void setDatumOprichting(int jaarOprichting, int maand, int dag) {

		if (jaarOprichting > LocalDate.now().getYear()) {
			this.datumOprichting = LocalDate.of(jaarOprichting, LocalDate.now().getMonthValue(), 1);
		} else {
			this.datumOprichting = LocalDate.of(jaarOprichting, maand, dag);
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
		return "Uitgever [naam=" + naam + ", jaarOprichting=" + datumOprichting.toString() + ", hoofdkantoor=" + hoofdkantoor
				+ ", website=" + website + "]";
	}

}
