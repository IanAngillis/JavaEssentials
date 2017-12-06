package be.pxl.opdracht2_compositie;

public class House {
	private Room kitchen = new Room("kitchen");
	private Room bathRoom = new Room("bathroom");
	private Room livingRoom = new Room("livingroom");
	private Room sleepingRoom = new Room("sleepingroom");

	public Room getKitchen() {
		return kitchen;
	}

	public Room getBathroom() {
		return bathRoom;
	}

	public Room getLivingRoom() {
		return livingRoom;
	}

	public Room getSleepingRoom() {
		return sleepingRoom;
	}
}
