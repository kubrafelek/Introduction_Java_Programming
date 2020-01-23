package chapter07;

import java.util.Scanner;

public class S_10 {

	public static void main(String[] args) {

		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("The smallest index of " + indexOfSmallestElement(array));
		input.close();

	}

	public static int indexOfSmallestElement(double[] array) {

		int index = 0;
		double min = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}

}
