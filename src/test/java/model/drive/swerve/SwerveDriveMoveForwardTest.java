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
public class SwerveDriveMoveForwardTest extends TestHelper {

	@Test
	public void moveForwardWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.NORTH);
		drive.forward();
		assertEquals("(1,0) NORTH", drive.output());
	}

	@Test
	public void moveForwardWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.SOUTH);
		drive.forward();
		assertEquals("(1,2) SOUTH", drive.output());
	}

	@Test
	public void moveForwardWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.EAST);
		drive.forward();
		assertEquals("(2,1) EAST", drive.output());
	}

	@Test
	public void moveForwardWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.WEST);
		drive.forward();
		assertEquals("(0,1) WEST", drive.output());
	}


}
