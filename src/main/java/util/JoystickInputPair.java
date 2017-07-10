package util;

import enumeration.JoystickInput;

/**
 * Created by jsimone on 6/19/17.
 */
public class JoystickInputPair {
	private JoystickInput input1;
	private JoystickInput input2;

	public JoystickInputPair(JoystickInput input1, JoystickInput input2) {
		this.input1 = input1;
		this.input2 = input2;
	}

	public JoystickInput getInput1() {
		return input1;
	}

	public JoystickInput getInput2() {
		return input2;
	}

	@Override
	public String toString() {
		return input1+","+input2;
	}
}
