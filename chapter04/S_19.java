package bolum04;

import java.util.Scanner;

/*(Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the
ISBN number as a string.*/

public class S_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as isteger: ");
		String isbn = input.next();

		if (isbn.length() < 9) {
			System.err.println("ISBN should be 9 digit!");
		}

		int d9 = isbn.charAt(0) - '0';
		int d8 = isbn.charAt(1) - '0';
		int d7 = isbn.charAt(2) - '0';
		int d6 = isbn.charAt(3) - '0';
		int d5 = isbn.charAt(4) - '0';
		int d4 = isbn.charAt(5) - '0';
		int d3 = isbn.charAt(6) - '0';
		int d2 = isbn.charAt(7) - '0';
		int d1 = isbn.charAt(8) - '0';

		int ISBN = (d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9);

		String digitStr = ("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
		if (ISBN % 11 == 10) {
			System.out.println(ISBN + " is a valid social security number.");
		} else {
			System.out.println(digitStr + " is a invalid social security number.");
		}

		input.close();
	}

}
