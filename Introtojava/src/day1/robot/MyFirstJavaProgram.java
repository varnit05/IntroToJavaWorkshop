package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot dave = new Robot ();
	
		dave.setRandomPenColor();
		dave.penDown();
		dave.setSpeed(9);
		dave.move(398);
		dave.turn(180);
	}
}

