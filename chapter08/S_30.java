package chapter08;

import java.util.Scanner;

public class S_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f:  ");
		double[][] array1 = new double[2][2];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				array1[i][j] = input.nextDouble();
			}
		}
		double[] array2 = new double[2];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextDouble();
		}
		double result[] = linearEquation(array1, array2);
		if ((array1[0][0] * array1[1][1]) - (array1[0][1] * array1[1][0]) != 0) {
			System.out.println("x is " + result[0] + " and y is " + result[1]);
		} else {
			System.out.println("Equation has no solution!");
		}
		input.close();
	}

	public static double[] linearEquation(double[][] a, double[] b) {

		double[] linear = new double[2];
		linear[0] = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
		linear[1] = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
		return linear;
	}
}
//9.0 4.0 3.0 -5.0 -6.0 -21.0
//1.0 2.0 2.0 4.0 4.0 5.0