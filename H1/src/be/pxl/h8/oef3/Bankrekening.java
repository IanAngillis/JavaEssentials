package be.pxl.h8.oef3;

import java.util.Scanner;

public class Bankrekening {
	// Opdracht 1
	private String rekeningnummer;
	private String naam;
	private double saldo;
	private double rentepercentage;
	
	// Opdracht 2
	Bankrekening() {
		this("geen", "onbekend", 0, 1.2);
	}

	Bankrekening(String nieuwRekeningnummer, String nieuwNaam, double nieuwSaldo, double nieuwRentepercentage) {
		if (nieuwSaldo < 0) {
			nieuwSaldo = 0;
		}

		if (nieuwRentepercentage < 0) {
			nieuwRentepercentage = 0;
		}

		this.setRekeningnummer(nieuwRekeningnummer);
		this.setNaam(nieuwNaam);
		this.setSaldo(nieuwSaldo);
		this.setRentepercentage(nieuwRentepercentage);
	}

	// Opdracht 3
	// Setters
	public void setNaam(String nieuwNaam) {
		this.naam = nieuwNaam;
	}

	public void setRekeningnummer(String nieuwRekeningnummer) {
		this.rekeningnummer = nieuwRekeningnummer;
	}

	public void setSaldo(double nieuwSaldo) {
		this.saldo = nieuwSaldo;
	}

	public void setRentepercentage(double nieuwRentepercentage) {
		this.rentepercentage = nieuwRentepercentage;
	}

	// Opdracht 4
	// Getter
	public double getSaldo() {
		return this.saldo;
	}

	public double getRentepercentage() {
		return this.rentepercentage;
	}

	public String getNaam() {
		return this.naam;
	}

	public String getRekeningnummer() {
		return this.rekeningnummer;
	}

	// Opdracht 5
	public void stort(double bedrag) {

		if (!this.rekeningBestaat()) {
			return;
		}
		// Extra controle op foutieve ingave
		if (bedrag < 0) {
			bedrag *= -1;
		}

		this.setSaldo(this.getSaldo() + bedrag);
		System.out.printf("na storting van %.2f euro\n", bedrag);
		this.print();

	}

	// Opdracht 6
	public void neemOp(double bedrag) {

		if (!this.rekeningBestaat()) {
			return;
		}
		if (bedrag < 0) {
			bedrag *= -1;
		}

		if (this.getSaldo() == 0) {
			System.out.println("u kan geen geld opnemen");
		} else if (bedrag > this.getSaldo()) {
			System.out.printf("u mag enkel %.2f opnemen\n", this.getSaldo());
			System.out.printf("Na opname van %.2f euro\n", this.getSaldo());
			this.setSaldo(0);
			this.print();
		} else {
			this.setSaldo(this.getSaldo() - bedrag);
			System.out.printf("Na opname van %.2f euro\n", bedrag);
			this.print();
		}
	}

	// Opdracht 7
	public void verrichting(double... verrichtingen) {
		for (double bedrag : verrichtingen) {
			if (bedrag <= 0) {
				this.neemOp(bedrag);
			} else {
				this.stort(bedrag);
			}
		}

	}

	// Opdracht 8
	public void schrijfRenteBij() {
		double bedrag = this.getSaldo() * (this.getRentepercentage() / 100);
		this.setSaldo(this.getSaldo() + bedrag);
		System.out.printf("rente wordt bijgeschreven voor %.2f euro\n", bedrag);
		this.print();
	}

	// Opdracht 9
	public void print() {
		System.out.printf("Saldo op spaarrekening %s op naam van %s bedraagt %.2f euro\n", this.getRekeningnummer(),
				this.getNaam(), this.getSaldo());
	}

	// Opdracht 9, controle en vermijden dubbele code
	private boolean rekeningBestaat() {
		Scanner keyboard = new Scanner(System.in);

		if (this.getRekeningnummer().equals("geen")) {
			System.out.println("Sorry, geen rekeningnummer");
			return false;
		} else {

			if (this.getNaam().equals("onbekend")) {
				System.out.println("Het ziet er naar uit dat uw rekening nog niet op uw naam staat.");
				System.out.println("We hebben u naam nodig voor we de verrichting kunnen uitvoeren.");
				System.out.println("uw naam: ");
				this.setNaam(keyboard.nextLine());
				System.out.println("Uw naam is correct verwerkt in ons systeem");
			}
			return true;
		}

	}

	// opdracht 12 Schrijf bedrag argument over naar argumentrekening, dus opname
	// bij this, stort bij r
	public void schrijfGeldOver(double bedrag, Bankrekening r) {

		if (!(this.rekeningBestaat() && r.rekeningBestaat())) {
			System.out.println("Overschrijven mislukt");
			return;
		}

		if (bedrag > this.getSaldo()) {
			r.stort(this.getSaldo());
			this.neemOp(bedrag);
		} else {
			this.neemOp(bedrag);
			r.stort(bedrag);
		}

		System.out.println("Succesvol overgeschreven");

	}

}
