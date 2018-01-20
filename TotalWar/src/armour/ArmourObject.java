package armour;

public abstract class ArmourObject {
	private double armourValue;
	
	public ArmourObject(double armourValue) {
		this.setArmourValue(armourValue);
	}
	
	public double getArmourValue() {
		return this.armourValue;
	}

	public void setArmourValue(double armourValue) {
		this.armourValue = armourValue;
	}
}
