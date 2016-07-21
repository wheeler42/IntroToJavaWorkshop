
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class turtle implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.move(25);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.move(-25);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(-90);
		Tortoise.move(25);
		Tortoise.turn(90);
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(25);
		Tortoise.turn(-90);
	}

	private void spaceBarWasPressed() {
		int tortoiseX = Tortoise.getX();
		int tortoiseY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and
		// tortoiseLocationY
		System.out.println(tortoiseX + " " + tortoiseY);
		// 6. If tortoise is at same location as the little girl,
		// make a pop-up tell the Tortoise where to go next
		if (Tortoise.getX() == 495 && Tortoise.getY() == 290) {
			// 7. Give the user subsequent clues at different locations on the
			// image
			// (pirate robot, swamp, parrots, etc.)
			JOptionPane.showMessageDialog(null,
					"Hello My name is Sally. I am tied up and need you to find the key for me!");
			JOptionPane.showMessageDialog(null, "I have suspicion of the key being over on that pirate!");
			JOptionPane.showMessageDialog(null, "Go ask the pirate what he is up to.");

		}
		if (Tortoise.getX() == 145 && Tortoise.getY() == 290) {
			System.out.println("asdf");
			String name = JOptionPane.showInputDialog("Ayyy Maty what is your name?");
			JOptionPane.showMessageDialog(null, "Well " + name + " I heard that you were looking for a key!");
			JOptionPane.showInputDialog("Well" + name + " are you?");
			JOptionPane.showMessageDialog(null,
					"Well I dont have that great of memory but, I remember that the man who locked her up said...");
			JOptionPane.showMessageDialog(null, "The face will set you free can't you SEE!!!");
		}
		if (Tortoise.getX() == 145 && Tortoise.getY() == 40) {
		JOptionPane.showMessageDialog(null, "Congrats you found the key and ste Sally free!!!");	
		}
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want,
		 * and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground(
				"file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null,
				"Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new turtle().go();
	}
}
