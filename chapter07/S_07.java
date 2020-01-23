package chapter07;

import java.util.Arrays;

public class S_07 {

	public static void main(String[] args) {

		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			int number = (int) (Math.random() * 10);
			array[i] = number;
		}
		System.out.print(Arrays.toString(array));

		int[] count = new int[10];
		for (int i = 0; i < count.length; i++) {
			for (int k = 0; k < array.length; k++) {
				if (array[k] == i) {
					count[i]++;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "'s = " + count[i]);
		}
	}
}
