package model.drive;

import enumeration.Facing;
import enumeration.Turning;
import model.Table;

import static enumeration.Facing.EAST;
import static enumeration.Facing.NORTH;
import static enumeration.Facing.SOUTH;
import static enumeration.Facing.WEST;

/**
 * Crawl like a crab.  Valid dual joystick input combinations are:
 *
 * 		F,F => move forward
 * 		B,B => move backward
 * 		L,L => move left    (unlike tank)
 * 	    R,R => move right   (unlike tank)
 * 	    F,B => rotate 90 degrees to left  (like tank)
 * 	    B,F => rotate 90 degrees to right (like tank)
 *
 * Created by jsimone on 6/17/17.
 */
public class CrabDrive extends SwerveRobotDrive {

	public CrabDrive(Table table, int x, int y, Facing facing) {
		super(table, x, y, facing);
	}

	public void rotateLeft() {
		rotate(Turning.LEFT);
		table.positionedTo(x, y, facing);
	}

	public void rotateRight() {
		rotate(Turning.RIGHT);
		table.positionedTo(x, y, facing);
	}

	protected void rotate(Turning turning) {
		switch (facing) {
			case NORTH:
				facing = (turning == Turning.LEFT ? WEST : EAST);
				break;
			case SOUTH:
				facing = (turning == Turning.LEFT ? EAST : WEST);
				break;
			case EAST:
				facing = (turning == Turning.LEFT ? NORTH : SOUTH);
				break;
			case WEST:
				facing = (turning == Turning.LEFT ? SOUTH : NORTH);
				break;
		}
	}

	@Override
	public void executeCommand(String input) {
		switch (input) {
			case "F,F":
				forward();
				break;
			case "B,B":
				backward();
				break;
			case "F,B":
				rotateRight();
				break;
			case "B,F":
				rotateLeft();
				break;
			case "L,L":
				left();
				break;
			case "R,R":
				right();
				break;
			default:
				System.out.println("Invalid Crab robot drive command "+input+" ignored.");
				break; // ignore anything else
		}
	}

}
