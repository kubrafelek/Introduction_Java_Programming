package chapter08;

import java.util.Scanner;

public class S_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double matrix[][] = new double[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		double newMatrix[][] = sortColumns(matrix);
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.printf("%4.3f" ,newMatrix[row][col]);
				System.out.print(" ");
			}
			System.out.println();
		}
		input.close();
	}

	public static double[][] sortColumns(double[][] m) {
		for (int col = 0; col < m.length; col++) {
			for (int i = 0; i < m.length; i++) {
				double max = m[i][col];
				int index = i;
				for (int j = i + 1; j < m.length; j++) {
					if (max > m[j][col]) {
						max = m[j][col];
						index = j;
					}
				}
				if (index != i) {
					double swap = m[index][col];
					m[index][col] = m[i][col];
					m[i][col] = swap;
				}
			}
		}
		return m;
	}
}
