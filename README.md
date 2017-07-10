# Another Robot Test

Sample code for moving a robot around on a bounded table.

### Problem Statement
Complete a figure 8 for a robot in each of 4 drive modes on a 5 by 5 bounded table. The drive 
modes are:
* Swerve drive - no rotation allowed
* Arcade drive
* Tank drive - dual joystick inputs which control the left and right treads.
* Crab drive - dual joystick inputs which allowd for movement in any direction (like a crab).

I added the character graphics output for a visual representation, and to make it easier to see
what is going on.  This was not a requirement as stated by the original coding test.  Note: a 
period ".", represents a previously visited square while "R" and the arrows represent the current
position of the robot and its orientation.

### Prerequisites
* Java 1.7+
* git
* maven 3.3+

### To execute the code
* git clone https://github.com/jesimone57/modernizing_medicine_robot_test.git
* mvn clean compile
* mvn test
* mvn exec:java -Dexec.mainClass="app.RobotSwerveDriveExecuteFigure8"
* mvn exec:java -Dexec.mainClass="app.RobotArcadeDriveExecuteFigure8"
* mvn exec:java -Dexec.mainClass="app.RobotTankDriveExecuteFigure8"
* mvn exec:java -Dexec.mainClass="app.RobotCrabDriveExecuteFigure8"

# Output for a Robot driven by Swerve drive
<pre>
Read 24 commands from file /Users/jsimone/projects/modernizing_medicine_robot_test/swerve_figure8.txt

Initial State:
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0| R>|   |   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 1 of 24 <- F
(1,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  | R>|   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 2 of 24 <- F
(2,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  | R>|   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 3 of 24 <- F
(3,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  | R>|   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 4 of 24 <- F
(4,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  | R>|
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 5 of 24 <- R
(4,1) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   | R>|
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 6 of 24 <- R
(4,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   |   | R>|
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 7 of 24 <- B
(3,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   | R>|.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 8 of 24 <- B
(2,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   | R>|.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 9 of 24 <- B
(1,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   | R>|.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 10 of 24 <- B
(0,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2| R>|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 11 of 24 <- R
(0,3) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3| R>|   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 12 of 24 <- R
(0,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4| R>|   |   |   |   |
   .___.___.___.___.___.

command 13 of 24 <- F
(1,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  | R>|   |   |   |
   .___.___.___.___.___.

command 14 of 24 <- F
(2,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  | R>|   |   |
   .___.___.___.___.___.

command 15 of 24 <- F
(3,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  | R>|   |
   .___.___.___.___.___.

command 16 of 24 <- F
(4,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  |.  | R>|
   .___.___.___.___.___.

command 17 of 24 <- L
(4,3) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   | R>|
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 18 of 24 <- L
(4,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.R>|
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 19 of 24 <- B
(3,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.R>|.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 20 of 24 <- B
(2,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.R>|.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 21 of 24 <- B
(1,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.R>|.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 22 of 24 <- B
(0,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.R>|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 23 of 24 <- L
(0,1) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1| R>|   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 24 of 24 <- L
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.R>|.  |.  |.  |.  |
   .___.___.___.___.___.
  1|.  |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

Process finished with exit code 0
</pre>

# Output for a Robot driven by Arcade drive
<pre>
/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/tools.jar:/Users/jsimone/projects/modernizing_medicine_robot_test/target/classes app.RobotArcadeDriveExecuteFigure8

Read 18 commands from file /Users/jsimone/projects/modernizing_medicine_robot_test/arcade_figure8.txt

Initial State:
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0| R>|   |   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 1 of 18 <- F
(1,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  | R>|   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 2 of 18 <- F
(2,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  | R>|   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 3 of 18 <- F
(3,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  | R>|   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 4 of 18 <- R
(4,1) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.Rv|
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 5 of 18 <- R
(3,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   |.R<|.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 6 of 18 <- F
(2,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   | R<|.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 7 of 18 <- F
(1,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   | R<|.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 8 of 18 <- L
(0,3) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.Rv|   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 9 of 18 <- L
(1,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.R>|   |   |   |
   .___.___.___.___.___.

command 10 of 18 <- F
(2,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  | R>|   |   |
   .___.___.___.___.___.

command 11 of 18 <- F
(3,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  | R>|   |
   .___.___.___.___.___.

command 12 of 18 <- L
(4,3) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.R^|
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 13 of 18 <- L
(3,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.R<|.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 14 of 18 <- F
(2,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.R<|.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 15 of 18 <- F
(1,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.R<|.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 16 of 18 <- R
(0,1) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|.R^|   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 17 of 18 <- R
(1,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.R>|.  |.  |.  |
   .___.___.___.___.___.
  1|.  |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 18 of 18 <- B
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.R>|.  |.  |.  |.  |
   .___.___.___.___.___.
  1|.  |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

Process finished with exit code 0
</pre>


# Output for a Robot driven by Tank drive
<pre>
/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/tools.jar:/Users/jsimone/projects/modernizing_medicine_robot_test/target/classes app.RobotTankDriveExecuteFigure8

Read 32 commands from file /Users/jsimone/projects/modernizing_medicine_robot_test/tank_figure8.txt

Initial State:
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0| R>|   |   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 1 of 32 <- F,F
(1,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  | R>|   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 2 of 32 <- F,F
(2,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  | R>|   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 3 of 32 <- F,F
(3,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  | R>|   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 4 of 32 <- F,F
(4,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  | R>|
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 5 of 32 <- F,B
(4,0) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.Rv|
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 6 of 32 <- F,F
(4,1) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   | Rv|
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 7 of 32 <- F,F
(4,2) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   |   | Rv|
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 8 of 32 <- F,B
(4,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   |   |.R<|
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 9 of 32 <- F,F
(3,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   | R<|.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 10 of 32 <- F,F
(2,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   | R<|.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 11 of 32 <- F,F
(1,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   | R<|.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 12 of 32 <- F,F
(0,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2| R<|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 13 of 32 <- B,F
(0,2) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.Rv|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 14 of 32 <- F,F
(0,3) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3| Rv|   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 15 of 32 <- F,F
(0,4) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4| Rv|   |   |   |   |
   .___.___.___.___.___.

command 16 of 32 <- B,F
(0,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.R>|   |   |   |   |
   .___.___.___.___.___.

command 17 of 32 <- F,F
(1,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  | R>|   |   |   |
   .___.___.___.___.___.

command 18 of 32 <- F,F
(2,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  | R>|   |   |
   .___.___.___.___.___.

command 19 of 32 <- F,F
(3,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  | R>|   |
   .___.___.___.___.___.

command 20 of 32 <- F,F
(4,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  |.  | R>|
   .___.___.___.___.___.

command 21 of 32 <- B,F
(4,4) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.R^|
   .___.___.___.___.___.

command 22 of 32 <- F,F
(4,3) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   | R^|
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 23 of 32 <- F,F
(4,2) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.R^|
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 24 of 32 <- B,F
(4,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.R<|
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 25 of 32 <- F,F
(3,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.R<|.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 26 of 32 <- F,F
(2,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.R<|.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 27 of 32 <- F,F
(1,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.R<|.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 28 of 32 <- F,F
(0,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.R<|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 29 of 32 <- F,B
(0,2) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.R^|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 30 of 32 <- F,F
(0,1) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1| R^|   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 31 of 32 <- F,F
(0,0) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.R^|.  |.  |.  |.  |
   .___.___.___.___.___.
  1|.  |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 32 of 32 <- F,B
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.R>|.  |.  |.  |.  |
   .___.___.___.___.___.
  1|.  |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

Process finished with exit code 0
</pre>

# Output for a Robot driven by Crab drive
<pre>
/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/lib/tools.jar:/Users/jsimone/projects/modernizing_medicine_robot_test/target/classes app.RobotCrabDriveExecuteFigure8

Read 28 commands from file /Users/jsimone/projects/modernizing_medicine_robot_test/crab_figure8.txt

Initial State:
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0| R>|   |   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 1 of 28 <- F,F
(1,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  | R>|   |   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 2 of 28 <- F,F
(2,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  | R>|   |   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 3 of 28 <- F,F
(3,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  | R>|   |
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 4 of 28 <- F,F
(4,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  | R>|
   .___.___.___.___.___.
  1|   |   |   |   |   |
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 5 of 28 <- R,R
(4,1) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   | R>|
   .___.___.___.___.___.
  2|   |   |   |   |   |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 6 of 28 <- R,R
(4,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   |   | R>|
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 7 of 28 <- F,B
(4,2) SOUTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   |   |.Rv|
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 8 of 28 <- F,B
(4,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   |   |.R<|
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 9 of 28 <- F,F
(3,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   |   | R<|.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 10 of 28 <- F,F
(2,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   |   | R<|.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 11 of 28 <- F,F
(1,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|   | R<|.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 12 of 28 <- F,F
(0,2) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2| R<|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|   |   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 13 of 28 <- L,L
(0,3) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3| R<|   |   |   |   |
   .___.___.___.___.___.
  4|   |   |   |   |   |
   .___.___.___.___.___.

command 14 of 28 <- L,L
(0,4) WEST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4| R<|   |   |   |   |
   .___.___.___.___.___.

command 15 of 28 <- F,B
(0,4) NORTH
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.R^|   |   |   |   |
   .___.___.___.___.___.

command 16 of 28 <- F,B
(0,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.R>|   |   |   |   |
   .___.___.___.___.___.

command 17 of 28 <- F,F
(1,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  | R>|   |   |   |
   .___.___.___.___.___.

command 18 of 28 <- F,F
(2,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  | R>|   |   |
   .___.___.___.___.___.

command 19 of 28 <- F,F
(3,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  | R>|   |
   .___.___.___.___.___.

command 20 of 28 <- F,F
(4,4) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |   |
   .___.___.___.___.___.
  4|.  |.  |.  |.  | R>|
   .___.___.___.___.___.

command 21 of 28 <- L,L
(4,3) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   | R>|
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 22 of 28 <- L,L
(4,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.R>|
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 23 of 28 <- B,B
(3,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.R>|.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 24 of 28 <- B,B
(2,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.R>|.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 25 of 28 <- B,B
(1,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.R>|.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 26 of 28 <- B,B
(0,2) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1|   |   |   |   |.  |
   .___.___.___.___.___.
  2|.R>|.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 27 of 28 <- L,L
(0,1) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  1| R>|   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

command 28 of 28 <- L,L
(0,0) EAST
      0   1   2   3   4
   .___.___.___.___.___.
  0|.R>|.  |.  |.  |.  |
   .___.___.___.___.___.
  1|.  |   |   |   |.  |
   .___.___.___.___.___.
  2|.  |.  |.  |.  |.  |
   .___.___.___.___.___.
  3|.  |   |   |   |.  |
   .___.___.___.___.___.
  4|.  |.  |.  |.  |.  |
   .___.___.___.___.___.

Process finished with exit code 0
</pre>