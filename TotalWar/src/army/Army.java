package army;

import armyUnits.*;

public class Army {

	private Unit[] armyComposition;
	private int unitsInArmy = 0;

	public Army() {
		this.armyComposition = new Unit[20];
	}

	public Army(Unit... units) {
		this();

		for (Unit unit : units) {
			this.addUnitToArmy(unit);
		}
	}

	public Unit[] getArmyComposition() {
		return armyComposition;
	}

	public void setArmyComposition(Unit[] armyComposition) {
		this.armyComposition = armyComposition;
	}
	
	public int getUnitsInArmy() {
		return this.unitsInArmy;
	}

	public void addUnitToArmy(Unit unit) {

		if (unit instanceof RomanLegionaries) {
			RomanLegionaries temp = (RomanLegionaries) unit;
			this.getArmyComposition()[unitsInArmy] = temp;
		}
		
		this.unitsInArmy++;
	}
	
	public int getManpowerOfArmy() {
		
		int manpower = 0;
		
		for(Unit unit : this.getArmyComposition()) {
			
			if(unit == null) {
				continue;
			}
			
			manpower += unit.getUnitSizeInInt(); 
		}
		
		return manpower;
	}
	
}
