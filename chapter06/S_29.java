package chapter06;

public class S_29 {

	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		while (count < 1_000) {
			if (twinPrimes(number) && twinPrimes(number + 2)) {
				count++;
				System.out.println("(" + number + "," + (number + 2) + ")");
			}
			number++;
		}
	}

	public static boolean twinPrimes(int number) {

		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
