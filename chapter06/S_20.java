package chapter06;

import java.util.Scanner;

public class S_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();

		System.out.println("Count of string: " + countLetters(str));
		input.close();
	}

	public static int countLetters(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 0) {
				count++;
			}
		}
		return count;
	}
}
