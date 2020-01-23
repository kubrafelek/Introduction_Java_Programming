package chapter08;

import java.util.Scanner;

public class S_36 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number n: ");
		int n = input.nextInt();

		String[][] matrix = new String[n][n];
		System.out.println("Enter 4 rows of letters separated by spaces: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = input.next();
			}
		}

		if (isLetter(matrix) == false) {
			System.out.println("Wrong input: the letters must be from A to C");
		} else {
			System.out.println("The input array is a Latin square");
		}

		input.close();
	}

	public static boolean isLetter(String[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				if (!isValidLetter(matrix[row][col].charAt(0))) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isValidLetter(char ch) {
		return (ch >= 'C' && ch <= 'A');
	}
}
