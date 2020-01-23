package chapter07;

import java.util.Scanner;

public class S_15 {

	public static void main(String[] args) {

		int array[] = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("The distinct numbers are: ");
		int[] list = eliminateDuplicates(array);
		for (int i = 0; i < array.length; i++) {
			if (list[i] != 0) {
				System.out.print(list[i] + " ");
			}
		}
		input.close();
	}

	public static int[] eliminateDuplicates(int[] list) {
		int eliminateArray[] = new int[10];

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] == list[j]) {
					list[j] = 0;
				}
				eliminateArray[i] = list[i];
			}
		}
		return eliminateArray;
	}
}
