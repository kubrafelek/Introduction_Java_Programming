package chapter06;

import java.util.Scanner;

public class S_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		printMatrix(number);
		input.close();
	}

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int random = (int) (Math.random() * 2);
				System.out.print(random + " ");
			}
			System.out.println();
		}
	}
}
