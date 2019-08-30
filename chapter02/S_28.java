package bolum02;

import java.util.Scanner;

public class S_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number 0 and 1000: ");
		int number = input.nextInt();

		int digit1 = number % 10;
		int remainingnumber = number / 10;
		int digit2 = remainingnumber % 10;
		int remaniningnumber = remainingnumber / 10;
		int digit3 = remaniningnumber % 10;

		int sum = (digit1 + digit2 + digit3);
		System.out.println(" The sum of all digits " + sum);

		input.close();

	}

}
