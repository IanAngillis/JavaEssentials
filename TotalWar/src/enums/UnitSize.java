package enums;

public enum UnitSize {
	SMALL(45), MEDIUM(80), LARGE(120), ULTRA(160);
	
	private int unitsize;
	
	private UnitSize(int unitsize) {
		this.setUnitsize(unitsize);
	}

	public int getUnitsize() {
		return unitsize;
	}

	private void setUnitsize(int unitsize) {
		this.unitsize = unitsize;
	}
	
	
}
