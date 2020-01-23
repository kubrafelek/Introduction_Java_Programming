package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class S_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten double numbers: ");
		int sizeOfArray = input.nextInt();
		double list[] = new double[sizeOfArray];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}
		/** The list is largest till smallest **/
		for (int i = 0; i < list.length; i++) {
			double max = list[i];
			int maxIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (max < list[j]) {
					max = list[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				list[maxIndex] = list[i];
				list[i] = max;
			}
		}
		System.out.println(Arrays.toString(list));
		/** The list is smallest till largest **/
		for (int i = 0; i < list.length; i++) {
			double max = list[i];
			int maxIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (max > list[j]) {
					max = list[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				list[maxIndex] = list[i];
				list[i] = max;
			}
		}
		System.out.println(Arrays.toString(list));
		input.close();
	}

}
