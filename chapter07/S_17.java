package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class S_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		String names[] = new String[numberOfStudents];
		int scores[] = new int[numberOfStudents];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("Enter name: ");
			names[i] = input.next();
			System.out.print("Enter score: ");
			scores[i] = input.nextInt();
		}

		for (int i = 0; i < scores.length; i++) {
			int max = scores[i];
			int maxIndex = i;
			String maxName = names[i];
			for (int j = i + 1; j < scores.length; j++) {
				if (max > scores[j]) {
					max = scores[j];
					maxName = names[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				scores[maxIndex] = scores[i];
				scores[i] = max;

				names[maxIndex] = names[i];
				names[i] = maxName;
			}
		}
		System.out.println(Arrays.toString(scores));
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " , ");
		}
		input.close();
	}

}
