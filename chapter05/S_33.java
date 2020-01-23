package bolum05;

public class S_33 {

	public static void main(String[] args) {

		int sumOfDivisor = 0;
		int numberOfPerfect = 0;

		for (int i = 1; i < 1_000_000_000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sumOfDivisor += j;
				}
			}
			if (sumOfDivisor == i) {
				System.out.printf("%-5d\n", i , " is a perfect number");
				numberOfPerfect++;
			}
			sumOfDivisor = 0;
		}
		System.out.println("Total number of perfect number is " + numberOfPerfect);
	}

}
