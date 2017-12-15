package be.pxl.h10.oef2;

public class ReisApp {

	public static void main(String[] args) {
		
		GeboekteReis g = new GeboekteReis("Ian Angillis", 5);
		
		g.voegReisToe(new TreinReis("Zaventem"));
		g.voegReisToe(new VliegtuigReis("Madrid", 65, "MX478"));
		g.voegReisToe(new VliegtuigReis("Barcelona"));
		g.voegReisToe(new TreinReis("Rosas", 10.75, false ,"local train" ));
		
		g.print();
		
	}

}
