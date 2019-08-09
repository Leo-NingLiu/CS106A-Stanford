// TODO: comment this program

import acm.program.*;

public class QuadraticEquation extends ConsoleProgram {
	public void run() {
		// TODO: finish this program
		println("CS106A Quadratic Solver!");
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		int c = readInt("Enter c: ");
		int delta = b * b - 4 * a * c;
		if(delta > 0) {
			double y = Math.sqrt(delta);
			double res1 = (-b + y) / (2 * a);
			double res2 = (-b - y) / (2 * a);
			println("Two roots: " + res1 +" and " + res2);
		}
		else if(delta == 0) {
			double res = (-b) / (2 * a);
			println("One root: " + res);
		}
		else if(delta < 0) {
			println("No real roots");
		}
	}
}
