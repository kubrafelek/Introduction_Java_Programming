package chapter06;

public class S_01 {

	public static void main(String[] args) {

		int number = 1;
		int countOfPentagonal = 0;
		while (countOfPentagonal < 100) {
			if ((countOfPentagonal) % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%6d |", getPentagonalNumber(number));
			;
			number++;
			countOfPentagonal++;
		}
	}

	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}
