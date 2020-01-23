package bolum05;

import java.util.Scanner;

public class S_02 {

	public static void main(String[] args) {

		final int NUMBER_OF_QUESTION = 10;

		int count = 0;
		int correctCount = 0;

		long startTime = System.currentTimeMillis();

		String output = " ";

		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTION) {

			int number1 = (int) (Math.random() * 15) + 1;
			int number2 = (int) (Math.random() * 15) + 1;

			System.out.println("What is the " + number1 + " + " + number2 + " ?");
			int answer = input.nextInt();

			if (number1 + number2 == answer) {
				System.out.println("Your answer is corret!");
				correctCount++;
				output += number1 + "\t + \t" + number2 + "\t=\t" + answer + " True\n";
			} else {
				System.out.println("Wrong answer...");
				output += number1 + "\t + \t" + number2 + "\t=\t" + answer + " False\n";
			}
			count++;
		}
		long endTime = System.currentTimeMillis();

		System.out.println("Your number of true answers " + correctCount);
		System.out.println("Totally test time: " + ((endTime - startTime) / 1000));
		System.out.println(output);

		input.close();
	}

}
