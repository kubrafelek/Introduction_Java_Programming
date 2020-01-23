package bolum05;

import java.util.Scanner;

public class S_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int max = 0;
		String maxName = "";

		System.out.println("Enter the number of students: ");
		int number = input.nextInt();

		for (int count = 1; count <= number; count++) {
			System.out.println("Enter a name and score " + (count) + ": ");
			String name = input.next();
			int score = input.nextInt();

			if (score > max) {
				max = score;
				maxName = name;
			}
		}

		System.out.println("The student have a high score " + maxName);
		System.out.println("The highest score is " + max);
		input.close();
	}
}
