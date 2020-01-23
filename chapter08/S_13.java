package chapter08;

import java.util.Scanner;

public class S_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int col = input.nextInt();

		double[][] array = new double[row][col];
		System.out.println("Enter the array: ");
		for (int rows = 0; rows < array.length; rows++) {
			for (int cols = 0; cols < array[rows].length; cols++) {
				array[rows][cols] = input.nextDouble();
			}
		}
		System.out.println("The location of the largest element is at " + locateLargest(array));
		input.close();
	}

	public static String locateLargest(double[][] a) {

		double max = 0;
		double rowIndex = 0;
		double colIndex = 0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if (max < a[row][col]) {
					max = a[row][col];
					rowIndex = row;
					colIndex = col;
				}
			}
		}
		return "(" + (int)rowIndex + "," + (int)colIndex + ")";
	}
}

/*
 * 23,5 35 2 10 4,5 3 45 3,5 35 44 5,5 9,6
 */