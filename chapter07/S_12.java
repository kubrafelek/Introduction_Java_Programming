package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class S_12 {

	public static void main(String[] args) {
		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println(Arrays.toString(reverse(array)));
		input.close();
	}

	public static double[] reverse(double[] array) {
		double[] reverseArray = new double[10];
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			reverseArray[i] = array[j];
		}
		return reverseArray;
	}

}
