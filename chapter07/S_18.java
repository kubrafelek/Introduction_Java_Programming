package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class S_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten double numbers: ");
		double list[] = new double[3];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}
		for (int k = 0; k < list.length; k++) {
			for (int i = 0, j = i + 1; i < list.length && j < list.length; i++, j++) {
				if (list[i] > list[i + 1]) {
					double swap = list[i];
					list[i] = list[i + 1];
					list[i + 1] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(list));
		input.close();
	}

}
