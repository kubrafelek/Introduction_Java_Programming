package bolum04;

import java.util.Scanner;

/*(Convert letter grade to number) Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
1, or 0.*/

public class S_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter grade: ");
		String letter = input.nextLine();

		char grade = letter.toUpperCase().charAt(0);

		if (grade == 'A') {
			System.out.println("The numeric value for grade " + grade + " is 4");
		} else if (grade == 'B') {
			System.out.println("The numeric value for grade " + grade + " is 3");
		} else if (grade == 'C') {
			System.out.println("The numeric value for grade " + grade + " is 2");
		} else if (grade == 'D') {
			System.out.println("The numeric value for grade " + grade + " is 1");
		} else if (grade == 'F') {
			System.out.println("The numeric value for grade " + grade + " is 0");
		} else {
			System.out.println(grade + " is an invalid grade!");
		}

		input.close();
	}

}
