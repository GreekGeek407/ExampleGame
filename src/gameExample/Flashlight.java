package gameExample;

public class Flashlight extends Item {
	
	private boolean foundKey;
	
	public Flashlight() {
		super("flashlight");
		foundKey = false;
	}
	
	@Override
	public void use() {
		if (Game.getCurrentRoom().getName().equals("Bedroom")) {
			if (!foundKey) {
				Game.print("You turn on the flashlight and illuminate the horrors lying under the bed. "
					 + "Actually, there's nothing horrifying, but there is the office key!");
			Game.getCurrentRoom().addItem(new OfficeKey());
			foundKey = true;
			}
			else
				Game.print("You look harder, but the light doesn't illuminate anything else besides cobwebs.");
		}
		else
			Game.print("You turn on the flashlight and make a few shadow puppets, but nothing useful happens.");
	}

}
