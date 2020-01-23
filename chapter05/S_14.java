package bolum05;

import java.util.Scanner;

public class S_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// user enter two integer
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = input.nextInt();

		// assign d
		int gcd = 1;
		int d = Math.min(number1, number2);

		while (d > 0) {
			// check divisible number1 and number2
			if (number1 % d == 0 && number2 % d == 0)
				gcd = d;
			d--;
		}
		// display greatest common divisor
		System.out.println("The gcd is " + gcd);
		input.close();
	}

}
