package enumeration;

/**
 * Created by jsimone on 6/19/17.
 */
public enum JoystickInput {
	F, // forward
	B, // backward
	L, // left
	R; // right

	public static JoystickInput fromString(String input) {
		JoystickInput joystickInput = null;
		try {
			joystickInput = JoystickInput.valueOf(input);
		} catch (IllegalArgumentException ex) {
			// do nothing.
		}
		return joystickInput;
	}
}
