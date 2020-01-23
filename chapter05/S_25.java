package bolum05;

public class S_25 {

	public static void main(String[] args) {
		calculatePi(10_000);
		calculatePi(20_000);
		calculatePi(100_000);
		calculatePi(1_000_000);
		calculatePi(10_000_000);
		calculatePi(100_000_000);
		calculatePi(1_000_000_000);

	}

	public static double calculatePi(int n) {
		double pi = 0;

		for (double i = 1.0; i <= n; i++) {
			pi += (Math.pow(-1, i + 1)) / (2 * i - 1);
		}
		System.out.println("The value of pi " + (4 * pi) + " for " + n);

		return pi;
	}

}
