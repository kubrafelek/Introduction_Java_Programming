package chapter07;

import java.util.Scanner;

public class S_11 {

	public static void main(String[] args) {

		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("The mean is " + String.format("%3.2f", mean(array)));
		System.out.println("The standart deviation is " + String.format("%6.5f", deviation(array)));
		input.close();
	}

	public static double deviation(double[] x) {
		double stanDev = 0;
		for (int i = 0; i < x.length; i++) {
			stanDev += (Math.pow(x[i] - mean(x), 2) / 9);
		}
		return Math.sqrt(stanDev);
	}

	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / 10;
	}
}
