/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		turnLeft();
		checkLine();
		turnRight();
		forward();
		turnRight();
		checkLine();
		turnLeft();
		forward();
		turnLeft();
		checkLine();
		turnRight();
		forward();
		turnRight();
		checkLine();
		turnLeft();
		
		
	}
	
	private void checkLine() {
		for(int i = 0; i < 5; i++) {
			if(!beepersPresent()) {
				putBeeper();
			} 
			if(frontIsClear()) {
				move();
			}
		}
	}
	
	private void forward() {
		move();
		move();
		move();
		move();
	}

}