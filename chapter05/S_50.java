package bolum05;

import java.util.Scanner;

public class S_50 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();

		int numberOfUpper = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				numberOfUpper++;
		}

		System.out.println("The number of upper case letters is " + numberOfUpper);
		input.close();
	}

}
