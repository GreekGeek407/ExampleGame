package gameExample;

import java.io.Serializable;

public class Item implements Serializable {
	
	private String name;
	private boolean heavy;
	
	public Item(String na) {
		this(na, false);
	}
	
	public Item (String na, boolean h) {
		name = na;
		heavy = h;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isHeavy() {
		return heavy;
	}
	
	public void setName(String na) {
		name = na;
	}
	
//	public void setHeavy() {
//		heavy = true;
//	}
	
	public void use() {
		Game.print("You can't use the " + name + ".");
	}
	
	public String toString() {
		return name;
	}

}
