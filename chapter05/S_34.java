package bolum05;

import java.util.Scanner;

public class S_34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your choice (0:rock, 1:paper, 2:scissors): ");
		int user = input.nextInt();

		int userW = 0;
		int compW = 0;

		while (userW < 3 || compW < 3) {
			int computer = (int) (Math.random() * 2) + 1;
			System.out.println("Enter your choice (0:rock, 1:paper, 2:scissors): ");
			user = input.nextInt();
			
			if (user == computer) {
				System.out.println("Nobody won't.");
			} else if (user == 0) {
				if (computer == 1) {
					System.out.println("Computer is paper. User is rock. The winner computer.");
					compW++;
				} else if (computer == 2) {
					System.out.println("User is rock. Computer is scissors. The winner user.");
					userW++;
				}
			} else if (user == 1) {
				if (computer == 0) {
					System.out.println("User is paper. Computer is rock. The winner user.");
					userW++;
				} else if (computer == 2) {
					System.out.println("Computer is rock. User is scissors. The winner computer.");
					compW++;
				}
			} else if (user == 2) {
				if (computer == 0) {
					System.out.println("User is scissors. Computer is rock. The winner computer.");
					compW++;
				} else if (computer == 1) {
					System.out.println("Computer is paper. User is scissors. The winner user.");
					userW++;
				}
			}

		}
		System.out.println("****END OF THE GAME****");
		input.close();
	}

}
