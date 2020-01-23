package chapter07;

import java.util.Scanner;

public class S_04 {

	public static void main(String[] args) {

		int[] score = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a scores: ");
		double average = 0;
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = input.nextInt();
			count++;
			if (score[i] < 0) {
				break;
			}
		}
		int countOfAboveOrEqual = 0;
		int countOfBelow = 0;
		for (int i1 = 0; i1 < score.length; i1++) {
			average += score[i1];
			average = average / count;
			if (score[i1] >= average) {
				countOfAboveOrEqual++;
			} else {
				countOfBelow++;
			}
		}
		System.out.println("Average is " + average);
		System.out.println("Count of below is " + countOfBelow);
		System.out.println("Count of above or equals are " + countOfAboveOrEqual);
		input.close();
	}

}
