package chapter07;

import java.util.Scanner;

public class S_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int list1[] = new int[6];
		System.out.println("Enter list1: ");
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		int list2[] = new int[6];
		System.out.println("Enter list1: ");
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		if (equals(list1, list2) == true)
			System.out.println("Two lists are identical");
		else
			System.out.println("Two lists are not identical");
		input.close();
	}

	public static boolean equals(int[] list1, int[] list2) {
		int countOfList1 = 0;
		for (int i = 0; i < list1.length; i++) {
			countOfList1 = 0;
			for (int j = 0; j < list1.length; j++) {
				if (list1[i] == list1[j]) {
					countOfList1++;
				}
			}
		}
		int countOfList2 = 0;
		for (int i = 0; i < list2.length; i++) {
			countOfList2 = 0;
			for (int j = 0; j < list2.length; j++) {
				if (list2[i] == list2[j]) {
					countOfList2++;
				}
			}
		}
		if (countOfList1 == countOfList2)
			return true;
		else
			return false;
	}
}
