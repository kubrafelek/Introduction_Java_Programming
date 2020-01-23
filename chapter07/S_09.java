package chapter07;

import java.util.Scanner;

public class S_09 {

	public static void main(String[] args) {

		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("The minimum number is: " + min(array));
		input.close();
	}

	public static double min(double[] array) {
		double min = 0;
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			if (array[i] < array[j]) {
				min = array[i];
			} else {
				min = array[j];
				break;
			}
		}
		return min;
	}
}
