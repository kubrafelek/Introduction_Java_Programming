package chapter08;

import java.util.Scanner;

public class S_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		double array[][] = new double[4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(array));
		input.close();
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sumOfDiagonal = 0;
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m.length; col++) {
				if (row == col) {
					sumOfDiagonal += m[row][col];
				}
			}
		}
		return sumOfDiagonal;
	}
}
/*
 * 1 2 3 4,0 5 6,5 7 8 9 10 11 12 13 14 15 16
 */