package bolum05;

import java.util.Scanner;

public class S_38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of decimal value: ");
		int decimal = input.nextInt();

		int value = decimal;
		String output = "";
		while (decimal != 0) {
			int octal = value % 8;
			output = octal + output;
			value /= 8;
		}
		System.out.println(decimal + "'s decimal represention is " + output);
		input.close();
	}

}
