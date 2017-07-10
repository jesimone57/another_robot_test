package model;

import enumeration.Facing;
import enumeration.JoystickInput;
import helper.TestHelper;
import model.drive.ArcadeRobotDrive;
import org.junit.Test;
import util.Commands;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jsimone on 6/17/17.
 */
public class RobotArcadeDriveCommandTest extends TestHelper {

	@Test
	public void testCommandFile() throws IOException {
		String filename = testdir + "/arcade_test.txt";
		List<JoystickInput> commands = Commands.readFileSingleInput(filename);

		Robot robot = new Robot(new ArcadeRobotDrive(new Table(5), 0, 0, Facing.EAST));
		robot.execute(commands);
		assertEquals("(4,1) SOUTH", robot.getDrive().toString());
	}
}

