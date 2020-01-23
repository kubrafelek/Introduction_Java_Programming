package chapter08;

import java.util.Scanner;

public class S_05 {

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
		double add[][] = addMatrix(matrix1, matrix2);
		System.out.println("Sum is : ");
		for (int row = 0; row < add.length; row++) {
			for (int col = 0; col < add.length; col++) {
				System.out.print(add[row][col] + "  ");
			}
			System.out.println();
		}
		input.close();
	}

//1 2 3 4 5 6 7 8 9
//	0 2 4 1 4,5 2,2 1,1 4,3 5,2
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double sum[][] = new double[3][3];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				sum[row][col] = a[row][col] + b[row][col];
			}
		}
		return sum;
	}
}
