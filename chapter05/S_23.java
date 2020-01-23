package bolum05;

public class S_23 {

	public static void main(String[] args) {

		double sum = 0;
		for (double i = 50_000; i >= 1; i--) {
			sum += 1 / i;
		}
		System.out.println("Sum: " + sum);

		sum = 0;
		for (double i = 1; i <= 50_000; i++) {
			sum += 1 / i;
		}
		System.out.println("Sum: " + sum);
	}
}
