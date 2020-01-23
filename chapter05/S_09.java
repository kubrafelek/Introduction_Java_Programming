package bolum05;

import java.util.Scanner;

public class S_09 {

	public static void main(String[] args) {

		int max = 0;
		String maxName = "";

		int max2 = 0;
		String maxName2 = "";

		Scanner input = new Scanner(System.in);
		System.out.println("Enter students number: ");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Enter name and student's score: " + (i));
			String name = input.next();
			int score = input.nextInt();

			if (score > max) {
				max2 = max;
				maxName2 = maxName;

				max = score;
				maxName = name;
			} else if (score > max2) {
				max2 = score;
				maxName2 = name;
			}
		}

		System.out.println("The students have a high scores " + maxName + " , " + maxName2);
		System.out.println("The highest scores " + max + " , " + max2);
		input.close();
	}

}
