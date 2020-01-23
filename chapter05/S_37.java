package bolum05;

import java.util.Scanner;

public class S_37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of decimal value: ");
		int decimal = input.nextInt();

		int value = decimal;
		String output = "";
		while (value != 0) {
			int single = value % 2;
			output = single + output;
			value /= 2;
		}
		System.out.println(decimal + "'s binary representation is " + output);
		input.close();
	}

}
