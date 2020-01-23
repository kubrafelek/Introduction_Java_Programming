package chapter06;

public class S_27 {

	public static void main(String[] args) {

		int number = 1;
		int count = 0;
		while (count < 100) {
			if (isPrime(number) && isPrime(reverse(number))) {
				count++;
				System.out.printf("%5d", number);
				if (count % 10 == 0) {
					System.out.println();
				}
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

	public static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			int digit = number % 10;
			number /= 10;
			reverse = digit + (reverse * 10);
		}
		return reverse;
	}
}
