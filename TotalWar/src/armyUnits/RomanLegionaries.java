package armyUnits;

import enums.UnitSize;
import unitEntity.*;

public class RomanLegionaries extends Unit {

	public RomanLegionaries(UnitSize unitsize) {
		super(unitsize);
		
		for(int i = 0; i < this.getModelsInUnit().length; i++) {
			this.getModelsInUnit()[i] = new Legionary();
		}
	}

	@Override
	public void getUnitStatistics() {
		System.out.println("Unit stats:");
		System.out.println("Health: " + this.getTotalUnitHealth());
		System.out.println("Attack damage: " + this.getModelsInUnit()[0].getTotalEntityAttackDamage());
		System.out.println("Armour: " + this.getModelsInUnit()[0].getTotalEntityArmour());
		
	}

}
