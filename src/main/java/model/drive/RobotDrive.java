package model.drive;

/**
 * Created by jsimone on 6/17/17.
 */
public interface RobotDrive  {

	boolean forward();
	boolean backward();
	boolean left();
	boolean right();

	void executeCommand(String input);

	String output();
}
