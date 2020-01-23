package chapter06;

import java.util.Scanner;

public class S_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int number = input.nextInt();
		System.out.println("The reverse of number is " + reverse(number));
		if (isPalindrome(number)) {
			System.out.println("Number is palindrome!");
		} else {
			System.out.println("Number is not palindrome!!!");
		}
		input.close();
	}

	public static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			int digit = number % 10;
			reverse = digit + (reverse * 10);
			number /= 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number) {
		if (reverse(number) == number) {
			return true;
		}
		return false;
	}
}
