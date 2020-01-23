package bolum04;

import java.util.Scanner;

/*(Hex to binary) Write a program that prompts the user to enter a hex digit and
displays its corresponding binary number.*/

public class S_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		String letter = input.nextLine();

		char ch = letter.toUpperCase().charAt(0);
		if ('A' <= ch && ch <= 'F') {
			int value = ch - 'A' + 10;

			int v0 = value % 2;
			value = value / 2;
			int v1 = value % 2;
			value = value / 2;
			int v2 = value % 2;
			value = value / 2;
			int v3 = value;

			System.out.println("The binary value " + ch + " is " + v3 + v2 + v1 + v0);
		} else {
			System.out.println("Invalid input!");
		}

		input.close();
	}

}
