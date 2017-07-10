package model.drive.swerve;

import enumeration.Facing;
import helper.TestHelper;
import model.drive.RobotDrive;
import model.drive.SwerveRobotDrive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by jsimone on 6/21/17.
 */
public class SwerveDriveMoveNotAllowedTest extends TestHelper {
	@Test
	public void leftInvalidWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.NORTH);
		boolean isMoveAllowed = drive.left();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) NORTH", drive.output());
	}

	@Test
	public void forwardInvalidWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.NORTH);
		boolean isMoveAllowed = drive.forward();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) NORTH", drive.output());
	}

	@Test
	public void backwardInvalidWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.NORTH);
		boolean isMoveAllowed = drive.backward();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) NORTH", drive.output());
	}

	@Test
	public void rightInvalidWhileFacingNorth() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.NORTH);
		boolean isMoveAllowed = drive.right();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) NORTH", drive.output());
	}



	@Test
	public void leftInvalidWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.SOUTH);
		boolean isMoveAllowed = drive.left();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) SOUTH", drive.output());
	}

	@Test
	public void forwardInvalidWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.SOUTH);
		boolean isMoveAllowed = drive.forward();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) SOUTH", drive.output());
	}

	@Test
	public void backwardInvalidWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.SOUTH);
		boolean isMoveAllowed = drive.backward();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) SOUTH", drive.output());
	}

	@Test
	public void rightInvalidWhileFacingSouth() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.SOUTH);
		boolean isMoveAllowed = drive.right();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) SOUTH", drive.output());
	}




	@Test
	public void leftInvalidWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.EAST);
		boolean isMoveAllowed = drive.left();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) EAST", drive.output());
	}

	@Test
	public void forwardInvalidWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.EAST);
		boolean isMoveAllowed = drive.forward();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) EAST", drive.output());
	}

	@Test
	public void backwardInvalidWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.EAST);
		boolean isMoveAllowed = drive.backward();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) EAST", drive.output());
	}

	@Test
	public void rightInvalidWhileFacingEast() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.EAST);
		boolean isMoveAllowed = drive.right();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) EAST", drive.output());
	}




	@Test
	public void leftInvalidWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.WEST);
		boolean isMoveAllowed = drive.left();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) WEST", drive.output());
	}

	@Test
	public void forwardInvalidWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.WEST);
		boolean isMoveAllowed = drive.forward();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) WEST", drive.output());
	}

	@Test
	public void backwardInvalidWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 4, 4, Facing.WEST);
		boolean isMoveAllowed = drive.backward();
		assertFalse(isMoveAllowed);
		assertEquals("(4,4) WEST", drive.output());
	}

	@Test
	public void rightInvalidWhileFacingWest() {
		RobotDrive drive = new SwerveRobotDrive(table, 0, 0, Facing.WEST);
		boolean isMoveAllowed = drive.right();
		assertFalse(isMoveAllowed);
		assertEquals("(0,0) WEST", drive.output());
	}

}
