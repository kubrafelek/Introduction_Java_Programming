package chapter08;

import java.util.Scanner;

public class S_28 {
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
		if (equals(list1, list2) == true) {
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}
		input.close();
	}

	public static boolean equals(int[][] m1, int[][] m2) {

		for (int row = 0; row < m2.length && row < m2.length; row++) {
			for (int col = 0; col < m2.length && col < m2.length; col++) {
				if (m1[row][col] != m2[row][col]) {
					return false;
				}
			}
		}
		return true;
	}
}
