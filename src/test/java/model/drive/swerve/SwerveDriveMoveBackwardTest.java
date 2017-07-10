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
public class SwerveDriveMoveBackwardTest extends TestHelper {

	@Test
	public void moveBackwardWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.NORTH);
		drive.backward();
		assertEquals("(1,2) NORTH", drive.output());
	}

	@Test
	public void moveBackwardWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.SOUTH);
		drive.backward();
		assertEquals("(1,0) SOUTH", drive.output());
	}

	@Test
	public void moveBackwardWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.EAST);
		drive.backward();
		assertEquals("(0,1) EAST", drive.output());
	}

	@Test
	public void moveBackwardWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.WEST);
		drive.backward();
		assertEquals("(2,1) WEST", drive.output());
	}


}
