package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot mrRoboto = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
mrRoboto.setSpeed(10);
		// 5. Set the pen width to 5
mrRoboto.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
mrRoboto.penDown();
for (int i = 0; i < 4; i++) {
	mrRoboto.setRandomPenColor();
	mrRoboto.turn(90);
	drawSquare();
}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
		mrRoboto.move(300);
		mrRoboto.turn(90);
		}
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
