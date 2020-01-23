package bolum03;

import java.util.Scanner;

/*(Game: multiply three numbers) The program in Listing 3.1, AdditionQuiz.java,
generates two integers and prompts the user to enter the product of these two integers.
Revise the program to generate three single-digit integers and prompt the user
to enter the multiplication of these three integers.*/

public class S_02 {

	public static void main(String[] args) {

		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() * 7 % 10);
		int number3 = (int) (System.currentTimeMillis() * 13 % 10);

		Scanner input = new Scanner(System.in);

		System.out.println("What is the " + number1 + " + " + number2 + " + " + number3 + " ? ");

		int answer = input.nextInt();

		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is "
				+ (number1 + number2 + number3 == answer));

		input.close();

	}

}
