package guessNumber;

import java.util.Scanner;

public class guessNumber {

	public static void main(String[] args) {
//		make a game to guess a number from 0 to 1000 that generated by your computer
//		let computer randomly generate a number (0<=number<1)
		float number = (float) Math.random();
//		double 1000 to change the number range into 0<=number<1000
		number *= 1000.0f;
//		to change the property of number from "float" to "integer"
		int number2 = (int) number;

//		set an start value of result
		String result = "start" ;

		while (result != "congratulations") {
//			set a scanner to scanner a number you input
			Scanner scanner = new Scanner(System.in);
//			let an integer "guess" to be the number you input 
			int guess = scanner.nextInt();

//			build a (else/if) statement to check if "the number you input" equal to "the number computer generated randomly"
			if (guess > number2) {
				result = "too large";
				System.out.println(result);
			} else if (guess < number2) {
				result = "too small";
				System.out.println(result);
			} else {
				result = "congratulations";
				System.out.println(result);
			}
		}
	}

}
