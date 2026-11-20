package gameExample;

public class Notebook extends Item {
	
	private boolean foundPassword;
	
	public Notebook() {
		super("notebook");
		foundPassword = false;
	}
	
	@Override
	public void read() {
		if (Game.getItem("notebook") != null) {
			if (!foundPassword) {
				Game.print("You open the notebook and begin to read. " 
				+ "Inside, you find the password to the laptop!");
				foundPassword = true;
				Game.addInventoryItem(new Item("password"));
			}
			else
				Game.print("You reread the contents of the notebook, but you don't find anything new.");
		}
		else
			Game.print("You aren't carrying a notebook.");
		
	}

}
