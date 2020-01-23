package chapter08;

import java.util.Scanner;

public class S_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 6-by-6 matrix row by row: ");
		int matrix[][] = new int[6][6];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = input.nextInt();
			}
		}

		int rowNumber = findRows1s(matrix);
		int colNumber = findCols1s(matrix);
		System.out.println("The flipped cell is at (" + rowNumber + "," + colNumber + ")");

		input.close();
	}

	public static int findRows1s(int[][] matrix) {
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			count = 0;
			for (int col = 0; col < matrix.length; col++) {
				if (matrix[row][col] == 1) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return row;
			}
		}
		return -1;
	}

	public static int findCols1s(int[][] matrix) {
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			count = 0;
			for (int col = 0; col < matrix.length; col++) {
				if (matrix[col][row] == 1) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return row;
			}
		}
		return -1;
	}

}
