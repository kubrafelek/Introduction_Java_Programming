package bolum05;

import java.util.Scanner;

public class GSE_S_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();

		double score1 = Integer.MAX_VALUE;
		String name1 = "";
		double score2 = Integer.MAX_VALUE;
		String name2 = "";

		for (int i = 0; i < numOfStudents; i++) {
			System.out.print("Enter a student name: ");
			String student = input.next();

			System.out.print("Enter a student score: ");
			double score = input.nextDouble();
			
			if (score1 > score) {
				score2 = score1;
				name2 = name1;
				
				score1 = score;
				name1 = student;
			} else if(score2 > score) {
				score2 = score;
				name2 = student;
			}
			
			System.out.println("Last student " + name1 + "'s score is " + score1);
			System.out.println("Second last student " + name2 + "'s score is " + score2);

		}

		input.close();
	}
}
