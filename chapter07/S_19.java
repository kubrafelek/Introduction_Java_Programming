package chapter07;

import java.util.Scanner;

public class S_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int sizeOfList = input.nextInt();
		int list[] = new int[sizeOfList];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		if (isSorted(list)) {
			System.out.println("The list is already sorted");
		} else {
			System.out.println("The list is not sorted");
		}
		input.close();
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0, j = 1; i < list.length; i++, j++) {
			if (list[i] > list[j]) {
				return false;
			}
		}
		return true;
	}

}
