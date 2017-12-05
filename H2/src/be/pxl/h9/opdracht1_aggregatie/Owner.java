package be.pxl.h9.opdracht1_aggregatie;

public class Owner {
	private String name;
	private Pet pet;
	public Owner(String name) {
	this.name = name;
	}
	public String getName() {
	return name;
	}
	public Pet getPet() {
	return pet;
	}
	public void setPet(Pet pet) {
	this.pet = pet;
	}
}
