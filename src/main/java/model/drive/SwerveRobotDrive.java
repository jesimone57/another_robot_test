package model.drive;

import enumeration.Facing;
import enumeration.State;
import model.Table;

/**
 * Created by jsimone on 6/17/17.
 */
public class SwerveRobotDrive implements RobotDrive {
	protected int x;
	protected int y;
	protected Facing facing;
	protected Table table;

	public SwerveRobotDrive(Table table, int x, int y, Facing facing) {
		if (table == null) {
			throw new IllegalArgumentException("Table must not be null");
		}

		if (!table.isPositionAllowed(x, y) || facing == null) {
			System.out.println("Initial position "+toString()+" is not allowed.  Defaulting to (0,0) EAST");
			x = 0;
			y = 0;
			facing = Facing.EAST;
		}

		this.x = x;
		this.y = y;
		this.facing = facing;
		this.table = table;
		this.table.getCellArray()[x][y].setState(State.OCCUPIED, facing);
	}

	public boolean forward() {
		boolean isMoveAllowed = false;
		int newX = x;
		int newY = y;
		switch (facing) {
			case NORTH:
				newY--;
				break;
			case SOUTH:
				newY++;
				break;
			case EAST:
				newX++;
				break;
			case WEST:
				newX--;
				break;
			default:
				throw new IllegalStateException("Unknown Facing direction "+facing);
		}

		isMoveAllowed = table.isPositionAllowed(newX, newY);
		if (isMoveAllowed) {
			x = newX;
			y = newY;
			table.positionedTo(x, y, facing);
		} else {
			System.out.println("Move forward to position X="+newX+" Y="+newY+" while facing "+facing+" not allowed and ignored");
		}
		return isMoveAllowed;
	}

	public boolean backward() {
		boolean isMoveAllowed = false;
		int newX = x;
		int newY = y;
		switch (facing) {
			case NORTH:
				newY++;
				break;
			case SOUTH:
				newY--;
				break;
			case EAST:
				newX--;
				break;
			case WEST:
				newX++;
				break;
			default:
				throw new IllegalStateException("Unknown Facing direction "+facing);
		}

		isMoveAllowed = table.isPositionAllowed(newX, newY);
		if (isMoveAllowed) {
			x = newX;
			y = newY;
			table.positionedTo(x, y, facing);
		} else {
			System.out.println("Move backward to position X="+newX+" Y="+newY+" while facing "+facing+" not allowed and ignored");
		}
		return isMoveAllowed;
	}

	public boolean left() {
		boolean isMoveAllowed;
		int newX = x;
		int newY = y;
		switch (facing) {
			case NORTH:
				newX--;
				break;
			case SOUTH:
				newX++;
				break;
			case EAST:
				newY--;
				break;
			case WEST:
				newY++;
				break;
			default:
				throw new IllegalStateException("Unknown Facing direction "+facing);
		}

		isMoveAllowed = table.isPositionAllowed(newX, newY);
		if (isMoveAllowed) {
			x = newX;
			y = newY;
			table.positionedTo(x, y, facing);
		} else {
			System.out.println("Move left to position X="+newX+" Y="+newY+" while facing "+facing+" not allowed and ignored");
		}
		return isMoveAllowed;
	}

	public boolean right() {
		boolean isMoveAllowed = false;
		int newX = x;
		int newY = y;
		switch (facing) {
			case NORTH:
				newX++;
				break;
			case SOUTH:
				newX--;
				break;
			case EAST:
				newY++;
				break;
			case WEST:
				newY--;
				break;
			default:
				throw new IllegalStateException("Unknown Facing direction "+facing);
		}

		isMoveAllowed = table.isPositionAllowed(newX, newY);
		if (isMoveAllowed) {
			x = newX;
			y = newY;
			table.positionedTo(x, y, facing);
		} else {
			System.out.println("Move right to position X="+newX+" Y="+newY+" while facing "+facing+" not allowed and ignored");
		}
		return isMoveAllowed;
	}


	@Override
	public void executeCommand(String input) {
		switch (input) {
			case "F":
				forward();
				break;
			case "B":
				backward();
				break;
			case "R":
				right();
				break;
			case "L":
				left();
				break;
			default:
				System.out.println("Invalid single joystick command " + input + " must be one of:  F, B, R, or L ");
		}
	}

	public String output() {
		String output = toString();
		System.out.println(output);
		table.display();
		return output;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ") " + facing;
	}
}
