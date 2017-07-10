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
public class SwerveDriveMoveLeftTest extends TestHelper {

	@Test
	public void moveLeftWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.NORTH);
		drive.left();
		assertEquals("(0,1) NORTH", drive.output());
	}

	@Test
	public void moveLeftWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.SOUTH);
		drive.left();
		assertEquals("(2,1) SOUTH", drive.output());
	}

	@Test
	public void moveLeftWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.EAST);
		drive.left();
		assertEquals("(1,0) EAST", drive.output());
	}

	@Test
	public void moveLeftWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 1, 1, Facing.WEST);
		drive.left();
		assertEquals("(1,2) WEST", drive.output());
	}


}
