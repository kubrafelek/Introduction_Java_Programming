package chapter08;

import java.util.Scanner;

public class S_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		System.out.println("Enter matrix1: ");
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				matrix1[row][col] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix2: ");
		for (int row = 0; row < matrix2.length; row++) {
			for (int col = 0; col < matrix2[row].length; col++) {
				matrix2[row][col] = input.nextDouble();
			}
		}
		double multip[][] = multiplyMatrix(matrix1, matrix2);
		System.out.println("Sum is : ");
		for (int row = 0; row < multip.length; row++) {
			for (int col = 0; col < multip.length; col++) {
				System.out.printf("%3.1f\t", multip[row][col]);
			}
			System.out.println();
		}
		input.close();
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double array[][] = new double[3][3];

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {

				for (int i = 0; i < array.length; i++) {
					double sum = 0;
					for (int j = 0; j < array.length; j++) {
						sum += (a[i][j] * b[j][i]);
					}
					array[row][i] = sum;
				}
			}
		}
		return array;
	}

}
//1 2 3 4 5 6 7 8 9
//0 2 4 1 4,5 2,2 1,1 4,3 5,2	