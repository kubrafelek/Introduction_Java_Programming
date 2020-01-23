package bolum03;

import java.util.Scanner;

public class GSE_S_2 {

	public static void main(String[] args) {
		int number1 = (int) System.currentTimeMillis() % 10;
		int number2 = (int) System.currentTimeMillis() * 7 % 10;
		int number3 = (int) System.currentTimeMillis() * 13 % 10;

		Scanner input = new Scanner(System.in);

		System.out.println("What is the " + number1 + " * " + number2 + " * " + number3 + " ?");

		int answer = input.nextInt();

		System.out
				.println(number1 + " * " + number2 + " * " + number3 + " = " + (number1 * number2 * number3 == answer));

		input.close();
	}

}
