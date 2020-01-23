package chapter06;

public class S_04 {

	public static void main(String[] args) {

		reverse(3456);
	}
	public static void reverse(int number) {
		String reverse = "";
		while(number > 0) {
			int digit = number % 10;
			reverse = reverse + digit;
			number /= 10;
		}
		System.out.println(reverse);
	}
}
