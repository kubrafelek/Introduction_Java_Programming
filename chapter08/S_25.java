package chapter08;

import java.util.Scanner;

public class S_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double matrix[][] = new double[3][3];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}
		System.out.println(isMarkovMatrix(matrix) ? " It is a Markov matrix " : " It is not a Markov matrix ");
		input.close();
	}

	public static boolean isMarkovMatrix(double[][] m) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m.length; col++) {
				sum += m[row][col];
				if (sum != 1 && m[row][col] < 0)
					return false;
			}
		}

		return true;
	}
}
/*
 * 0,15 0,875 0,375 0,55 0,005 0,225 0,30 0,12 0,4
 */