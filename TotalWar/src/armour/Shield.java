package armour;

public abstract class Shield extends ArmourObject {
	private double missileBlockChanche;
	
	public Shield(double armourValue, double missileBlockChanche) {
		super(armourValue);
		this.setMissileBlockChanche(missileBlockChanche);
	}

	public double getMissileBlockChanche() {
		return missileBlockChanche;
	}

	public void setMissileBlockChanche(double missileBlockChanche) {
		this.missileBlockChanche = missileBlockChanche;
	}
}
