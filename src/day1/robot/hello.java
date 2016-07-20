package day1.robot;

import javax.swing.JOptionPane;

public class hello {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, "Hello " + name +
			" My name is Tyler!");
String question =	JOptionPane.showInputDialog(null, "How are you doing today?");
JOptionPane.showMessageDialog(null, "That is " + question +" to hear!");
}
}
