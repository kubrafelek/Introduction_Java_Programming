package chapter07;

import java.util.Scanner;

public class S_14 {

	public static void main(String[] args) {

		int array[] = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println(gcd(array));
		input.close();
	}

	public static int gcd(int... numbers) {

		int gcd = 1;
		int divisor = 2;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divisor == 0) {
				gcd = divisor;
			} else {
				divisor++;
			}
		}
		return gcd;
	}

}
