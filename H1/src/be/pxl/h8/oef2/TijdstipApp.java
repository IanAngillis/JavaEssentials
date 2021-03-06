package be.pxl.h8.oef2;

public class TijdstipApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tijdstip t1 = new Tijdstip(24, 0, 0);
		Tijdstip t2 = new Tijdstip(3665);
		Tijdstip t3 = new Tijdstip(t2);
		Tijdstip t4 = new Tijdstip(12, 0, 0);
		Tijdstip [] tijdStipArray = new Tijdstip[4];
		
		tijdStipArray[0] = t1;
		tijdStipArray[1] = t2;
		tijdStipArray[2] = t3;
		tijdStipArray[3] = t4;
		
		System.out.println("Tijdstip 1");
		System.out.println("Uren: " + t1.getUren());
		System.out.println("Minuten: " + t1.getMinuten());
		System.out.println("Seconden: " + t1.getSeconden());
		System.out.println();
		System.out.println("Tijdstip 2");
		System.out.println("Uren: " + t2.getUren());
		System.out.println("Minuten: " + t2.getMinuten());
		System.out.println("Seconden: " + t2.getSeconden());
		System.out.println();
		System.out.println("Tijdstip 3");
		System.out.println("Uren: " + t3.getUren());
		System.out.println("Minuten: " + t3.getMinuten());
		System.out.println("Seconden: " + t3.getSeconden());
		
		System.out.println(t1.toStringTijd(false));
		System.out.println(t1.toStringTijd(true));
		System.out.println(t1.toStringTechnisch());
		
		System.out.println("--------------------");
		
		for(int i = 0; i < tijdStipArray.length; i++) {
			System.out.println(tijdStipArray[i].toStringTijd(true));
		}
		
		t1.voegSecondenToe(15000);
		t2.voegUrenToe();
		t3.voegMinutenToe();
		t4.voegMinutenToe(125);
		
		for(int i = 0; i < tijdStipArray.length; i++) {
			System.out.println(tijdStipArray[i].toStringTijd(true));
		}
	}

}
