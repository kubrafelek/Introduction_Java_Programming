package chapter06;

public class S_14 {

	public static void main(String[] args) {

		System.out.println("i\tm(i)");
		System.out.println("------------");

		for (int i = 1; i <= 901; i += 100) {
			System.out.println(i + "\t" + String.format("%5.4f", m(i)));
		}
	}

	public static double m(double n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (Math.pow(-1, i + 1)) / (2 * i - 1);
		}
		return 4 * sum;
	}

}
