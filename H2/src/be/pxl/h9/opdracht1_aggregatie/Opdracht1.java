package be.pxl.h9.opdracht1_aggregatie;

public class Opdracht1 {

	public static void main(String[] args) {
		//Objecten aanmaken
		Owner owner = new Owner("Guido");
		Pet pet = new Pet("Blacky");
		
		//Koppel het dier aan zijn baas
		owner.setPet(pet);
		
		System.out.println(owner.getName() + " heeft een dier met naam " + (owner.getPet()).getName());
		
		Owner owner2 = new Owner("Michael");
		owner2.setPet(pet);
		owner2.getPet().setName("Ollie");
		System.out.println(owner2.getName() + " heeft een dier met naam " + owner2.getPet().getName());
	}

}
