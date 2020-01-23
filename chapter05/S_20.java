package bolum05;

public class S_20 {

	public static void main(String[] args) {

		final int NUMBER_OF_PRIMES = 1_000;
		final int NUMBER_OF_PRIMES_PER_LINE = 8;

		int count = 0;
		int number = 2;

		System.out.println("Display prime numbers between 2 and 1_000: ");

		while (number < NUMBER_OF_PRIMES) {
			boolean isPrime = true;

			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // if number not prime execute that line
					isPrime = false;
					break;
				}
			}

			if (isPrime) {// if number prime add count
				count++;
				System.out.printf("%5d", number);

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {// also check each line should be eight prime numbers
					System.out.println();// if count = 8 next line and repeat while loops
				}
			}
			number++;
		}
	}

}
