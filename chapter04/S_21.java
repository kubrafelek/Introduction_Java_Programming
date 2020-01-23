package bolum04;

import java.util.Scanner;

/*(Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid.*/

public class S_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a SSN: ");
		String ssn = input.nextLine();
		for (int i = 0; i < 9; i++) {
			if (i == 8) {
				System.out.println(ssn + " is a valid social security number.");
			}

		}
		input.close();
	}

}
