package model.drive.swerve;

import enumeration.Facing;
import helper.TestHelper;
import model.drive.RobotDrive;
import model.drive.SwerveRobotDrive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jsimone on 6/17/17.
 */
public class SwerveDriveMoveRightTest extends TestHelper {

	@Test
	public void moveRightWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.NORTH);
		drive.right();
		assertEquals("(2,1) NORTH", drive.output());
	}

	@Test
	public void moveRightWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.SOUTH);
		drive.right();
		assertEquals("(0,1) SOUTH", drive.output());
	}

	@Test
	public void moveRightWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.EAST);
		drive.right();
		assertEquals("(1,2) EAST", drive.output());
	}

	@Test
	public void moveRightWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.WEST);
		drive.right();
		assertEquals("(1,0) WEST", drive.output());
	}


}
