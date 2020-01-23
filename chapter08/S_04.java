package chapter08;

import java.util.Arrays;

public class S_04 {

	public static void main(String[] args) {

		int[][] array = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		int order[] = new int[8];
		int totalWorkHours = 0;
		for (int row = 0; row < array.length; row++) {
			totalWorkHours = 0;
			for (int col = 0; col < array[row].length; col++) {
				totalWorkHours += array[row][col];
			}
			order[row] = totalWorkHours;
		}
		Arrays.sort(order);
		for (int i = 0; i < order.length; i++) {
			System.out.println((i + 1) + ". employee work " + order[i] + " of the week.");
		}
	}

}
