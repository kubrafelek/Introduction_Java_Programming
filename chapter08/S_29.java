package chapter08;

import java.util.Scanner;

public class S_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int list1[][] = new int[3][3];
		int list2[][] = new int[3][3];
		System.out.print("Enter list1: ");
		for (int row = 0; row < list1.length; row++) {
			for (int col = 0; col < list1.length; col++) {
				list1[row][col] = input.nextInt();
			}
		}
		System.out.print("Enter list2: ");
		for (int row = 0; row < list2.length; row++) {
			for (int col = 0; col < list2.length; col++) {
				list2[row][col] = input.nextInt();
			}
		}
		if (equals(list1, list2) == false) {
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}
		input.close();
	}

	public static boolean equals(int[][] m1, int[][] m2) {

		int count = 0;
		for (int k = 0; k < m2.length && k < m1.length; k++) {
			for (int i = 0 + k; i < m2.length && i < m1.length; i++) {
				for (int j = 0 + k; j < m2.length && i < m1.length; j++) {
					if (m1[k][i] == m2[i][j]) {
						count++;
					}
				}
			}
		}
		if (count == m1.length) {
			return true;
		}
		return false;
	}
}
//51 5 22 6 1 4 24 54 6
//51 22 25 6 1 4 24 54 6