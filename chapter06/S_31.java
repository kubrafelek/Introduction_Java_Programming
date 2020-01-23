package chapter06;

import java.util.Scanner;

public class S_31 {

	public static void main(String[] args) {
		// 4388576018410707
		// 4388576018402626
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer: ");
		long cardNumber = input.nextLong();
		if (isValid(cardNumber)) {
			System.out.println(cardNumber + " is valid.");
		} else {
			System.out.println(cardNumber + " is invalid.");
		}
		input.close();

	}

	public static boolean isValid(long cardNumber) {
		if (getSize(cardNumber) < 13 || getSize(cardNumber) > 16) {
			return false;
		}
		if ((sumOfEvenPlace(cardNumber) + sumOfOddPlace(cardNumber)) % 10 != 0) {
			return false;
		}
		if (prefixMatched(cardNumber, 4) || prefixMatched(cardNumber, 5) || prefixMatched(cardNumber, 6)
				|| prefixMatched(cardNumber, 37)) {
			return true;
		}
		return false;
	}

	public static int sumOfEvenPlace(long cardNumber) {
		int sum = 0;
		while (cardNumber > 0) {
			cardNumber /= 10;
			int digit = (int) (cardNumber % 10);
			int sumOfDigits = 0;

			if (digit * 2 > 9) {
				int number = (digit * 2);
				int d1 = number % 10;
				number /= 10;
				sumOfDigits = number + d1;
				sum += sumOfDigits;
			} else {
				sum += digit * 2;
			}
			cardNumber /= 10;
		}
		return sum;
	}

	public static int sumOfOddPlace(long cardNumber) {
		return getDigit(cardNumber);
	}

	public static int getDigit(long cardNumber) {
		int sum = 0;
		while (cardNumber > 0) {
			int digit = (int) (cardNumber % 10);
			sum += digit;
			cardNumber /= 100;
		}
		return sum;
	}

	public static boolean prefixMatched(long cardNumber, int i) {
		return getPrefix(cardNumber, getSize(i)) == i;
	}

	public static long getPrefix(long cardNumber, int size) {
		if (getSize(cardNumber) > size) {
			String number = cardNumber + "";
			return Long.parseLong(number.substring(0, size));
		}
		return cardNumber;
	}

	public static int getSize(long cardNumber) {
		String sizeCardNumber = cardNumber + "";
		return sizeCardNumber.length();
	}

}
