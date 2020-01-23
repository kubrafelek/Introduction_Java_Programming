package chapter08;

import java.util.Scanner;

public class S_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a row and column: ");
		int row = input.nextInt();
		int col = input.nextInt();
		int matrix[][] = new int[row][col];
		System.out.println("Enter a matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("The matris is consecutive four " + isConsecutiveFour(matrix));
		input.close();
	}

	public static boolean isConsecutiveFour(int[][] values) {
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = 1; j < values[i].length; j++) {
				if (values[i][j - 1] == values[i][j])
					count++;
				if (count == 4) {
					return true;
				}
			}
		}
		count = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = 1; j < values.length; j++) {
				if (values[j - 1][i] == values[j][i])
					count++;
				if (count == 4) {
					return true;
				}
			}
		}
		count = 0;
		for (int i = 1, j = 1; i < values.length && j < values.length; i++, j++) {
			if (values[i - 1][j - 1] == values[i][j])
				count++;
			if (count == 4) {
				return true;
			}
		}
		return false;
	}
}
