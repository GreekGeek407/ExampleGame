package gameExample;

public class Safe extends Item {
	
	private boolean isClosed;
	private boolean foundNotebook;
	
	public Safe() {
		super("safe", true);
		isClosed = true;
		foundNotebook = false;
	}
	
	@Override
	public void open() {
		if (isClosed) {
			if (!foundNotebook) {
				Game.print("With a creak, the iron door of the safe slowly opens. " +
				"Inside, you see an old notebook with 'secret' written on the cover.");
				Game.getCurrentRoom().addItem(new Notebook());
				foundNotebook = true;
			}
			else
				Game.print("Once again, the safe opens. You don't find anything new, though.");
		}
		else
			Game.print("The safe is already open!");
	}
	
	@Override
	public void close() {
		if (!isClosed) {
			Game.print("You push the safe closed. The door locks into place with a gentle thud.");
		}
		else
			Game.print("The safe is already closed!");
	}

}
