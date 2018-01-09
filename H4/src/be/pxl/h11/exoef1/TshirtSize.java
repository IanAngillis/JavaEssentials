package be.pxl.h11.exoef1;

public enum TshirtSize {
	EXTRA_SMAL("XS", 86),
	SMAL("S", 94),
	MEDIUM("M", 102),
	LARGE("L", 110),
	EXTRA_LARGE("XL", 118),
	EXTRA_EXTRA_LARGE("XXL", 128),
	EXTRA_EXTRA_EXTRA_LARGE("3XL", 140);
	
	private String verkorteNotatie;
	private int maximaleBorstmtrek;
	
	private TshirtSize(String verkorteNotatie, int maximaleBorstomtrek) {
		this.verkorteNotatie = verkorteNotatie;
		this.maximaleBorstmtrek = maximaleBorstomtrek;
	}

	public String getVerkorteNotatie() {
		return verkorteNotatie;
	}

	public int getMaximaleBorstmtrek() {
		return maximaleBorstmtrek;
	}
	
	public static TshirtSize getSize(int borstomtrek) {
		for(TshirtSize t : TshirtSize.values()) {
			if(borstomtrek <= t.getMaximaleBorstmtrek()) {
				return t;
			}
		}
		return TshirtSize.values()[TshirtSize.values().length - 1];
	}
	
}
