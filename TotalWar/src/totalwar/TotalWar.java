package totalwar;

//Imports
import army.*;
import armyUnits.*;
import enums.UnitSize;


public class TotalWar {

	public static void main(String[] args) {
		Army army = new Army();
		
		army.addUnitToArmy(new RomanLegionaries(UnitSize.LARGE));
		army.addUnitToArmy(new RomanLegionaries(UnitSize.LARGE));
		army.addUnitToArmy(new RomanLegionaries(UnitSize.LARGE));
		army.addUnitToArmy(new RomanLegionaries(UnitSize.LARGE));
		
		Army army2 = new Army(new RomanLegionaries(UnitSize.LARGE), new RomanLegionaries(UnitSize.LARGE), new RomanLegionaries(UnitSize.LARGE));
		
		System.out.println(army.getUnitsInArmy());
		System.out.println(army.getManpowerOfArmy());
		System.out.println(army2.getUnitsInArmy());
		System.out.println(army2.getManpowerOfArmy());

		
		System.out.println("succes");
		
		System.out.println(army2.getArmyComposition()[0].getModelsInUnit()[0].getTotalEntityArmour());
		army2.getArmyComposition()[0].getUnitStatistics();

	}

}
