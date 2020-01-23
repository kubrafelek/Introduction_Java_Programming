package chapter06;

public class S_37 {

	public static void main(String[] args) {
		System.out.println(format(34, 1));
		System.out.println(format(34, 4));
		System.out.println(format(34, 5));
	}

	public static String format(int number, int width) {

		String str = "";
		for (int i = 0; i <= width; i++) {
			int digit = number % 10;
			number /= 10;
			str = digit + str;
		}
		return str;
	}
}
