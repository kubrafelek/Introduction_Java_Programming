package chapter07;

import java.util.Scanner;

public class S_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the values: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		if (isConsecutiveFour(array)) {
			System.out.println("The list has consecutive fours");
		} else {
			System.out.println("The list has no consecutive fours");
		}
		input.close();
	}

	public static boolean isConsecutiveFour(int[] values) {
		int count = 0;
		for (int i = 0, j = i + 1; i < values.length && j < values.length; i++, j++) {
			if (values[i] == values[j]) {
				count++;
			}
		}
		if (count == 3) {
			return true;
		}
		return false;

	}
}
