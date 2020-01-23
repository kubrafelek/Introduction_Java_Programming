package chapter07;

import java.util.Arrays;

public class S_06 {
	public static void main(String[] args) {
		final int NUM_OF_PRIMES = 100;

		int[] primeNumbers = new int[NUM_OF_PRIMES];
		int count = 0;
		int number = 2;
		boolean isPrime = true;

		System.out.println("The first 100 prime numbers are \n");
		while (count < NUM_OF_PRIMES) {

			isPrime = true;
			for (int i = 0; i < count && primeNumbers[i] <= Math.sqrt(number); i++) {
				if (number % primeNumbers[i] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumbers[count] = number;
				count++;
			}
			number++;
		}
		System.out.println(Arrays.toString(primeNumbers));
	}
}