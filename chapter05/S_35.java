package bolum05;

public class S_35 {

	public static void main(String[] args) {

		double sum = 0;

		for (double i = 1.0; i <= 624; i++) {
			sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}

		System.out.println("Sum: " + sum);
	}

}
