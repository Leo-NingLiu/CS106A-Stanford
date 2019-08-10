// TODO: comment this program

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		// TODO: finish this program
		println("This program computes Hailstone sequences.");
		println();
		int num = readInt("Enter a number: ");
		int count = 0;
		while(num != 1) {
			if(num % 2 == 0) {
				println(num + " is even, so I make half: " + num / 2);
				num = num/2;
			}
			else {
				println(num + " is odd, so I make 3n + 1: " + (3*num + 1));
				num = 3 * num + 1; 
			}
			count++;
		}
		if(num == 1) {
			println("It took " + count + " steps to reach 1.");
		}
		while(readBoolean("Run again?", "y", "n")) {
			println();
			num = readInt("Enter a number: ");
			count = 0;
			while(num != 1) {
				if(num % 2 == 0) {
					println(num + " is even, so I make half: " + num / 2);
					num = num/2;
				}
				else {
					println(num + " is odd, so I make 3n + 1: " + (3*num + 1));
					num = 3 * num + 1; 
				}
				count++;
			}
			if(num == 1) {
				println("It took " + count + " steps to reach 1.");
			}
		}
		println("Thanks for using Hailstone.");
	}
}
