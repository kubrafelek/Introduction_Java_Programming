package bolum03;

import java.util.Scanner;

/*(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other 9 digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. Here are sample runs:*/

public class S_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as isteger: ");
		int digit = input.nextInt();

		int d9 = digit % 10;
		int remaining = digit / 10;
		int d8 = remaining % 10;
		remaining /= 10;
		int d7 = remaining % 10;
		remaining /= 10;
		int d6 = remaining % 10;
		remaining /= 10;
		int d5 = remaining % 10;
		remaining /= 10;
		int d4 = remaining % 10;
		remaining /= 10;
		int d3 = remaining % 10;
		remaining /= 10;
		int d2 = remaining % 10;
		remaining /= 10;
		int d1 = remaining % 10;

		int ISBN = (d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9);

		String digitStr = ("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
		if (ISBN % 11 == 10) {
			System.out.println("The ISBN-10 number is " + digitStr + 'X');
		} else {
			System.out.println("The ISBN-10 number is " + digitStr + (ISBN % 11));
		}
		input.close();
	}

}
