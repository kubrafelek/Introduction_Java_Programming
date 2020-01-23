package bolum03;

import java.util.Scanner;

public class GSE_S_10 {

	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 1000);
		int number2 = (int) (Math.random() * 1000);

		Scanner input = new Scanner(System.in);

		System.out.println("What is the answer " + number1 + " * " + number2 + " ? ");

		int answer = input.nextInt();

		if (number1 * number2 == answer) {
			System.out.println("Your answer is correct! Congratulations!!!");
		} else {
			System.out.println("Sorry, answer should be " + (number1 * number2 == answer));
		}

		input.close();
	}

}
