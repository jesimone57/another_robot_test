package model.drive;

import enumeration.Facing;
import enumeration.Turning;
import model.Table;

/**
 * Created by jsimone on 6/17/17.
 */
public class TankRobotDrive extends ArcadeRobotDrive {

	public TankRobotDrive(Table table, int x, int y, Facing facing) {
		super(table, x, y, facing);
	}

	@Override
	public boolean left() {
		rotate(Turning.LEFT);
		table.positionedTo(x, y, facing);
		return true;
	}

	@Override
	public boolean right() {
		rotate(Turning.RIGHT);
		table.positionedTo(x, y, facing);
		return true;
	}


	public void executeCommand(String input) {
		switch (input) {
			case "F,F":
				forward();
				break;
			case "B,B":
				backward();
				break;
			case "F,B":
				right();
				break;
			case "B,F":
				left();
				break;
			default:
				System.out.println("Invalid Tank drive command " + input + " must be one of: F,F B,B F,B or B,F");
				break; // ignore anything else
		}
	}

}
