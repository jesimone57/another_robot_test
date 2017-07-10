package helper;

import model.Table;
import org.junit.Before;

/**
 * Created by jsimone on 6/18/17.
 */
public class TestHelper {

	protected Table table;
	protected String testdir;

	@Before
	public void before() {
		table = new Table(5);

		String currentWorkingDir = System.getProperty("user.dir");
		testdir = currentWorkingDir + "/test_input_files/";
	}
}
