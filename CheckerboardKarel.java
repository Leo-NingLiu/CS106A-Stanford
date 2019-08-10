/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		check();
		turnLeft();
		while(frontIsClear()) {
			printevenline();
			turnRight();
			if(frontIsClear()) {
				printoddline();
				turnLeft();
			}
		}
		

		
	}
	
	private void check() {
		while(frontIsClear()) {
			putBeeper();
			if(frontIsClear()) {
				move();
			}
			if(frontIsClear()) {
				move();
			}
		}
	}
	
	private void printevenline() {
		if(noBeepersPresent()) {
			move();
			turnLeft();
			check();
		} else {
			move();
			turnLeft();
			move();
			check();
		}
	}
	
	private void printoddline() {
		if(noBeepersPresent()) {
			move();
			turnRight();
			check();
		} else {
			move();
			turnRight();
			move();
			check();
		}
	}
	

}
