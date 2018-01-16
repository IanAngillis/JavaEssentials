package be.pxl.h13.oef2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TeVerkopenBouwGrond extends BouwGrond {
	
	private String notaris;
	private LocalDate datumTeKoop;
	private double hoogsteBod;
	private LocalDate datumHoogsteBod;
	
	public TeVerkopenBouwGrond(String perceelNr, double PerceelGrootte) {
		super(perceelNr, PerceelGrootte);
		// TODO Auto-generated constructor stub
	}
	
	//Vragen stellen aan lector, Interface forceert methodes niet

	public String getNotaris() {
		return notaris;
	}

	public void setNotaris(String notaris) {
		this.notaris = notaris;
	}

	public LocalDate getDatumTeKoop() {
		return datumTeKoop;
	}

	public void setDatumTeKoop(LocalDate datumTeKoop) {
		this.datumTeKoop = datumTeKoop;
	}

	public double getHoogsteBod() {
		return hoogsteBod;
	}

	public void setHoogsteBod(double hoogsteBod) {
		this.hoogsteBod = hoogsteBod;
	}

	public LocalDate getDatumHoogsteBod() {
		return datumHoogsteBod;
	}

	public void setDatumHoogsteBod(LocalDate datumHoogsteBod) {
		this.datumHoogsteBod = datumHoogsteBod;
	}

	@Override
	public void wijsEenNotarisToe(String s, LocalDate date) {
		if(this.getNotaris() != null && this.getDatumTeKoop() != null) {
			return;
		}
		
		this.setNotaris(s);
		this.setDatumTeKoop(date);
	}

	@Override
	public void doeEenBod(double bod, LocalDate date) {
		
		if(this.getNotaris() == null || ChronoUnit.DAYS.between(this.getDatumTeKoop(), date) < 10) {
			System.out.println("Bod niet geregistreerd. Geen notaris of bod te vroeg.");
			return;
		}
		
		if(bod > this.getHoogsteBod() && bod > getMinimumPrice(bod)) {
			
			System.out.println("Perceelnr: " + this.getPerceelNr());
			System.out.println("Perceelgrootte: " + this.getPerceelGrootte());
			System.out.println("Bouwvoorschrift: " + this.getBouwVoorschrift());
			System.out.println("Te koop gesteld op " + this.getDatumTeKoop().format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy")) + " bij notaris " + this.getNotaris());
			
			if(this.getDatumHoogsteBod() == null) {
				System.out.println("Dit is het eerste bod.");
			} else {
				System.out.println("Vorig hoogste bod: " + this.getHoogsteBod() + " geregistreerd op " + this.getDatumHoogsteBod().format(DateTimeFormatter.ofPattern("dd/MM/yy")));
			}
			
			System.out.println("Nieuw hoogste bod: " + bod + " geregistreerd op " + date.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
			
			this.setHoogsteBod(bod);
			this.setDatumHoogsteBod(date);
		}
		
	}
	
	private double getMinimumPrice(double bod) {
		return (this.getPerceelGrootte() * 100) * Verkoopbaar.MINPRIJSM2;
	}
	
	

}
