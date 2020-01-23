package chapter06;

import java.util.Scanner;

public class S_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		displaySortedNumbers(n1, n2, n3);
		input.close();
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double swap = num1;
		num1 = num2;
		num2 = num3;
		num3 = swap;

		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num3 + " , " + num2 + " , " + num1);
			} else {
				System.out.println(num2 + " , " + num2 + " , " + num1);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num3 + " , " + num1 + " , " + num2);
			} else {
				System.out.println(num1 + " , " + num3 + " , " + num2);
			}
		} else if (num3 > num2 && num3 > num1) {
			if (num1 > num2) {
				System.out.println(num2 + " , " + num1 + " , " + num3);
			} else {
				System.out.println(num1 + " , " + num2 + " , " + num3);
			}
		}
	}
}
