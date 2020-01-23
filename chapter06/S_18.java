package chapter06;

import java.util.Scanner;

public class S_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String psw = input.nextLine();
		if (checkPassword(psw)) {
			System.out.println("Valid password...");
		} else {
			System.out.println("Invalid password...");
		}

		input.close();
	}

	public static boolean checkPassword(String psw) {

		if (psw.length() < 8) {
			return false;
		}
		for (int i = 0; i < psw.length(); i++) {
			if (!Character.isDigit(psw.charAt(i)) && !Character.isLetter(psw.charAt(i))) {
				return false;
			}
		}
		int countOfDigit = 0;
		for (int i = 0; i < psw.length(); i++) {
			if (Character.isDigit(psw.charAt(i))) {
				countOfDigit++;
			}
		}
		if (countOfDigit < 2) {
			return false;
		}
		return true;
	}
}
