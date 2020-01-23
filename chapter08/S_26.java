package chapter08;

import java.util.Scanner;

public class S_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double matrix[][] = new double[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		double newMatrix[][] = sortRows(matrix);
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(newMatrix[row][col] + " ");
			}
			System.out.println();
		}
		input.close();
	}

	public static double[][] sortRows(double[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int i = 0; i < m.length; i++) {
				double max = m[row][i];
				int index = i;
				for (int j = i + 1; j < m.length; j++) {
					if (max > m[row][j]) {
						max = m[row][j];
						index = j;
					}
				}
				if (index != i) {
					double swap = m[row][index];
					m[row][index] = m[row][i];
					m[row][i] = swap;
				}
			}
		}
		return m;
	}
}
/*
 * 0,15 0,875 0,375 0,55 0,005 0,225 0,30 0,12 0,4
 */