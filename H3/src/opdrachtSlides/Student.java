package opdrachtSlides;

public class Student extends Persoon {

	private int leerkrediet;
	private String studentenNummer;
	private String opleiding;
	private static int countStudent = 0;
	
	{
		setCountStudent(getCountStudent() + 1);
	}
	
	public Student() {
		this("onbekend", "onbekend", "15999999", "opleiding");
	}
	
	public Student(String voornaam, String naam) {
		this(voornaam, naam, "159999999", "opleiding");
	}
	
	public Student(String voornaam, String naam, String studentennummer, String opleiding) {
		super(voornaam, naam);
		this.setStudentenNummer(studentennummer);
		this.setOpleiding(opleiding);
		this.setLeerkrediet(140);
	}
	
	public Student(Student s) {
		this(s.getVoornaam(), s.getNaam(), s.getStudentenNummer(), s.getOpleiding());
	}
	
	
	//Methodes
		public void wijzigLeerkrediet(int newLeerkrediet) {
			if(this.getLeerkrediet() + newLeerkrediet < 0) {
				this.setLeerkrediet(0);
			} else if (this.getLeerkrediet() + newLeerkrediet > 140) {
				this.setLeerkrediet(140);
			} else {
				this.setLeerkrediet(this.getLeerkrediet() + newLeerkrediet);
			}
		}

	
	//Getters en setters
	public int getLeerkrediet() {
		return leerkrediet;
	}

	public void setLeerkrediet(int leerkrediet) {
		this.leerkrediet = leerkrediet;
	}
	
	public String getStudentenNummer() {
		return studentenNummer;
	}

	public void setStudentenNummer(String studentenNummer) {
		this.studentenNummer = studentenNummer;
	}

	public String getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(String opleiding) {
		this.opleiding = opleiding;
	}


	@Override
	public String toString() {
		return "Student [leerkrediet=" + leerkrediet + ", studentenNummer=" + studentenNummer + ", opleiding="
				+ opleiding + "]";
	}

	public static int getCountStudent() {
		return countStudent;
	}

	public static void setCountStudent(int countStudent) {
		Student.countStudent = countStudent;
	}
	
	
	

}
