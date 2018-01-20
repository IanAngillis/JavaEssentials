package armyUnits;

import unitEntity.*;
import enums.*;

public abstract class Unit {
	
	private UnitSize unitsize;
	private UnitEntity [] modelsInUnit;
	private int unitMorale;
	
	//Constructor
	public Unit(UnitSize unitsize) {
		this.setUnitsize(unitsize);
		this.modelsInUnit = new UnitEntity[unitsize.getUnitsize()];
	}
	
	//Methoden
	public double getTotalUnitHealth() {
		double totalUnitHealth = 0;
		
		for(int i = 0; i < this.getModelsInUnit().length; i++) {
			totalUnitHealth += this.getModelsInUnit()[i].getEntityHealth();
		}
		
		return totalUnitHealth;
	}
	
	//Abstract methodes
	public abstract void getUnitStatistics();
	
	//Getters en setters
	public int getUnitMorale() {
		return this.unitMorale;
	}
	
	public void setUnitMorale(int unitMorale) {
		this.unitMorale = unitMorale;
	}
	
	public UnitSize getUnitsize() {
		return unitsize;
	}
	
	public int getUnitSizeInInt() {
		return this.getUnitsize().getUnitsize();
	}


	public void setUnitsize(UnitSize unitsize) {
		this.unitsize = unitsize;
	}


	public UnitEntity[] getModelsInUnit() {
		return modelsInUnit;
	}


	public void setModelsInUnit(UnitEntity[] modelsInUnit) {
		this.modelsInUnit = modelsInUnit;
	}
	
	
}
