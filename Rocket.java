// TODO: comment this program

import acm.program.*;

public class Rocket extends ConsoleProgram {
	int SIZE = 5;
	public void run() {
		// TODO: finish this program
		println("CS 106A Rocket");
		println("( size " + SIZE + ")");
		for(int i = 1; i <= SIZE; i++) {
			for(int j = 1; j <= SIZE - i + 1; j++) {
				print(" ");
			}
			for(int j = 1; j <= i; j++) {
				print("/");
			}
			for(int j = 1; j <= i; j++) {
				print("\\");
			}
			for(int j = 1; j <= SIZE - i + 1; j++) {
				print(" ");
			}
			println();
		}
		print("+");
		for(int i = 1; i <= 2 * SIZE; i++) {
			print("=");
		}
		print("+");
		println();
		for(int i = 1; i <= SIZE; i++) {
			print("|");
			for(int j = 1; j <= SIZE - i; j++) {
				print(".");
			}
			for(int j = 1; j <= i; j++) {
				print("/");
			}
			for(int j = 1; j <= i; j++) {
				print("\\");
			}
			for(int j = 1; j <= SIZE - i; j++) {
				print(".");
			}
			print("|");
			println();
		}
		for(int i = SIZE; i > 0; i--) {
			print("|");
			for(int j = 1; j <= SIZE - i; j++) {
				print(".");
			}
			for(int j = 1; j <= i; j++) {
				print("\\");
			}
			for(int j = 1; j <= i; j++) {
				print("/");
			}
			for(int j = 1; j <= SIZE - i; j++) {
				print(".");
			}
			print("|");
			println();
		}
		print("+");
		for(int i = 1; i <= 2 * SIZE; i++) {
			print("=");
		}
		print("+");
		println();
		for(int i = 1; i <= SIZE; i++) {
			for(int j = 1; j <= SIZE - i + 1; j++) {
				print(" ");
			}
			for(int j = 1; j <= i; j++) {
				print("/");
			}
			for(int j = 1; j <= i; j++) {
				print("\\");
			}
			for(int j = 1; j <= SIZE - i + 1; j++) {
				print(" ");
			}
			println();
		}
	}
}
