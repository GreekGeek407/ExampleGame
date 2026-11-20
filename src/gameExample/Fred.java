package gameExample;

public class Fred extends NPC {
	
	private int dialogState;
	
	public Fred() {
		super("fred");
		dialogState = 0;
	}
	
	@Override
	public void give(Item i) {
		if (i.getName().equals("money")) {
			say("And here I thought you were flat broke. Well, a deal's a deal.");
			Game.print("In an uncharacteristically honorable move, Fred hands you the safe combination.");
			Game.addInventoryItem(new Item("combination"));
		}
		else
			say("I don't want your junk.");
	}
	
	@Override
	public void talk() {
		
	}

}
