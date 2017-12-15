package be.pxl.h10.oef2;

public class VliegtuigReis extends Reis {

	private String vluchtnummer;
	private static double MINPRICEAIRPLANE = 25;
	
	VliegtuigReis(String bestemming) {
		this(bestemming, MINPRICEAIRPLANE, "999");
	}
	
	VliegtuigReis(String bestemming, double prijs, String vluchtnummer){
		super(bestemming, prijs);
		this.setVluchtnummer(vluchtnummer);
	}
	
	@Override
	public void setPrijs(double prijs) {
		
		if(prijs < MINPRICEAIRPLANE) {
			super.setPrijs(MINPRICEAIRPLANE);
		} else {
			super.setPrijs(prijs);
		}
	}

	public String getVluchtnummer() {
		return vluchtnummer;
	}

	public void setVluchtnummer(String vluchtnummer) {
		if(!(this.getBestemming().charAt(0) == vluchtnummer.charAt(0))) {
			vluchtnummer = createVluchtNummer(vluchtnummer);
		}
		this.vluchtnummer = vluchtnummer;
	}
	
	private String createVluchtNummer(String vluchtnr) {
		StringBuilder temp = new StringBuilder(this.getBestemming().charAt(0));
		
		temp.append(vluchtnr);
		
		return temp.toString();
	}
	
	public void print() {
		super.print();
		System.out.println("Vliegtuigreis (vluchtnr " + this.getVluchtnummer() + ")");
	}

	public static double getMINPRICEAIRPLANE() {
		return MINPRICEAIRPLANE;
	}

	public static void setMINPRICEAIRPLANE(double mINPRICEAIRPLANE) {
		MINPRICEAIRPLANE = mINPRICEAIRPLANE;
	}
	
	
	
}
