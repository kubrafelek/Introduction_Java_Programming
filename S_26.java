package bolum03;

import java.util.Scanner;

/*(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both.*/

public class S_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");

		int number = input.nextInt();

		System.out.println("Is 10 divisible by 5 and 6 ? " + (number % 5 == 0 && number % 6 == 0));
		System.out.println("Is 10 divisible by 5 or 6 ? " + (number % 5 == 0 || number % 6 == 0));
		System.out.println("Is divisible by 5 or 6 , but not both ?" + (number % 5 == 0 ^ number % 6 == 0));

		input.close();
	}

}
