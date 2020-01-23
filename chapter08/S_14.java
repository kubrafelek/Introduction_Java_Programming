package chapter08;

import java.util.Scanner;

public class S_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int sizeOfMatrix = input.nextInt();

		int matrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = (int) (Math.random() * 2);
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		checkRow(matrix, sizeOfMatrix);
		checkCol(matrix, sizeOfMatrix);
		checkMajorDiagonal(matrix, sizeOfMatrix);
		checkSubDiagonal(matrix, sizeOfMatrix);
		input.close();
	}

	public static void checkRow(int[][] matrix, int sizeOfMatrix) {
		for (int row = 0; row < matrix.length; row++) {
			int countOfZero = 0;
			int countOfOne = 0;
			for (int col = 0; col < matrix.length; col++) {
				if (matrix[row][col] == 0) {
					countOfZero++;
				} else {
					countOfOne++;
				}
				if (countOfOne == sizeOfMatrix) {
					System.out.println("All 1s on row " + row);
				}
				if (countOfZero == sizeOfMatrix) {
					System.out.println("All 0s on row " + row);
				}
			}
		}
	}

	public static void checkCol(int[][] matrix, int sizeOfMatrix) {
		int countOfColZero = 0;
		int countOfColOne = 0;
		int col = 0;
		for (col = 0; col < matrix.length; col++) {
			countOfColZero = 0;
			countOfColOne = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col] == 0) {
					countOfColZero++;
				} else {
					countOfColOne++;
				}
			}
		}
		if (countOfColOne == sizeOfMatrix) {
			System.out.println("All 1s on col " + col);
		}
		if (countOfColZero == sizeOfMatrix) {
			System.out.println("All 0s on col " + col);

		}
	}

	public static void checkMajorDiagonal(int[][] matrix, int sizeOfMatrix) {

		int countOne = 0;
		int countZero = 0;

		for (int row = 0, col = 0; row < matrix.length && col < matrix.length; row++, col++) {
			if (matrix[row][col] == 0) {
				countZero++;
			} else {
				countOne++;
			}
		}
		if (countOne == sizeOfMatrix || countZero == sizeOfMatrix) {
			System.out.println("Same numbers on the major diagonal");
		} else {
			System.out.println("No same numbers on the major diagonal");
		}
	}

	public static void checkSubDiagonal(int[][] matrix, int sizeOfMatrix) {

		int countOne = 0;
		int countZero = 0;
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 1 + row; col < matrix.length; col++) {
				if (matrix[row][col] == 0) {
					countZero++;
				} else {
					countOne++;
				}
				count++;
			}
		}
		if (countOne == count || countZero == count) {
			System.out.println("Same numbers on the sub diagonal");
		} else {
			System.out.println("No same numbers on the sub diagonal");
		}

	}
}
