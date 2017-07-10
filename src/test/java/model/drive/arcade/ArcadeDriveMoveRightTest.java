package model.drive.arcade;

import enumeration.Facing;
import helper.TestHelper;
import model.drive.ArcadeRobotDrive;
import model.drive.RobotDrive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jsimone on 6/17/17.
 */
public class ArcadeDriveMoveRightTest extends TestHelper {

	@Test
	public void moveRightWhileFacingNorth() {
		RobotDrive drive = new ArcadeRobotDrive(table, 1, 1, Facing.NORTH);
		drive.right();
		assertEquals("(2,0) EAST", drive.output());
	}

	@Test
	public void moveRightWhileFacingSouth() {
		RobotDrive drive = new ArcadeRobotDrive(table, 1, 1, Facing.SOUTH);
		drive.right();
		assertEquals("(0,2) WEST", drive.output());
	}

	@Test
	public void moveRightWhileFacingEast() {
		RobotDrive drive = new ArcadeRobotDrive(table, 1, 1, Facing.EAST);
		drive.right();
		assertEquals("(2,2) SOUTH", drive.output());
	}

	@Test
	public void moveRightWhileFacingWest() {
		RobotDrive drive = new ArcadeRobotDrive(table, 1, 1, Facing.WEST);
		drive.right();
		assertEquals("(0,0) NORTH", drive.output());
	}


}
