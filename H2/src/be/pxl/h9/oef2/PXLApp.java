package be.pxl.h9.oef2;

public class PXLApp {
	public static void main(String[] args) {
		String codeTabel[] = { "41TIN1100", "48TIN1130", "41TIN1140", "41TIN1160", "41TIN1240", "41TIN1290",
				"41TIN1300", "42TIN1220", "42TIN1230", "43AON3120", "43AON3130" };
		String[] naamTabel = { "Web Essentials", "Java Essentials", ".Net Essentials", "SQL Essentials", "Desktop OS",
				"Math for IT", "Programming Basics", ".Net Advanced", "Java Advanced", "Programming Expert",
				"Mobile development" };
		int[] stpTabel = { 7, 6, 6, 3, 6, 6, 5, 3, 3, 3, 3 };
		
		Vak [] vakken = new Vak[codeTabel.length];
		
		Leraar l = new Leraar("Jan", "Janssens", 78);
		
		for(int i = 0; i < 5; i++) {
			vakken[i] = new Vak(codeTabel[i], naamTabel[i], stpTabel[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			l.voegVakToe(vakken[i]);
		}
		
		l.print();

	}
}
