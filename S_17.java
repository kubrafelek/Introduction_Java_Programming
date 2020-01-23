package bolum03;

import java.util.Scanner;

/*(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.*/

public class S_17 {

	public static void main(String[] args) {
		int computer = (int) (Math.random() * 2) + 1;
		Scanner input = new Scanner(System.in);
		System.out.println("scissor(0), rock(1), paper(2): ");
		int user = input.nextInt();
		if (user == 0) {
			if (computer == 0) {
				System.out.println("The computer is scissor. You are scissor too.  Anyone did not win.");
			} else if (computer == 1) {
				System.out.println("The computer is rock. You are scissor. The computer won!!!");
			} else if (computer == 2) {
				System.out.println("The computer is paper. You are scissor. You won!");
			}
		} else if (user == 1) {
			if (computer == 0) {
				System.out.println("The computer is scissor. You are rock. You won!");
			} else if (computer == 1) {
				System.out.println("The computer is rock. You are rock too.  Anyone did not win.");
			} else if (computer == 2) {
				System.out.println("The computer is paper. You are rock. The computer won!!!");
			}
		} else if (user == 2) {
			if (computer == 0) {
				System.out.println("The computer is scissor. You are paper. The computer won!!!");
			} else if (computer == 1) {
				System.out.println("The computer is rock. You are paper. You won!");
			} else if (computer == 2) {
				System.out.println("The computer is paper. You are paper too. Anyone did not win.");
			}
		}
		input.close();
	}
}
