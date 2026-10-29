package gameExample;

public class OfficeKey extends Item {
	
	private boolean usedOfficeKey;
	
	public OfficeKey() {
		super("officeKey");
		usedOfficeKey = false;
	}
	
	@Override
	public void use() {
		if (Game.getCurrentRoom().getName().equals("Living Room")) {
			if (!usedOfficeKey) {
				Game.print("After checking to make sure no one is watching, you slip the office key into the lock and turn it.\nThe office is now unlocked!");
				usedOfficeKey = true;
				Game.getCurrentRoom().getExit(1).setLocked(false);
			}
			else
				Game.print("You already unlocked the office door.");
		}
		else
			Game.print("You can't use the office key on anything in here.");
	}

}
