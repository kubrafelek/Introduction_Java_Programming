package bolum04;

import java.util.Scanner;

/*(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology*/

public class S_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the major and status: ");
		String major = input.nextLine();
		char ch = major.toUpperCase().charAt(0);

		int status = input.nextInt();

		if (status == 1) {
			if (ch == 'M') {
				System.out.println("Mathematics Freshman");
			} else if (ch == 'C') {
				System.out.println("Computer Science Freshman");
			} else if (ch == 'I') {
				System.out.println("Information Technology Freshman");
			}
		} else if (status == 2) {
			if (ch == 'M') {
				System.out.println("Mathematics Sophomore");
			} else if (ch == 'C') {
				System.out.println("Computer Science Sophomore");
			} else if (ch == 'I') {
				System.out.println("Information Technology Sophomore");
			}
		} else if (status == 3) {
			if (ch == 'M') {
				System.out.println("Mathematics Junior");
			} else if (ch == 'C') {
				System.out.println("Computer Science Junior");
			} else if (ch == 'I') {
				System.out.println("Information Technology Junior");
			}

		} else if (status == 4) {
			if (ch == 'M') {
				System.out.println("Mathematics Senior");
			} else if (ch == 'C') {
				System.out.println("Computer Science Senior");
			} else if (ch == 'I') {
				System.out.println("Information Technology Senior");
			}

		} else {
			System.out.println("Invalid input!");
		}

		input.close();
	}
}
