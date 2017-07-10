package app;

import enumeration.Facing;
import model.Robot;
import model.Table;
import model.drive.CrabDrive;
import util.Commands;
import util.JoystickInputPair;

import java.io.IOException;
import java.util.List;

/**
 * Created by jsimone on 6/17/17.
 */
public class RobotCrabDriveExecuteFigure8 {

	public static void main(String[] args) throws IOException {

		String currentWorkingDir = System.getProperty("user.dir");
		String filename = currentWorkingDir + "/figure8_input_files//crab_figure8.txt";
		List<JoystickInputPair> commands = Commands.readFileDoubleInput(filename);

		Robot robot = new Robot(new CrabDrive(new Table(5), 0, 0, Facing.EAST));
		robot.executePair(commands);
	}
}
