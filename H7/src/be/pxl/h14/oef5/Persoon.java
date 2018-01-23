package be.pxl.h14.oef5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoon {
	
	private String naam;
	private LocalDate geboorteDatum;
	
	public Persoon(String string, int dag, int maand, int jaar) {
		this.setNaam(string);
		this.setGeboorteDatum(LocalDate.of(jaar, maand, dag));
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public LocalDate getGeboorteDatum() {
		return geboorteDatum;
	}

	public void setGeboorteDatum(LocalDate geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoon other = (Persoon) obj;
		
		if(this.getNaam().equals(other.getNaam())) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return this.getNaam() + " " + this.getGeboorteDatum().getDayOfMonth() + " " + this.getGeboorteDatum().getMonth() + " " + this.getGeboorteDatum().getYear();
	}
	
	public int aantalDagenTotVerjaardag() {
		long aantalDagen = 0;
		if(this.getGeboorteDatum().getDayOfMonth() == LocalDate.now().getDayOfMonth() && this.getGeboorteDatum().getMonthValue() == LocalDate.now().getMonthValue()) {
			System.out.println("Today is your birthday");
		}
		
		if(birthdayThisYearAlreadyPassed()) {
			aantalDagen = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear() + 1, this.getGeboorteDatum().getMonthValue(), this.getGeboorteDatum().getDayOfMonth()));
		} else {
			aantalDagen = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), this.getGeboorteDatum().getMonthValue(), this.getGeboorteDatum().getDayOfMonth()));
		}
		
		return (int)aantalDagen;
	}
	
	private boolean birthdayThisYearAlreadyPassed() {
		LocalDate temp = LocalDate.now();
		
		if(this.getGeboorteDatum().getMonthValue() < temp.getMonthValue()) {
			return true;
		} else if(this.getGeboorteDatum().getMonthValue() == temp.getMonthValue()) {
			if(this.getGeboorteDatum().getDayOfMonth() < temp.getDayOfMonth()) {
				return true;
			}
		}
		
		return false;	
	}
	
}
