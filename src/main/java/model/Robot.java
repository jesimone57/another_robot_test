package model;

import enumeration.JoystickInput;
import model.drive.RobotDrive;
import util.JoystickInputPair;

import java.util.List;

/**
 * Created by jsimone on 6/17/17.
 */
public class Robot {
	private RobotDrive drive;

	public Robot(RobotDrive drive) {
		this.drive = drive;
	}

	public RobotDrive getDrive() {
		return drive;
	}

	public void execute(List<JoystickInput> commands) {
		System.out.println("\nInitial State:");
		drive.output();

		int commandNumber = 1;
		for (JoystickInput joystickInput : commands) {
			System.out.println("\ncommand " + commandNumber + " of " + commands.size() + " <- " + joystickInput);

			drive.executeCommand(joystickInput.toString());

			drive.output();
			commandNumber++;
		}
	}

	public void executePair(List<JoystickInputPair> commands) {
		System.out.println("\nInitial State:");
		drive.output();

		int commandNumber = 1;
		for (JoystickInputPair joystickInputPair : commands) {
			System.out.println("\ncommand " + commandNumber + " of " + commands.size() + " <- " + joystickInputPair);

			drive.executeCommand(joystickInputPair.toString());

			drive.output();
			commandNumber++;
		}
	}

//	private void executeSingleJoystick(JoystickInput joystickInput) {
//		switch (joystickInput) {
//			case F:
//				drive.forward();
//				break;
//			case B:
//				drive.backward();
//				break;
//			case R:
//				drive.right();
//				break;
//			case L:
//				drive.left();
//				break;
//			default:
//				System.out.println("Invalid single joystick command " + joystickInput + " must be one of " + JoystickInput.values());
//		}
//	}

//	private void executeDoubleJoystick(JoystickInputPair joystickInputPair) {
//
//		switch (joystickInputPair.toString()) {
//			case "F,F":
//				drive.forward();
//				break;
//			case "B,B":
//				drive.backward();
//				break;
//			case "F,B":
//				drive.right();
//				break;
//			case "B,F":
//				drive.left();
//				break;
//			default:
//				break; // ignore anything else
//		}
//	}
}
