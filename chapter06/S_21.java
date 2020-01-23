package chapter06;

import java.util.Scanner;

public class S_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		String newStr = " ";
		for (int i = 0; i < str.length(); i++) {
			while (Character.isDigit(str.charAt(i))) {
				newStr = newStr + str.charAt(i);
				if (!Character.isDigit(str.charAt(i)))
					break;
			}
			newStr += getNumber(str.toUpperCase().charAt(i));
		}
		System.out.println(newStr);

		input.close();
	}

	public static int getNumber(char uppercaseLetter) {

		if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
			uppercaseLetter = 2;
		} else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
			uppercaseLetter = 3;
		} else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
			uppercaseLetter = 4;
		} else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
			uppercaseLetter = 5;
		} else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
			uppercaseLetter = 6;
		} else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R'
				|| uppercaseLetter == 'S') {
			uppercaseLetter = 7;
		} else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
			uppercaseLetter = 8;
		} else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y'
				|| uppercaseLetter == 'Z') {
			uppercaseLetter = 9;
		}
		return uppercaseLetter;
	}
}
