package be.pxl.h13.exoef1;

public class StraatApp {

	public static void main(String[] args) {
		Straat s = new Straat();
		s.voegStructuurToe(new Huis("Jan", new Huisnummer(12, 'a')));
		s.voegStructuurToe(new Huis("Geert", new Huisnummer(12, 'a')));
		s.voegStructuurToe(new Park(new Huisnummer(12, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(13, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(14, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(15, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(16, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(17, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(18, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(19, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(20, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(21, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(22, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(23, 'b')));
		s.voegStructuurToe(new Park(new Huisnummer(24, 'b')));
		
		
		for(int i = 0; i < s.getAantal(); i++) {
			s.getStructuren()[i].beschrijf();
		}
		
	}

}
