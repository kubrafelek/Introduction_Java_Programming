package chapter07;

import java.util.Scanner;

public class S_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		int[] array = new int[numberOfStudents];
		System.out.println("Enter " + numberOfStudents + " scores: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		String grade = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max - 10) {
				grade = "A";
			} else if (array[i] >= max - 20) {
				grade = "B";
			} else if ((array[i] >= max - 30)) {
				grade = "C";
			} else if ((array[i] >= max - 30)) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("Student " + i + " score is " + array[i] + " and grade is " + grade);
		}

		input.close();
	}
}