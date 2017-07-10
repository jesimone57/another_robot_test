package util;

import enumeration.JoystickInput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to read robot commands from a file.
 *
 * Created by jsimone on 6/19/17.
 */
public class Commands {

	private Commands() {
	}

	public static List<JoystickInput> readFileSingleInput(String filename) throws FileNotFoundException, IOException {
		List<JoystickInput> commands = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line = reader.readLine();
			int lineNumber = 1;
			while (line != null) {
				line = line.trim();
				if (! line.isEmpty() && ! line.startsWith("#")) {
					JoystickInput input = JoystickInput.fromString(line);
					if (input == null) {
						System.out.println("Invalid joystick input " + line + " at line number "+lineNumber+" ignoring ...");
					} else {
						commands.add(input);
					}
				}
				line = reader.readLine();
				lineNumber++;
			}
		}

		System.out.println("\nRead "+commands.size()+" commands from file "+filename);
		return commands;
	}

	public static List<JoystickInputPair> readFileDoubleInput(String filename) throws FileNotFoundException, IOException {
		List<JoystickInputPair> commands = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line = reader.readLine();
			int lineNumber = 1;
			while (line != null) {
				line = line.trim();
				if (! line.isEmpty() && ! line.startsWith("#")) {
					if (! line.contains(",")) {
						System.out.println("Invalid joystick pair input " + line + " at line number "+lineNumber+" ignoring ...");
					} else {
						String [] inputs = line.split(",");

						if (inputs.length == 2) {
							JoystickInput input1 = JoystickInput.fromString(inputs[0]);
							if (input1 == null) {
								System.out.println("Invalid joystick pair input " + line + " at line number "+lineNumber+" ignoring ...");
							}

							JoystickInput input2 = JoystickInput.fromString(inputs[1]);
							if (input1 != null && input2 == null) {
								System.out.println("Invalid joystick pair input " + line + " at line number "+lineNumber+" ignoring ...");
							}

							if (input1 != null && input2 != null) {
								commands.add(new JoystickInputPair(input1, input2));
							}
						} else {
							System.out.println("Invalid joystick pair input " + line + " at line number "+lineNumber+" ignoring ...");
						}
					}
				}
				line = reader.readLine();
				lineNumber++;
			}
		}

		System.out.println("\nRead "+commands.size()+" commands from file "+filename);
		return commands;
	}
}
