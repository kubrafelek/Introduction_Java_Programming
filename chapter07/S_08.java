package chapter07;

import java.util.Scanner;

public class S_08 {

	public static void main(String[] args) {

		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten values: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("INTEGER: " + average(array));
		System.out.println("DOUBLE: " + average(array));
		input.close();
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (sum / 10);
	}

	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (sum / 10);
	}
}
