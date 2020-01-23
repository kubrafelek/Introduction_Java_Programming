package bolum05;

import java.util.Scanner;

public class S_47 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first 12 digits of an ISBN-13 as a string: ");
		String digits = input.nextLine();

		int formul = 0;
		int sum = 0;
		for (int i = 0; i < digits.length(); i++) {

			if ((i + 1) % 2 == 0) {
				sum += 3 * (digits.charAt(i) - '0');
			} else {
				sum += digits.charAt(i) - '0';
			}

		}
		formul = 10 - (sum % 10);
		if (formul == 10)
			System.out.println("The ISBN-13 number is " + digits + "0");
		else
			System.out.println("The ISBN-13 number is " + digits + formul);
		input.close();
	}

}
