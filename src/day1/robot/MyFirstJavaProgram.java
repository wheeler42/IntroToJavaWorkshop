package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		// START HERE
		Robot mrRoboto = new Robot();
		mrRoboto.setSpeed(9);
		mrRoboto.penDown();
		for (int i = 0; i < 4; i++) {
			mrRoboto.move(300);
			mrRoboto.turn(270);

		}

		mrRoboto.penUp();
		mrRoboto.move(150);
		mrRoboto.turn(270);
		mrRoboto.move(150);
		mrRoboto.turn(810);
		mrRoboto.
	}
}
