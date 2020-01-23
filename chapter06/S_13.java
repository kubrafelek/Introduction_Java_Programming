package chapter06;

public class S_13 {

	public static void main(String[] args) {

		System.out.println("i\tm(i)");
		System.out.println("--------------");
		double sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += sum(i);
			System.out.println(i + "\t" + String.format("%-5.4f", sum));
		}
	}

	public static double sum(double number) {
		return (number / (number + 1));
	}
}
