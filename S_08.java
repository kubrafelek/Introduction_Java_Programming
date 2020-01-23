package bolum03;

import java.util.Scanner;

/*(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.*/

public class S_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three integer: ");

		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		{
			// Alternative solution
			if (number1 > number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			if (number1 > number3) {
				int temp = number1;
				number1 = number3;
				number3 = temp;
			}

			if (number2 > number3) {
				int temp = number2;
				number2 = number3;
				number3 = temp;
			}

			System.out.println(number1 + " , " + number2 + " , " + number3);
		}

		if (number1 <= number2 && number1 <= number3) {

			if (number2 <= number3) {
				System.out.println(number1 + " , " + number2 + " , " + number3);
			} else {
				System.out.println(number1 + " , " + number3 + " , " + number2);
			}

		} else if (number2 <= number1 && number2 <= number3) {

			if (number1 <= number3) {
				System.out.println(number2 + " , " + number1 + " , " + number3);
			} else {
				System.out.println(number2 + " , " + number3 + " , " + number1);
			}

		} else if (number3 <= number1 && number3 <= number2) {

			if (number1 <= number2) {
				System.out.println(number3 + " , " + number2 + " , " + number1);
			} else {
				System.out.println(number3 + " , " + number1 + " , " + number2);
			}
		}

		input.close();
	}

}
