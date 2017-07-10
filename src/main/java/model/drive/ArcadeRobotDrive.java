package model.drive;

import enumeration.Facing;
import enumeration.Turning;
import model.Table;

import static enumeration.Facing.EAST;
import static enumeration.Facing.NORTH;
import static enumeration.Facing.SOUTH;
import static enumeration.Facing.WEST;

/**
 * Created by jsimone on 6/17/17.
 */
public class ArcadeRobotDrive extends SwerveRobotDrive {

	public ArcadeRobotDrive(Table table, int x, int y, Facing facing) {
		super(table, x, y, facing);
	}

	@Override
	public boolean left() {
		boolean isMoveAllowed = false;
		if (super.forward() && super.left()) {
			rotate(Turning.LEFT);
			table.positionedTo(x, y, facing);
			isMoveAllowed = true;
		}
		return isMoveAllowed;
	}

	@Override
	public boolean right() {
		boolean isMoveAllowed = false;
		if (super.forward() && super.right()) {
			rotate(Turning.RIGHT);
			table.positionedTo(x, y, facing);
			isMoveAllowed = true;
		}
		return isMoveAllowed;
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

}
