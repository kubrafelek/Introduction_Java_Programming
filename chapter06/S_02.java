package chapter06;

import java.util.Scanner;

public class S_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long number = input.nextInt();
		System.out.println("Sum of digits are " + sumDigits(number));
		input.close();
	}

	public static int sumDigits(long n) {
		int sumOfDigits = 0;
		while (n > 0) {
			sumOfDigits += (int) (n % 10);
			n /= 10;
		}
		return sumOfDigits;
	}
}
