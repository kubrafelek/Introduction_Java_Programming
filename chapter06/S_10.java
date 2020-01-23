package chapter06;

public class S_10 {

	public static void main(String[] args) {

		int number = 1;
		int count = 0;
		while (count < 10_000) {
			if (isPrime(number)) {
				count++;
				if ((count - 1) % 10 == 0) {
					System.out.println();
				}
				System.out.printf("%7d", number);
			}
			number++;
		}
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;

			}
		}
		return true;
	}
}
