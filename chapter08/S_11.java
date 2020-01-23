package chapter08;

import java.util.Scanner;

public class S_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();

		int matrix[][] = new int[3][3];
		for (int row = matrix.length - 1; row >= 0; row--) {
			for (int col = matrix.length - 1; col >= 0; col--) {
				matrix[row][col] = number % 2;
				number /= 2;
			}
		}
		char[][] newMatrix = new char[3][3];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				if (matrix[row][col] == 0) {
					newMatrix[row][col] = 'H';
				} else {
					newMatrix[row][col] = 'T';
				}
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(newMatrix[row][col] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
