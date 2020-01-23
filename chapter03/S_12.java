package bolum03;

import java.util.Scanner;

/*(Palindrome number) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number. A number is palindrome
if it reads the same from right to left and from left to right. Here is a sample
run of this program:*/

public class S_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three-digit integer: ");
		int number = input.nextInt();

		int digit1 = number % 10;
		int digit3 = number / 100;

		if (digit1 == digit3) {
			System.out.println(number + " is palindrome");
		} else {
			System.out.println(number + " is not palindrome");
		}

		input.close();
	}

}
