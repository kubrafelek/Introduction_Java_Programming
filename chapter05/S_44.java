package bolum05;

import java.util.Scanner;

public class S_44 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a short integer: ");
		int value = input.nextInt();

		String output = "";

		for (int i = 0; i < 16; i++) {
			int bit = value & 1;
			output = bit + output;
			value = value >> 1;
		}
		
		System.out.println("The bits are " + output);

		input.close();
		
		
	}

}
