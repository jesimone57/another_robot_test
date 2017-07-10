package model;

import enumeration.Facing;
import enumeration.State;

/**
 * A single cell which can be occupied by the robot, be empty or have some sort of blockage in it.
 * NOTE:  the blockage is for future enhancement, to allow the robot autonomous movement around the blockage.
 *
 * Created by jsimone on 6/18/17.
 */
public class Cell {
	private State state;
	private boolean visited;
	private Facing orientation;

	public Cell(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public Cell setState(State state) {
		this.state = state;
		if (state == State.EMPTY || state == State.BLOCKED) {
			this.orientation = null;  // no body is home
		}
		return this;
	}

	public Cell setState(State state, Facing orientation) {
		setState(state);
		this.orientation = orientation;
		return this;
	}

	public boolean isVisited() {
		return visited;
	}

	public Cell setVisited(boolean visited) {
		this.visited = visited;
		return this;
	}

	public Facing getOrientation() {
		return orientation;
	}

	public Cell setOrientation(Facing orientation) {
		this.orientation = orientation;
		return this;
	}

	@Override
	public String toString() {
		String visit = visited ? "." : " ";
		String orient = orientation != null ? orientation.getRepresentation() : " ";
		return visit + state.getRepresentation() + orient;
	}
}
