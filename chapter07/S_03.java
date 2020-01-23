package chapter07;

import java.util.Scanner;

public class S_03 {

	public static void main(String[] args) {

		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100:");

		while (true) {
			int number = -1;
			for (int i = 0; i < array.length; i++) {
				number = input.nextInt();
				array[i] = number;
			}
			if (number == 0) {
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			System.out.println(array[i] + " occurs " + (count) + " times");
		}
		input.close();
	}
}
