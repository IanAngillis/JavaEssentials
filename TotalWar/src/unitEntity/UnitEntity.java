package unitEntity;

import armour.*; 
import weapons.*;

public abstract class UnitEntity {
	private double totalEntityArmour;
	private double totalEntityAttackDamage;
	private double entityHealth;
	
	//armour
	private Helmet helmet;
	private Chestplate chestplate;
	private Shield shield;
	private ArmourObject [] armourObjects = new ArmourObject[3];
	
	//weapon
	private WeaponObject weapon;
	
	//Constructors
	public UnitEntity(Helmet helmet, Chestplate chestplate, Shield shield, WeaponObject weapon, double entityHealth) {
		
		this.setHelmet(helmet);
		this.setChestplate(chestplate);
		this.setShield(shield);
		this.setWeapon(weapon);
		this.setEntityHealth(entityHealth);
		
		this.getArmourObjects()[0] = this.getHelmet();
		this.getArmourObjects()[1] = this.getChestplate();
		this.getArmourObjects()[2] = this.getShield();
		
		this.setTotalEntityArmour(this.calculateTotalEntityArmour());
		this.setTotalEntityAttackDamage(this.getWeapon().getWeaponDamage());
		
	}
	
	//methoden
	private double calculateTotalEntityArmour() {
		double totalArmour = 0;
		
		for(ArmourObject armourpiece : this.getArmourObjects()) {
			
			if(armourpiece == null) {
				continue;
			} 
				
			totalArmour += armourpiece.getArmourValue();
		}
		
		return totalArmour;
	}
	
	
	
	//Getters en setters
	public double getTotalEntityArmour() {
		return totalEntityArmour;
	}

	public ArmourObject[] getArmourObjects() {
		return armourObjects;
	}

	public void setArmourObjects(ArmourObject[] armourObjects) {
		this.armourObjects = armourObjects;
	}

	public void setTotalEntityArmour(double d) {
		this.totalEntityArmour = d;
	}

	public double getTotalEntityAttackDamage() {
		return totalEntityAttackDamage;
	}

	public void setTotalEntityAttackDamage(double totalEntityAttackDamage) {
		this.totalEntityAttackDamage = totalEntityAttackDamage;
	}

	public double getEntityHealth() {
		return entityHealth;
	}

	public void setEntityHealth(double entityHealth) {
		this.entityHealth = entityHealth;
	}

	public Helmet getHelmet() {
		return helmet;
	}

	public void setHelmet(Helmet helmet) {
		this.helmet = helmet;
	}

	public Chestplate getChestplate() {
		return chestplate;
	}

	public void setChestplate(Chestplate chestplate) {
		this.chestplate = chestplate;
	}

	public Shield getShield() {
		return shield;
	}

	public void setShield(Shield shield) {
		this.shield = shield;
	}

	public WeaponObject getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponObject weapon) {
		this.weapon = weapon;
	}
}
