package bolum05;

import java.util.Scanner;

public class S_32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the guess number: ");
		int guess = input.nextInt();
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		// Check number again ý do not want to same numbers for example 88,99
		int lottery;
		int lotteryDigit1;
		int lotteryDigit2;
		do {
			lottery = (int) (Math.random() * 100);
			lotteryDigit1 = lottery / 10;
			lotteryDigit2 = lottery % 10;

		} while (lotteryDigit1 == lotteryDigit2);

		System.out.println("The lottery number is " + lottery);

		if (guess == lottery) {
			System.out.println("Exact match: You win $10.000");
		} else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
			System.out.println("Match all digits: You win $3.000");
		} else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: You win $1.000");
		} else {
			System.out.println("Sorry, no match :(");
		}

		input.close();
	}

}
