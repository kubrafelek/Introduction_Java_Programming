package bolum04;

/*(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
uppercase letters followed by four digits. Write a program to generate a plate
number.*/

public class S_25 {

	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() % 3 * 10);
		int number3 = (int) (Math.random() % 5 * 10);
		int number4 = (int) (Math.random() % 7 * 10);

		int string1 = (int) (Math.random() % 5 * 25) + 65;
		int string2 = (int) (Math.random() % 7 * 25) + 65;
		int string3 = (int) (Math.random() % 11 * 25) + 65;

		char ch1 = (char) string1;
		char ch2 = (char) string2;
		char ch3 = (char) string3;

		System.out.println(
				"The vehicle plate number is " + number1 + number2 + number3 + number4 + "-" + ch1 + ch2 + ch3);
	}

}
