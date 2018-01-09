package opdrachten;

public enum Weekday {
	MAANDAG(true), DINSDAG(true), WOENSDAG(true), DONDERDAG(true), VRIJDAG(true), ZATERDAG(false), ZONDAG(false);

	private boolean isWeekday;

	private Weekday(boolean isWeekday) {
		this.isWeekday = isWeekday;
	}

	public boolean isWeekday() {
		return isWeekday;
	}

	public String toString() {

		if (this.isWeekday()) {
			return this.name() + " (weekdag)";
		} else {
			return this.name() + " (weekenddag)";
		}
	}
}
