package app;

import enumeration.Facing;
import enumeration.JoystickInput;
import model.Robot;
import model.Table;
import model.drive.ArcadeRobotDrive;
import util.Commands;

import java.io.IOException;
import java.util.List;

/**
 * Created by jsimone on 6/17/17.
 */
public class RobotArcadeDriveExecuteFigure8 {

	public static void main(String[] args) throws IOException {

		String currentWorkingDir = System.getProperty("user.dir");
		String filename = currentWorkingDir + "/figure8_input_files/arcade_figure8.txt";
		List<JoystickInput> commands = Commands.readFileSingleInput(filename);

		Robot robot = new Robot(new ArcadeRobotDrive(new Table(5), 0, 0, Facing.EAST));
		robot.execute(commands);
	}
}
