package util;

import enumeration.JoystickInput;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jsimone on 6/19/17.
 */
public class CommandsTest {

	private String testdir;

	@Before
	public void before() {
		String currentWorkingDir = System.getProperty("user.dir");
		testdir = currentWorkingDir + "/test_input_files/";
	}

	@Test
	public void readFileSingleInput() throws IOException {
		String filename = testdir + "/commands_test.txt";
		List<JoystickInput> commands = Commands.readFileSingleInput(filename);
		assertEquals(4, commands.size());
		assertEquals(Arrays.asList("F", "R", "B", "L").toString(), commands.toString());
	}

	@Test
	public void readFileSingleInputInvalid() throws IOException {
		String filename = testdir + "/commands_invalid_test.txt";
		List<JoystickInput> commands = Commands.readFileSingleInput(filename);
		assertEquals(0, commands.size());
	}

	@Test(expected = FileNotFoundException.class)
	public void readFileException() throws IOException {
		String currentWorkingDir = System.getProperty("user.dir");
		String filename = currentWorkingDir + "/file_does_not_exist.txt";
		Commands.readFileSingleInput(filename);
	}

	@Test
	public void readFileDoubleInput() throws IOException {
		String filename = testdir + "/commands_pair_test.txt";
		List<JoystickInputPair> commands = Commands.readFileDoubleInput(filename);
		assertEquals(4, commands.size());
		assertEquals(Arrays.asList("F,F", "F,B", "B,F", "B,B").toString(), commands.toString());
	}

	@Test
	public void readFileDoubleInputInvalid() throws IOException {
		String filename = testdir + "/commands_invalid_pair_test.txt";
		List<JoystickInputPair> commands = Commands.readFileDoubleInput(filename);
		assertEquals(0, commands.size());
	}
}
