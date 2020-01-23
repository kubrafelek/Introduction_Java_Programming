package bolum03;

import java.util.Scanner;

/*(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess and
reports whether the guess is correct or incorrect.*/

public class S_14 {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 2);

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the your guess: ");
		int guess = input.nextInt();

		if (guess == random) {
			System.out.println("Your answer is true.You win!!!");
		} else {
			System.out.println("Your answer is wrong...");
		}
		input.close();
	}

}
