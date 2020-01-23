package bolum03;

import java.util.Scanner;

/*(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three digit
number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, 
 the award is $10,000.
2. If all digits in the user input match all digits in the lottery number,
 the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, 
the award is $1,000.*/

public class S_15 {

	public static void main(String[] args) {
		
		int lottery = (int) (Math.random() * 1000);

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your lottery pick (three digits): ");
		
		int guess = input.nextInt();

		int lotteryDigit1 = lottery % 10;
		int remainingLottery = lottery / 10;
		int lotteryDigit2 = remainingLottery % 10;
		int lotteryDigit3 = remainingLottery / 10;

		int guessDigit1 = guess % 10;
		int remainingGuess = guess / 10;
		int guessDigit2 = remainingGuess % 10;
		int guessDigit3 = remainingGuess / 10;

		if (guess == lottery) {
		
			System.out.println(" Exact match: you win $10,000");
		
		} else if (guessDigit2 == lotteryDigit1 && guessDigit2 == lotteryDigit3 
				&& guessDigit3 == lotteryDigit2 && guessDigit3 == lotteryDigit1 
				&& guessDigit1 == lotteryDigit2 && guessDigit1 == lotteryDigit3) {
		
			System.out.println(" Match all digits: you win $3,000");
		
		} else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
		
			System.out.println("Match one digit: you win $1,000");
		
		} else {
		
			System.out.println("Sorry, no match :( ");
		}
		input.close();
	}

}
