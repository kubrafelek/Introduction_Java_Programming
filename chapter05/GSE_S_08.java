package bolum05;

import java.util.Scanner;

public class GSE_S_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numberOfStudents = input.nextInt();

		System.out.println("Enter a score: ");
		int score1 = input.nextInt();

		System.out.println("Enter a name: ");
		String name1 = input.next();

		int count = 1;
		while (count < numberOfStudents) {

			System.out.println("Enter a score: ");
			int score = input.nextInt();

			System.out.println("Enter a name: ");
			String name = input.next();

			if (score1 > score) {
				score1 = score;
				name1 = name;
			}
			count++;
		}
		System.out.println("Lowest name: " + name1 + " Lowest score: " + score1);
		input.close();
	}

}
