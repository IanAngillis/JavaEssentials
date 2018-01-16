package be.pxl.h13.exoef1;

public class Straat implements Doorloopbaar {
	private int multiplier = 0;
	private Structuur[] structuren;

	public Straat() {
		structuren = new Structuur[Doorloopbaar.MAX + (Doorloopbaar.MAX * multiplier)];
	}

	@Override
	public int getAantal() {
		int aantalObjectenInArray = 0;

		for (int i = 0; i < this.getStructuren().length; i++) {

			if (this.getStructuren()[i] != null) {
				aantalObjectenInArray++;
			}
		}

		return aantalObjectenInArray;
	}

	@Override
	public Object getWaarde(int x) {

		if (x < 0) {
			x = 0;
		}

		if (x >= (Doorloopbaar.MAX + (Doorloopbaar.MAX * multiplier))) {
			x = (Doorloopbaar.MAX + (Doorloopbaar.MAX * multiplier)) - 1;
		}

		return this.getStructuren()[x];
	}

	public Structuur[] getStructuren() {
		return structuren;
	}

	public void setStructuren(Structuur[] structuren) {
		this.structuren = structuren;
	}

	public void voegStructuurToe(Structuur s) {
		
		if(this.getAantal() == (Doorloopbaar.MAX + (Doorloopbaar.MAX * multiplier))) {
			multiplier++;
			Structuur [] temp = this.getStructuren();
			
			this.structuren = new Structuur[temp.length * 2];
			
			for(int i = 0; i < temp.length; i++) {
				this.structuren[i] = temp[i];
			}
		}
		
		
		if(this.getAantal() == 0) {
			this.getStructuren()[0] = s;
			return;
		}
		
		
		if (structuurIsAlreadyInArray(s)) {
			return;
		}

		if (this.getAantal() < (Doorloopbaar.MAX  + (Doorloopbaar.MAX * multiplier))) {
			this.getStructuren()[this.getAantal()] = s;
		}
	}

	private boolean structuurIsAlreadyInArray(Structuur s) {
		
		for (int i = 0; i < this.getAantal(); i++) {
			if (this.getStructuren()[i].getNummer().equals(s.getNummer())) {
				return true;
			}
		}

		return false;
	}

}
