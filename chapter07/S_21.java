package chapter07;

import java.util.Scanner;

public class S_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		System.out.print("\nEnter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		int slots[] = new int[numberOfSlots];

		int countOfRight = 0;
		int rand;
		for (int j = 0; j < numberOfBalls; j++) {
			countOfRight = 0;
			for (int i = 1; i < slots.length; i++) {
				rand = (int) (Math.random() * 2);
				if (rand == 0) {
					countOfRight++;
					System.out.print("R");
				} else {
					System.out.print("L");
				}
			}
			slots[countOfRight - 1] += 1;
			System.out.println();
		}
		System.out.println();
		fallInBalls(slots);
		input.close();
	}

	public static void fallInBalls(int[] slots) {
		for (int i = 0; i < slots.length; i++) {
			int count = slots[i];
			while (count > 0) {
				System.out.print("O");
				System.out.println();
				count--;
			}
			System.out.print(" ");
		}
	}
}
