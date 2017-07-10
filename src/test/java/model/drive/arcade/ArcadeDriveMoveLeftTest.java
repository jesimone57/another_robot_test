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
public class ArcadeDriveMoveLeftTest extends TestHelper {


	@Test
	public void moveLeftWhileFacingNorth() {
		RobotDrive drive = new ArcadeRobotDrive(table, 1, 1, Facing.NORTH);
		drive.left();
		assertEquals("(0,0) WEST", drive.output());
	}

	@Test
	public void moveLeftWhileFacingSouth() {
		RobotDrive drive = new ArcadeRobotDrive(table, 1, 1, Facing.SOUTH);
		drive.left();
		assertEquals("(2,2) EAST", drive.output());
	}

	@Test
	public void moveLeftWhileFacingEast() {
		RobotDrive drive = new ArcadeRobotDrive(table, 1, 1, Facing.EAST);
		drive.left();
		assertEquals("(2,0) NORTH", drive.output());
	}

	@Test
	public void moveLeftWhileFacingWest() {
		RobotDrive robotDrive = new ArcadeRobotDrive(table, 1, 1, Facing.WEST);
		robotDrive.left();
		assertEquals("(0,2) SOUTH", robotDrive.output());
	}


}
