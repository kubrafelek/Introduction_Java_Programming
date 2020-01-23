package chapter07;

import java.util.Scanner;

public class S_02 {

	public static void main(String[] args) {
		int array[] = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		int[] reverse = new int[10];
		int count = array.length - 1;
		for (int i = 0; i < reverse.length; i++) {
			reverse[i] = array[count];
			count--;
		}
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i] + " ");
		}
		input.close();
	}
}
