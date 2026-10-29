package gameExample;

public class Tool extends Item {
	
	private boolean usedTool;
	
	public Tool() {
		super("tool");
		usedTool = false;
	}
	
	@Override
	public void use() {
		if (Game.getCurrentRoom().getName().equals("Bedroom")) {
			if (!usedTool) {
				Game.print("You use the tool to pry open the long-untouched trapdoor in the ceiling.\nA folded ladder crashes down, and you can now enter the attic.");
				usedTool = true;
				Game.getCurrentRoom().getExit(4).setLocked(false);
			}
			else
				Game.print("You already used to tool to pull down the ladder!");
		}
		else
			Game.print("The tool can't be used on anything in here.");
	}

}
