package chapter08;

import java.util.Scanner;

public class S_01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		double array[][] = new double[3][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Sum of the elements at column " + sumColumn(array, i));
		}
		input.close();
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sumOfCol = 0;
		for (int row = 0; row < m.length; row++) {
			sumOfCol += m[row][columnIndex];
		}
		return sumOfCol;
	}
}
//1,5 2 3 4
//5,5 6 7 8
//9,5 1 3 1