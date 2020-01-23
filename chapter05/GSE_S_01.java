package bolum05;

import java.util.Scanner;

public class GSE_S_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int score = 0;

		while (score != -1) {
			System.out.print("Enter a score: ");
			score = input.nextInt();
			if (score >= 60) {
				System.out.println("You pass the exam!");
			} else if (0 <= score) {
				System.out.println("You don't pass the exam...");
			}
		}
		if (score == -1) {
			System.out.println("No numbers are entered except 0");
			System.exit(0);
		}

		input.close();
	}

}
