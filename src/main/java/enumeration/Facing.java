package enumeration;

/**
 * Created by jsimone on 6/17/17.
 */
public enum Facing {
	NORTH("^"),  // u21E7
	SOUTH("v"),
	EAST(">"),
	WEST("<");

	private String representation;
	private Facing(String representation)  {
		this.representation = representation;
	}

	public String getRepresentation() {
		return this.representation;
	}
}
