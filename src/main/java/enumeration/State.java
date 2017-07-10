package enumeration;

/**
 * Created by jsimone on 6/18/17.
 */
public enum State {
	EMPTY(" "),
	BLOCKED("X"),
	OCCUPIED("R");

	private String representation;
	private State(String representation)  {
		this.representation = representation;
	}

	public String getRepresentation() {
		return this.representation;
	}
}
