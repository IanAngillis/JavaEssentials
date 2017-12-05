package be.pxl.h8.oef5;

public class AutoApp {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		Auto a2 = new Auto("Tesla", "X", 2016, "Zwart", 160);
		Auto a3 = new Auto(a1);
		a2.setMaxSnelheid(250);
		
		Auto[] autos = new Auto[3];
		autos[0] = a1;
		autos[1] = a2;
		autos[2] = a3;
		
		for(Auto auto: autos) {
			auto.print();
		}
	}

}
