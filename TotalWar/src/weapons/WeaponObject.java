package weapons;

public abstract class WeaponObject {
	private double weaponDamage;
	
	public WeaponObject(double weapondamage) {
		this.setWeaponDamage(weapondamage);
	}

	public double getWeaponDamage() {
		return weaponDamage;
	}

	public void setWeaponDamage(double weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	
	
}
