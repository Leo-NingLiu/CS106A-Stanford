// TODO: comment this program

import acm.program.*;

public class Weather extends ConsoleProgram {
	public void run() {
		// TODO: finish this program
		println("CS 106A \"Weather Master 4000\"!");
		int temp = readInt("Next temperature (or -1 to quit)?");
		double sum = 0;
		int cold = 0;
		int high = temp;
		int low = temp;
		int count = 0;
		while(temp != -1) {
			sum = temp + sum;
			count++;
			if(temp <= 50) {
				cold++;
			}
			if(temp > high) {
				high = temp;
			}
			if(temp < low) {
				low = temp;
			}
			temp = readInt("Next temperature (or -1 to quit)?");
		}
		double ave = sum / count;
		if(count != 0) {
			println("Highest temperature = " + high);
			println("Lowest temperature = " + low);
			println("Average = " + ave);
			println(cold + " cold day(s)");
		}
		else {
			println("No temperatures were entered.");
		}
		
	}
}
