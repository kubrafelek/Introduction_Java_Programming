/*(Multiply the digits in an integer) Write a program that reads an integer between
0 and 1000 and multiplies all the digits in the integer. For example, if an integer
is 932, the multiplication of all its digits is 54.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.*/

package bolum02;

import java.util.Scanner;

public class S_06 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();

		int lastDigit = number % 10;
		int remainingNumber = number / 10;
		int secondlastDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int thirdlastDigit = remainingNumber % 10;

		int multiply = lastDigit * secondlastDigit * thirdlastDigit;

		System.out.println("The multiplication of all digits in " + number + " is " + multiply);

		input.close();
	}

}
