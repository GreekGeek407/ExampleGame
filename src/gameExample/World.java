package gameExample;

public class World {

	public static Room buildWorld() {
		Game.loadRoomDescriptions();
		
		Room livingRoom = new Room("Living Room");
		Room office = new Room("Office");
		Room kitchen = new Room("Kitchen");
		Room bedroom = new Room("Bedroom");
		Room attic = new Room("Attic");
		Room garage = new Room("Garage");
		
		livingRoom.addExit(kitchen, 0);
		livingRoom.addExit(office, 1);
		livingRoom.addExit(bedroom, 2);
		office.addExit(livingRoom, 0);
		kitchen.addExit(livingRoom, 1);
		kitchen.addExit(garage, 3);
		bedroom.addExit(livingRoom, 3);
		bedroom.addExit(attic, 4);
		attic.addExit(bedroom, 5);
		garage.addExit(kitchen, 2);
		
		office.setLocked(true);
		attic.setLocked(true);
		garage.setLocked(true);
		
		Item musicBox = new Item("musicbox");
		Item knife = new Item("knife");
		Item mysteriousOrb = new Item("mysteriousorb");
		Item couch = new Item("couch", true);
		Item bed = new Item("bed", true);
		
		//bedroom.addItem(officeKey);
		bedroom.addItem(bed);
		livingRoom.addItem(new Tool());
		livingRoom.addItem(musicBox);
		livingRoom.addItem(couch);
		kitchen.addItem(new Flashlight());
		kitchen.addItem(knife);
		kitchen.addItem(mysteriousOrb);
		attic.addItem(new Safe());
		
		return livingRoom;
	}
}
